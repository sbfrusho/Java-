import java.io.*;
//ques no 4

public class Main {
    public static void main(String[] args)  {
        for(int i=0;i<args.length;i++){
            Test t = new Test(args[0],args[i]);
            t.run();
        }

    }
}
