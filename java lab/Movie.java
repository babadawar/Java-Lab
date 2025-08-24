import java.util.Scanner;

class Movie {
    String name, director;
    int year;
    double rating;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        name = sc.nextLine();
        System.out.print("Enter Director: ");
        director = sc.nextLine();
        System.out.print("Enter Year: ");
        year = sc.nextInt();
        System.out.print("Enter Rating: ");
        rating = sc.nextDouble();
    }

    void display() {
        System.out.println(name + " (" + year + ") - Dir: " + director + " , Rating: " + rating);
    }

    boolean isAbove(double threshold) {
        return rating > threshold;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie m1 = new Movie();
        m1.input();
        m1.display();
        System.out.print("Enter threshold: ");
        double t = sc.nextDouble();
        if (m1.isAbove(t)) System.out.println("Above Threshold");
        else System.out.println("Below Threshold");
    }
}
