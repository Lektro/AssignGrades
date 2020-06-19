import java.util.Arrays;
import java.util.Scanner;

public class ScoreTracker {
    public int numberOfStudents;
    public String [] scoreValues;

    public static void main(String[] args) {
        ScoreTracker st = new ScoreTracker();
        st.getUserInput();
        st.setValuesToArray();
    }

    private void getUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the amount of students: ");
        String inputStudents = sc.nextLine();
        this.numberOfStudents = Integer.parseInt((inputStudents));
        // System.out.println("value entered was: " + numberOfStudents);

        System.out.println("Please enter all their scores:  ");
        String inputScoreString = sc.nextLine();
        this.scoreValues = (inputScoreString.split(" "));
        // System.out.println("value entered was: " + Arrays.toString(numberOfScores));
    }

    private void setValuesToArray() {

        int [] array = new int[numberOfStudents];
        int size = array.length;
        for (int i = 0; i < size; i++) {
           array[i] = Integer.parseInt((scoreValues[i]));
        }
        System.out.println(Arrays.toString(array));
    }
}
