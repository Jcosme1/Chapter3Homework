package Exercise2and3;

import java.util.ArrayList;

public class ThingsThatFly {
    public static void main(String[] args) {
        ArrayList<Flight> movement = new ArrayList<>();

        movement.add(new Airplane("Boeing 747",2013));
        movement.add(new Bird("Eagle"));
        movement.add(new Bird("Hummingbird"));



        //could se a for loop but since I just need to go through the arraylist without a
        //specific start and end index foreach loop makes more sense
        for(Flight flying:movement){
            System.out.print(flying);
            flying.fly();
        }
//        System.out.println(airplane1);

    }
}
