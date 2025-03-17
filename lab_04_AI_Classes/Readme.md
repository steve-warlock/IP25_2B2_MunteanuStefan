## Prompt-ul folosit:

Creează un sistem OOP în Java pentru o rețea de socializare, respectând principiile POO (programare orientată pe obiecte) precum încapsulare, moștenire, polimorfism și utilizarea interfețelor și claselor abstracte.

Cerințe generale:

Creează mai multe clase și interfețe pentru a modela entitățile rețelei sociale.
Folosește o interfață pentru elementele care pot fi afișate în feed (ex: postări, comentarii).
Creează o clasă abstractă pentru elementele comune tuturor entităților (ex: identificator, dată).
Implementează cel puțin o metodă importantă în fiecare clasă.
Utilizează polimorfism pentru a trata diferite tipuri de conținut (postări, comentarii).
Definiți metode pentru gestionarea utilizatorilor, prietenilor, postărilor și interacțiunilor.
Clase și relații:

User
Atribute: ID, nume, email, listă de prieteni, profil.
Metode: adăugare/ștergere prieteni, postare conținut, interacțiuni (like, comentarii, mesaje).
Post
Atribute: ID, autor, conținut, data și ora, listă de like-uri și comentarii.
Metode: adăugare/ștergere like-uri, adăugare/ștergere comentarii.
Comment
Atribute: ID, autor, conținut, data și ora.
Metode: editare/ștergere comentariu.
Message
Atribute: ID, expeditor, destinatar, conținut, data și ora.
Metode: trimitere/ștergere mesaj.
Group
Atribute: ID, nume, descriere, membri, administratori.
Metode: adăugare/ștergere membri, postare de conținut.
Notification
Atribute: ID, utilizator, tip, conținut, data și ora.
Metode: marcare ca citită/necitită.
Feed
Metodă pentru afișarea postărilor și interacțiunilor recente.
Alte cerințe:

Implementează un design pattern unde este posibil (ex: Factory pentru crearea postărilor, Observer pentru notificări).
Demonstrează utilizarea moștenirii și polimorfismului în interacțiunile dintre entități.
Simulează un scenariu real prin crearea de obiecte și apelarea metodelor lor.
Generează codul Java corespunzător acestei structuri.

## Modificari cerute

modifica-mi tipul de date de la entity createAt de la string la LocalTime