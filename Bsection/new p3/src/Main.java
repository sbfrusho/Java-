import java.util.ArrayList;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(new int[]{1000,600000,12345,123456,100});
        ba.formatTo(new Formatter(),1,10,1);
    }
}
