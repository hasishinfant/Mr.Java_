import java.util.Scanner;

public class Words_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String feedback = sc.nextLine();

        if (feedback.isEmpty() || !feedback.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid Feedback Message");
        } else {
            String[] words = feedback.split(" ");
            int count = 0;

            for (String word : words) {
                if (!word.isEmpty())
                    count++;
            }

            System.out.println("Words = " + count);
        }

        sc.close();
    }
}