import java.util.Scanner;

         class MultiplicationOfNumber {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the number");
                int num = scan.nextInt();
                System.out.println("Multiplication of "+num+":");
                multiplicationOfNumber(num);


            }
            public static void multiplicationOfNumber(int num){
                for(int i=1; i<=10; i++) {
                    int res = num*i;
                    System.out.println(res);
                }
            }
        }
