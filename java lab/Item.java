import java.util.Scanner;

class Item {
    int code, qty;
    String name;
    double price;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Quantity: ");
        qty = sc.nextInt();
        System.out.print("Enter Price per unit: ");
        price = sc.nextDouble();
    }

    double total() { return qty * price; }

    void bill() {
        System.out.println(name + " x " + qty + " = Rs." + total());
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.input();
        i.bill();
    }
}
