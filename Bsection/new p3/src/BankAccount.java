import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;

public class BankAccount implements Formattable {
    int [] bankBalance = new int[5];
    BankAccount(int [] a){
        for(int i=0;i<a.length;i++){
            bankBalance[i] = a[i];
        }
    }

    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision) {
        Appendable a = formatter.out();
        for(int i=0;i<bankBalance.length;i++){
            String str = String.valueOf(bankBalance[i]);
            while(str.length()<width){
                str = " " + str;
            }
            try {
                a.append(str);
            } catch (IOException e) {
                e.printStackTrace();
            }





            System.out.println(str);
        }
    }
}