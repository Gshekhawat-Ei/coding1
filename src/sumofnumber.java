import java.util.Scanner;

 class SumOfNumbers {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the last number");
        int num = scan.nextInt();
        int sum = 0;
        SumOfNumbers(num,sum);
    }
    public static void SumOfNumbers(int num,int sum){
        for (int i =1; i <= num; i++){
            sum = sum +i;
        }
        System.out.println("Total sum:" +sum);
    }
}
