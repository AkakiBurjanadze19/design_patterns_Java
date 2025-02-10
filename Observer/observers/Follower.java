package Observer.observers;

public class Follower implements Observer {
    private String firstName;
    private String lastName;
    private int age;

    public Follower(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public void update(String authorName) {
        System.out.println("Hello " + this.firstName + ", " + authorName + " has created a new post!");
    }
}
