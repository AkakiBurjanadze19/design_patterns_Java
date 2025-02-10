package Iterator.iterator;

import Iterator.user.User;
import Iterator.users.TwitterUsers;

import java.util.List;

public class UserIterator {
    private List<User> users;
    private int currentPosition = 0;

    public UserIterator(TwitterUsers twitterUsers) {
        this.users = twitterUsers.getUsers();
    }

    public boolean hasNext() {
        return this.currentPosition < this.users.size();
    }

    public User getNext() {
        if (this.hasNext()) {
            return this.users.get(this.currentPosition++);
        }

        return null;
    }
}
