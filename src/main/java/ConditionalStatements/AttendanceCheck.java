package ConditionalStatements;

import java.util.Scanner;

//A student will not be allowed to sit in exam if his/her attendence is less than 75%.
// Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.
//b Modify the above question to allow
// student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
public class AttendanceCheck {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Classes Attended");
        double classesAttended = sc.nextDouble();
        System.out.println("Enter Number of Classes Held");
        double classesHeld = sc.nextDouble();
        double percentage = (classesAttended / classesHeld) * 100;
        char medicalIssue = sc.next().charAt(0);
        System.out.println("Enter if Student have any medical issue Y / N");
        if (percentage >= 75) {
            System.out.println("Student is allowed to Write His/Her Exam");
        } else if (medicalIssue == 'Y') {
            System.out.println("Student has medical issue allow the user for Exam");
        } else {
            System.out.println("Student is not allowed to write His/Her Exam");
        }
    }
}
