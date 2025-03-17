package com.user;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Stefan", "e7df7cd2ca07f4f1ab415d457a6e1c13", 1, "stefan@nuexist.ro", LocalDate.of(2004, 6, 9));
        User u2 = new User("Mihai", "d577273ff885c3f84dadb8578bb41399", 2, "mihai@nuexist.ro", LocalDate.of(2004, 7, 10));
        if(u1.Login("Stefan", "e7df7cd2ca07f4f1ab415d457a6e1c13")) {
            Post p1 = new Post("Stefan", LocalDate.of(2021, 6, 9), "aksgasgfdahsgjahsfdg==");
            p1.post();
        }
        if(u2.Login("Mihai", "d577273ff885c3f84dadb8578bb41399")) {
            Post p2 = new Post("Mihaii", LocalDate.of(2021, 6, 10), "aksgasgfdahsgjahsfeeg==");
            p2.post();
        }
    }
}