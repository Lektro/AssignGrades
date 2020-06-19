import java.util.Arrays;
import java.util.Scanner;

public class ScoreTracker {
    public int numberOfStudents;
    public String[] scoreValues;
    public char grade;

    public static void main(String[] args) {
        ScoreTracker st = new ScoreTracker();   // Declare st variable and create a new ScoreTracker Class instance
        st.getUserInput();                      // Call getUserInput method
        st.setValuesToArray();                  // Call setValuesToArray method
        System.out.println("The highest score found: " + st.findMaxPoints(st.scoreValues));     // Prints out the result of Method findMaxPoints
        //st.assignLetterToPoints();
        //st.outputGrades();
    }

    private void getUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the amount of students: ");
        String inputStudents = sc.nextLine();
        this.numberOfStudents = Integer.parseInt((inputStudents));
        System.out.println("Total amount of students: " + numberOfStudents);

        System.out.println("Please enter all their scores:  ");
        String inputScoreString = sc.nextLine();
        this.scoreValues = (inputScoreString.split(" "));
        System.out.println("Score value's are: " + Arrays.toString(scoreValues));
    }

    private void setValuesToArray() {
        int[] array = new int[numberOfStudents];
        int size = array.length;
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt((scoreValues[i]));
            System.out.println(array[i]);
        }
    }

    private int findMaxPoints(String[] points) {
        Arrays.sort(points);
        return Integer.parseInt(points[points.length - 1]);
    }
/*
    private void assignLetterToPoints() {
        if (findMaxPoints(Array >= -5) {
            grade = 'A';
        } else if  (findMaxPoints(scoreValues) >= -10) {
            grade = 'B';
        } else {
            grade = 'F';
        }
        System.out.println("Grade is: " +grade);
    }

 */
}
