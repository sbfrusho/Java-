public class Robot {
    char dir = 'N';
    Point p = new Point(0,0);
    public void turnLeft(){
        if(dir == 'N'){
            dir = 'W';
        }
        else if(dir == 'W'){
            dir = 'S';
        }
        else if(dir == 'S'){
            dir = 'E';
        }
        else {
            dir = 'N';
        }
    }
    public void turnRight(){
        if(dir == 'N'){
            dir = 'E';
        }
        else if(dir == 'W'){
            dir = 'N';
        }
        else if(dir == 'S'){
            dir = 'W';
        }
        else {
            dir = 'S';
        }
    }
    public void move(){
        if(dir == 'N'){
            p.moveN();
        }
        else if(dir == 'W'){
            p.moveW();
        }
        else if(dir == 'S'){
            p.moveS();
        }
        else {
            p.moveE();
        }

    }
    public Point getLocation(){
        return p;
    }
    public String getDirection(){
        return String.valueOf(dir);
    }
}
