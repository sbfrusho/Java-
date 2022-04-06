public class Point {
    int x,y;
    Point(int a,int b){
        x = a;
        y = b;
    }

    public void moveN(){
        x++;
    }
    public void moveS(){
        x--;
    }
    public void moveE(){
        y--;
    }
    public void moveW(){
        y++;
    }
}
