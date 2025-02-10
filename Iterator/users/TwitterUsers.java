package Iterator.users;

import Iterator.user.User;

import java.util.ArrayList;
import java.util.List;

public class TwitterUsers {
    private List<User> users;

    public TwitterUsers() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public List<User> getUsers() {
        return this.users;
    }
}
