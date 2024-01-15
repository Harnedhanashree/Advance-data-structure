import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double subject1, subject2, subject3, subject4, subject5, totalMarks, averageMarks, percentage;

        System.out.println("Enter marks for five subjects:");
        System.out.print("Subject 1: ");
        subject1 = scanner.nextDouble();
        System.out.print("Subject 2: ");
        subject2 = scanner.nextDouble();
        System.out.print("Subject 3: ");
        subject3 = scanner.nextDouble();
        System.out.print("Subject 4: ");
        subject4 = scanner.nextDouble();
        System.out.print("Subject 5: ");
        subject5 = scanner.nextDouble();

        totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        averageMarks = totalMarks / 5;
        percentage = (totalMarks / 500) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}
