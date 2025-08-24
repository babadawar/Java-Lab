interface ArrayOperations {
    void insert(int index, int value);
    int search(int value);
    void display();
}

class ArrayManager implements ArrayOperations {
    int[] arr = new int[5];
    public void insert(int index, int value) {
        arr[index] = value;
    }
    public int search(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }
    public void display() {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayManager m = new ArrayManager();
        try {
            m.insert(2, 50);
            m.display();
            System.out.println("Found at: " + m.search(50));
            m.insert(10, 100); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Wrong index access!");
        }
    }
}
