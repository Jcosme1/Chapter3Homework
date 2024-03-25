package Exercise2and3;

import java.util.ArrayList;

public class ThingsThatMove {
    public static void main(String[] args) {
        ArrayList<Movement> whatMoves = new ArrayList<>();

        whatMoves.add(new Airplane("Boeing 747",2013));
        whatMoves.add(new Bird("Eagle"));
        whatMoves.add(new Bird("Hummingbird"));


        for(Movement test: whatMoves){
            System.out.println(test);
            test.fly();
            test.walk();
            test.jump();

        }

    }
}
