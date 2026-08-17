import java.util.Scanner;

public class Search_for_a_Keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String feedback = sc.nextLine();
        String keyword = sc.nextLine();

        if (feedback.isEmpty() || !feedback.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid Feedback Message");
        } else if (keyword.isEmpty() || !keyword.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid Keyword");
        } else if (feedback.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("Keyword Found");
        } else {
            System.out.println("Keyword Not Found");
        }

        sc.close();
    }
}