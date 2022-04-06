import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        BancAccount ba = new BancAccount(new int[]{100,1000,10,10000,100000});
        ba.formatTo(new Formatter(),1,8,1);
    }
}
