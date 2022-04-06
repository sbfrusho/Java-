import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main extends Thread{
    int c = 0;
    String word,filename;
    Main(String fn){
        filename = fn;
    }
    public void run(){

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String s;
            while ((s = reader.readLine()) != null){
                c++;
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i) == ' '){
                        c++;
                    }
                }
            }
            System.out.println(filename+ " : " +c);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
