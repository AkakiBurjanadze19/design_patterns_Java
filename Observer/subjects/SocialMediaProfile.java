package Observer.subjects;

import Observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaProfile implements Subject {
    private String firstName;
    private String lastName;
    private int age;
    private List<Observer> followers;

    public SocialMediaProfile(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.followers = new ArrayList<>();
    }

    @Override
    public void follow(Observer observer) {
        this.followers.add(observer);
    }

    @Override
    public void unfollow(Observer observer) {
        this.followers.removeIf(f -> f.equals(observer));
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.followers) {
            observer.update(this.firstName);
        }
    }

    public String getFirstName() {
        return this.firstName;
    }
}
