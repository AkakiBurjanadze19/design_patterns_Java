package Iterator;

import Iterator.iterator.UserIterator;
import Iterator.user.User;
import Iterator.users.TwitterUsers;

public class Demo {
    public static void main(String[] args) {
        TwitterUsers twitterUsers = new TwitterUsers();

        User user1 = new User("Nick", "Smith", 19);
        User user2 = new User("Niko", "Belik", 30);
        User user3 = new User("Adam", "Williams", 25);
        User user4 = new User("Nathan", "Jones", 16);
        User user5 = new User("Elon", "Musk", 53);

        twitterUsers.addUser(user1);
        twitterUsers.addUser(user2);
        twitterUsers.addUser(user3);
        twitterUsers.addUser(user4);
        twitterUsers.addUser(user5);

        UserIterator iterator = new UserIterator(twitterUsers);

//        System.out.println(iterator.getNext().getFirstName());
//        System.out.println(iterator.getNext().getFirstName());
//        System.out.println(iterator.getNext().getFirstName());
//        System.out.println(iterator.getNext().getFirstName());
//        System.out.println(iterator.getNext().getFirstName());

        while (iterator.hasNext()) {
            User user = iterator.getNext();

            System.out.println("----------");
            System.out.println("First name: " + user.getFirstName());
            System.out.println("Last name: " + user.getLastName());
            System.out.println("Age: " + user.getAge());
            System.out.println("----------");
        }
    }
}
