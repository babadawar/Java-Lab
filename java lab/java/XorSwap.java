import java.util.Scanner;

class XorSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y: ");
        int x = sc.nextInt(), y = sc.nextInt();

        System.out.println("Before: x=" + x + ", y=" + y);

        // Step 1
        x = x ^ y;
        System.out.println("After x=x^y: x=" + x + ", y=" + y);

        // Step 2
        y = x ^ y;
        System.out.println("After y=x^y: x=" + x + ", y=" + y);

        // Step 3
        x = x ^ y;
        System.out.println("After x=x^y: x=" + x + ", y=" + y);

        System.out.println("Swapped: x=" + x + ", y=" + y);
    }
}
