import java.util.Scanner;

class EvenOddBitwise {
    static boolean isEven(int n) { return (n & 1) == 0; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println(n + " is " + (isEven(n) ? "Even" : "Odd"));
    }
}
