import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Find {
    private String word,filename;
    public Find(String w,String fn){
        word = w;
        filename = fn;
    }

    public void read(){
        BufferedReader reader;

        {
            try {
                reader = new BufferedReader(new FileReader(filename));
                String s;
                while ((s = reader.readLine()) != null){
                    if(s.contains(word)){
                        System.out.println(filename+" : "+s);
                    }
                }
                reader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
