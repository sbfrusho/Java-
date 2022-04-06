public class Main {
    public static void main(String[] args) {
        for(int i=1;i< args.length;i++){
            Find f = new Find(args[0],args[i]);
            f.read();
        }
    }
}
