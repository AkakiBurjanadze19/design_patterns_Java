package Observer.social_media_app_example;

import Observer.social_media_app_example.subjects.User;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Elon", "Musk", 53);
        User user2 = new User("Sam", "Altman", 39);
        User user3 = new User("Nick", "Smith", 23);
        User user4 = new User("Adam", "Jones", 27);
        User user5 = new User("Nathan", "Williams", 17);

        user1.follow(user2); // Elon Musk follows Sam Altman
        user1.follow(user3); // Elon Musk follows Nick Smith
        user1.follow(user4); // Elon Musk follows Adam Jones

        user2.follow(user1); // Sam Altman follows Elon Musk
        user2.follow(user3); // Saml Altman follows Nick Smith

        user3.follow(user1); // Nick Smith follows Elon Musk
        user3.follow(user2); // Nick Smith follows Sam Altman
        user3.follow(user4); // Nick Smith follows Adam Jones
        user3.follow(user5); // Nick Smith follows Nathan Williams

        user4.follow(user5); // Adam Jones follows Nathan Williams

        user5.follow(user4); // Nathan Williams follows Adam Jones
        user5.follow(user1); // Nathan Williams follows Elon Musk

        user1.postUpdate();
        System.out.println();

        user2.postUpdate();
        System.out.println();

        user3.postUpdate();
        System.out.println();

        user4.postUpdate();
        System.out.println();

        user5.postUpdate();
    }
}
