
import java.util.Scanner;

class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        int res = factorialOfNumber(num);
        System.out.println("--->"+res);
    }

    public static int factorialOfNumber(int num) {
        int fact = 1,i=1;
        while (i<= num) {
            fact = fact * i;
            i++;
        }

        return fact;
    }
}

