import java.util.HashMap;
import java.util.HashSet;

public class SocialMedia {
    private HashMap<String, HashSet<String>> userFollowers;

    public SocialMedia() {
        userFollowers = new HashMap<>();
    }

    public void addFollower(String user, String follower) {
        userFollowers.putIfAbsent(user, new HashSet<>());
        userFollowers.get(user).add(follower);
    }

    public void displayFollowers(String user) {
        System.out.println("Followers of " + user + ":");
        HashSet<String> followers = userFollowers.get(user);
        if (followers != null) {
            for (String follower : followers) {
                System.out.println(follower);
            }
        } else {
            System.out.println("No followers found.");
        }
    }

    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.addFollower("Alice", "Bob");
        socialMedia.addFollower("Alice", "Charlie");
        socialMedia.displayFollowers("Alice");

    }
}
