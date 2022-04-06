public class Main {
    public static void main(String[] args) {
        Sequence a = new Sequence();
        Sequence b = new Sequence();

        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        Sequence se = new Sequence();
        se = a.append(b);
        se.show();

    }
}
