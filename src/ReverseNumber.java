import java.util.Scanner;
class ReverseNumber {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        reverseNumber(num);
    }
    public static void reverseNumber(int num) {
        while(num>0) {
            int res=num%10;
            System.out.print(res);
            num=num/10;

        }
    }

}
