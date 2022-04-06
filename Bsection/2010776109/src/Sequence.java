import sun.font.CreatedFontTracker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Sequence {
    private ArrayList<Integer>values;
    public Sequence(){
       values = new ArrayList<>();
    }
    public void add(int n){
        values.add(n);
    }
    public String toString(){
        return values.toString();
    }
    public Sequence append(Sequence other){
        Sequence r = new Sequence();
        for(int i=0;i<values.size();i++){
            r.add(values.get(i));
        }

        for(int i=0;i<other.values.size();i++){
            r.add(other.values.get(i));
        }
        return r;
    }
    void show(){
        for (int x:values){
            System.out.print(x+ " ");
        }
    }

    public static void main(String[] args) {
        Sequence a = new Sequence();
        Sequence b = new Sequence();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        Sequence se = new Sequence();
        se = a.append(b);

        se.show();
    }

}

