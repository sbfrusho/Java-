import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Test{
    private String word,line;
    public Test(String  w,String l) {
        word = w;
        line = l;
    }

    public void run(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(line));
            String s;
            while ((s = reader.readLine()) != null){
                if(s.contains(word)){
                    System.out.println(line+" :"+s);
                }
            }
            reader.close();
        } catch (Exception e) {
           // e.printStackTrace();
        }
    }
}
