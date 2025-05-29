package mood;

import java.util.ArrayList;
import java.util.Scanner;

public class MoodTracker {
    private ArrayList<Mood> moodsList;
    private Scanner scanner;

    public MoodTracker() {
        this.moodsList = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
}
