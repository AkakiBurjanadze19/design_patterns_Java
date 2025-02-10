package Observer.social_media_app_example.subjects;

import Observer.social_media_app_example.observers.Observer;

import java.util.*;

public class User implements Observer {
    private String firstName;
    private String lastName;
    private int age;
    private List<Observer> followers;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.followers = new ArrayList<>();
    }

    public void follow(User user) {
        User self = this;
        user.followers.add(self);
    }

    public void unfollow(User user) {
        User self = this;
        user.removeFollower(self);
    }

    public void addFollower(Observer follower) {
        this.followers.add(follower);
    }

    public void removeFollower(Observer follower) {
        this.followers.remove(follower);
    }

    public void postUpdate() {
        System.out.println(this.firstName + " has created a new post!");

        Queue<User> queue = new LinkedList<>();
        Set<User> visited = new HashSet<>();

        User self = this;
        queue.add(self);
        visited.add(self);

        while (!queue.isEmpty()) {
            User current = queue.poll();
            for (Observer observer : current.followers) {
                if (observer instanceof User) {
                    User follower = (User) observer;
                    if (!visited.contains(follower)) {
                        System.out.println("Hello " + follower.firstName + ", " + current.firstName + " has created a new" +
                                " post!");
                        queue.add(follower);
                        visited.add(follower);
                    }
                }
            }
        }
    }

    @Override
    public void update(String authorName) {
        System.out.println("Hello " + this.firstName + ", " + authorName + " has created a new post!");
    }
}
