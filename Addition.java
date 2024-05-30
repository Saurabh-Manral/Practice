import java.util.Scanenr;
public class Addition {
    public static void main(String[] args) {

        Scanner sc = new Scanenr(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
    }
}