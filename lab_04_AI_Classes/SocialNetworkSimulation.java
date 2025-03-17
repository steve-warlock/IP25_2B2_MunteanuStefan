import java.time.LocalTime;
import java.util.*;

// Interfață pentru elementele afișabile în feed
interface Displayable {
    void display();
}

// Clasă abstractă pentru entitățile comune
abstract class Entity {
    protected int id;
    protected LocalTime createdAt;

    public Entity(int id, LocalTime createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public LocalTime getCreatedAt() {
        return createdAt;
    }
}

// Clasă utilizator
class User extends Entity {
    private String name;
    private String email;
    private List<User> friends;

    public User(int id, String name, String email, LocalTime createdAt) {
        super(id, createdAt);
        this.name = name;
        this.email = email;
        this.friends = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User user) {
        friends.add(user);
    }

    public void removeFriend(User user) {
        friends.remove(user);
    }

    public void postContent(Post post) {
        System.out.println(name + " a postat: " + post.getContent() + " la ora " + post.getCreatedAt());
    }
}

// Clasă postare
class Post extends Entity implements Displayable {
    private User author;
    private String content;
    private List<String> likes;
    private List<Comment> comments;

    public Post(int id, User author, String content, LocalTime createdAt) {
        super(id, createdAt);
        this.author = author;
        this.content = content;
        this.likes = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    public List<String> getLikes() {
        return likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addLike(User user) {
        likes.add(user.getName());
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public void display() {
        System.out.println(author.getName() + " a postat: " + content + " la ora " + createdAt);
        System.out.println("Like-uri: " + likes);
        System.out.println("Comentarii:");
        for (Comment comment : comments) {
            comment.display();
        }
    }
}

// Clasă comentariu
class Comment extends Entity implements Displayable {
    private User author;
    private String content;

    public Comment(int id, User author, String content, LocalTime createdAt) {
        super(id, createdAt);
        this.author = author;
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println(author.getName() + " a comentat: " + content + " la ora " + createdAt);
    }
}

// Clasă mesaj
class Message extends Entity {
    private User sender;
    private User receiver;
    private String content;

    public Message(int id, User sender, User receiver, String content, LocalTime createdAt) {
        super(id, createdAt);
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public void display() {
        System.out.println("Mesaj de la " + sender.getName() + " către " + receiver.getName() + ": " + content + " la ora " + createdAt);
    }
}

// Clasă grup
class Group extends Entity {
    private String name;
    private List<User> members;

    public Group(int id, String name, LocalTime createdAt) {
        super(id, createdAt);
        this.name = name;
        this.members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getMembers() {
        return members;
    }

    public void addMember(User user) {
        members.add(user);
    }

    public void displayMembers() {
        System.out.println("Membrii grupului " + name + " (creat la ora " + createdAt + "):");
        for (User member : members) {
            System.out.println(member.getName());
        }
    }
}

// Clasă notificare
class Notification extends Entity {
    private User user;
    private String type;
    private String content;
    private boolean read;

    public Notification(int id, User user, String type, String content, LocalTime createdAt) {
        super(id, createdAt);
        this.user = user;
        this.type = type;
        this.content = content;
        this.read = false;
    }

    public User getUser() {
        return user;
    }

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public boolean isRead() {
        return read;
    }

    public void markAsRead() {
        read = true;
    }

    public void display() {
        System.out.println("Notificare pentru " + user.getName() + ": " + content + " (Tip: " + type + ", Citită: " + read + ") la ora " + createdAt);
    }
}

// Clasă Factory pentru postări
class PostFactory {
    public static Post createPost(int id, User author, String content, LocalTime createdAt) {
        return new Post(id, author, content, createdAt);
    }
}

// Simulare
public class SocialNetworkSimulation {
    public static void main(String[] args) {
        // Creare utilizatori
        LocalTime now = LocalTime.now();
        User alice = new User(1, "Alice", "alice@email.com", now);
        User bob = new User(2, "Bob", "bob@email.com", now);

        // Adăugare și eliminare prieteni
        alice.addFriend(bob);
        bob.addFriend(alice);
        System.out.println("Prietenii lui Alice: " + alice.getFriends().stream().map(User::getName).toList());
        alice.removeFriend(bob);
        System.out.println("Prietenii lui Alice după eliminare: " + alice.getFriends().stream().map(User::getName).toList());

        // Creare postare și interacțiuni
        Post post = PostFactory.createPost(1, alice, "Salutare, lume!", now);
        alice.postContent(post);

        post.addLike(bob);
        System.out.println("Like-uri pentru postare: " + post.getLikes());

        Comment comment = new Comment(1, bob, "Bună postare!", now);
        post.addComment(comment);
        System.out.println("Comentarii pentru postare:");
        post.display();

        // Mesaje
        Message message = new Message(1, alice, bob, "Salut, Bob!", now);
        message.display();

        // Grupuri
        Group group = new Group(1, "Java Enthusiasts", now);
        group.addMember(alice);
        group.addMember(bob);
        group.displayMembers();

        // Notificări
        Notification notification = new Notification(1, alice, "Like", "Bob a dat like la postarea ta.", now);
        notification.display();
        notification.markAsRead();
        System.out.println("Notificare citită: " + notification.isRead());
    }
}