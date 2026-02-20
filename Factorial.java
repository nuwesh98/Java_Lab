import java.util.Scanner;

class FactorialProgram {

    int calculateFact(int n) {
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int value = sc.nextInt();

        FactorialProgram obj = new FactorialProgram();

        int result = obj.calculateFact(value);

        System.out.println("Factorial of " + value + " is: " + result);
    }
}
