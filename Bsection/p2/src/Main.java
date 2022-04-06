import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Robot r = new Robot();
        System.out.println("Press L to turn left.\nPress R to turn R.\nPress M to move.\nPress D to get direction.\nPress G to get location.\nPress Q to quin");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter key(L,R,M,D,G,Q) : " );
        while (in.hasNext()){
            String s = in.next();
            if(s.equals("L")){
                r.turnLeft();
            }
            else if(s.equals("R")){
                r.turnRight();
            }
            else if(s.equals("M")){
                r.move();
            }
            else if(s.equals("G")){
                Point p = r.getLocation();
                System.out.println("Current Location:\nx: " + p.x+" "+"y: "+p.y);
            }
            else if(s.equals("D")){
                System.out.println("Current Direction: "+r.getDirection());
            }
            else {
                break;
            }
            System.out.print("Enter key(L,R,M,D,G,Q) : ");
        }

    }
}
