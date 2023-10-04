import java.util.Scanner;

class VowelOrConsoant {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("Enter the character :");
        char ch = scan.next().charAt(0);
        vowelORConsoant(ch);

    }

    public static void vowelORConsoant(char ch) {
        if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'e' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
            System.out.println("Its a vowel");
        } else if (ch != 'A' || ch != 'a' || ch != 'E' || ch != 'e' || ch != 'I' || ch != 'i' || ch != 'O' || ch != 'o' || ch != 'U' || ch != 'u') {
            System.out.println("Its a consoant");
        } else {
            System.out.println("Invaild Input");
        }
    }
}

