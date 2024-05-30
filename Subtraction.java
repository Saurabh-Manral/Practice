public class Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("The difference of " + num1 + " and " + num2 + " is: " + new Subtraction().subtract(num1, num2));
    }

    public int subtract(int a , int b) {
        return a - b;
    }
}