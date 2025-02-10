package Observer.subjects;

import Observer.observers.Observer;

public interface Subject {
    void follow(Observer observer);
    void unfollow(Observer observer);
    void notifyObservers();
}
