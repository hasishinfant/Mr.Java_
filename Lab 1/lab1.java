import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        int[] attendance = new int[7];

        System.out.println("Enter attendance for 7 days (1=Present, 0=Absent):");

        for (int i = 0; i < 7; i++) {
            while (true) {
                System.out.print("Day " + (i + 1) + ": ");
                int val = sc.nextInt();

                if (val == 0 || val == 1) {
                    attendance[i] = val;
                    break;
                } else {
                    System.out.println("Invalid input! Enter 0 or 1 only.");
                }
            }
        }

        int presentDays = 0;

        for (int day : attendance) {
            presentDays += day;
        }

        int absentDays = 7 - presentDays;

        double attendancePercentage = (presentDays / 7.0) * 100;

        boolean eligible = attendancePercentage >= 90;

        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
        System.out.println("Absent Days: " + absentDays);

        if (eligible) {
            System.out.println("Status: Eligible for Incentive");
        } else {
            System.out.println("Status: Not Eligible for Incentive");
        }

        sc.close();
    }
}