import java.util.Scanner;

public class CustomerName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        if (name.isEmpty() || name.length() > 50)
            System.out.println("Invalid Customer Name");
        else {
            System.out.println("Customer Name:");
            System.out.println(name);
        }
        sc.close();
    }
}