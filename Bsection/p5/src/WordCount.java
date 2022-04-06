public class WordCount {
    public static void main(String[] args) {

        for(int i=0;i<args.length;i++){
            Main m = new Main(args[i]);
             m.start();
        }
    }
}
