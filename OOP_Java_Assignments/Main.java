public class Main {
    public static void bookTransport(Transport t) {
        t.bookTicket();
    }
    public static void main(String[] args) {
        Transport t1 = new Bus();
        Transport t2 = new Train();
        Transport t3 = new Flight();
        bookTransport(t1);
        bookTransport(t2);
        bookTransport(t3);
    }
}
