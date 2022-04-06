import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main extends Thread{
    String filename;
    private int c = 0;
    Main(String fn){
        filename = fn;
    }

    public void run(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String str;
            while ((str = reader.readLine()) != null){
                c++;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i) == ' '){
                        c++;
                    }
                }
            }
            System.out.println(filename + " : " + c );
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
