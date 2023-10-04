import java.util.Scanner;

 class FactoriallOfNumber{
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        int res =factorialOfNumber(num);
    }
    public static int factorialOfNumber(int num) {
        int fact =1;
        for(int i=1; i<=num; i++) {
            fact=fact*1;
        }
        //System.out.println("Result:"+ fact);
        return fact;


    }
}
