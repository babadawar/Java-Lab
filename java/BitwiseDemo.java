import java.util.Scanner;

class BitwiseDemo {
    static String bin(int x) {
        String s = Integer.toBinaryString(x);
        return String.format("%32s", s).replace(' ', '0'); // 32-bit view
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers A and B: ");
        int A = sc.nextInt(), B = sc.nextInt();

        System.out.println("A (dec): " + A + " | A (bin): " + bin(A));
        System.out.println("B (dec): " + B + " | B (bin): " + bin(B));

        int and = A & B, or = A | B, xor = A ^ B, notA = ~A, notB = ~B;
        int shl = A << 1, shr = A >> 1;

        System.out.println("\nA & B  = " + and + " | " + bin(and));
        System.out.println("A | B  = " + or  + " | " + bin(or));
        System.out.println("A ^ B  = " + xor + " | " + bin(xor));
        System.out.println("~A     = " + notA + " | " + bin(notA));
        System.out.println("~B     = " + notB + " | " + bin(notB));
        System.out.println("A << 1 = " + shl + " | " + bin(shl));
        System.out.println("A >> 1 = " + shr + " | " + bin(shr));
    }
}
