import java.io.IOException;
import java.util.ArrayList;
import java.util.Formattable;
import java.util.Formatter;

public class BancAccount implements Formattable {
    int [] balance = new int[5];
    BancAccount(int[] value){
        for(int i=0;i<value.length;i++){
            balance[i] = value[i];
        }
    }


    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision) {
        Appendable a = formatter.out();
        for(int i=0;i<balance.length;i++){
            String str = String.valueOf(balance[i]);
            while (str.length()<width){
                str =" " + str;
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
