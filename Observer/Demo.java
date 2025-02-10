package Observer;

import Observer.observers.Observer;
import Observer.observers.Follower;
import Observer.subjects.SocialMediaProfile;

public class Demo {
    public static void main(String[] args) {
        SocialMediaProfile profile1 = new SocialMediaProfile("Nick", "Smith", 23);

        Observer follower1 = new Follower("Niko", "Belik", 35);
        Observer follower2 = new Follower("Elon", "Musk", 53);
        Observer follower3 = new Follower("Sam", "Altman", 39);

        profile1.follow(follower1);
        profile1.follow(follower2);
        profile1.follow(follower3);

        profile1.notifyObservers();
    }
}
