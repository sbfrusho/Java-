import java.util.ArrayList;

public class Sequence {
    private ArrayList<Integer> values;

    public Sequence(){
        values = new ArrayList<>();
    }

    public void add (int n){
        values.add(n);
    }

    public String toString(){
        return values.toString();
    }

    public Sequence append(Sequence other){
        Sequence s = new Sequence();
        for(int i=0;i<values.size();i++){
            s.add(values.get(i));
        }

        for(int i=0;i<other.values.size();i++){
            s.add(other.values.get(i));
        }
        return s;
    }

    public void show(){
        for(int x:values){
            System.out.print(x+" ");
        }
    }
}


