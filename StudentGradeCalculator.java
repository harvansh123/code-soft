import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        // Display a welcome message
        try (Scanner sc = new Scanner(System.in)) {
            // Display a welcome message
            System.out.println(extracted());
            // Prompt user to enter number of subjects
            System.out.println("Enter number of subjects:");
            int ns = sc.nextInt();
            int total = 0;
            // Loop through each subject to input marks
            for (int i = 1; i <= ns; i++) {
                System.out.println("Enter marks obtained in subject " + i + ":");
                int marks = sc.nextInt();
                total += marks; // Add marks to total
            }   // Calculate average percentage
            double averP = (double) total / ns;
            char Grade;
            // Determine grade based on average percentage
            if (averP >= 90) {
                Grade = 'O'; // Outstanding
            } else if (averP >= 80) {
                Grade = 'A'; // Excellent
            } else if (averP >= 70) {
                Grade = 'B'; // Very Good
            } else if (averP >= 60) {
                Grade = 'C'; // Good
            } else if (averP >= 50) {
                Grade = 'D'; // Above Average
            } else if (averP >= 40) {
                Grade = 'E'; // Average
            } else {
                Grade = 'F'; // Fail
            }   // Display total marks, average percentage, and grade
            System.out.println("Total Marks Scored: " + total);
            System.out.println("Average Percentage Gained: " + averP + "%");
            System.out.println("Grade: " + Grade);
            // Close the Scanner object at the end
        }
    }

    // Method to return a welcome message
    private static String extracted() {
        return "Student Grade calculator";
    }
}
