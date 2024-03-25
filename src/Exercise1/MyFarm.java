package Exercise1;

import java.util.ArrayList;

public class MyFarm {




    public static void main(String[] args) {
        ArrayList<FarmAnimal> animals = new ArrayList<>();
        //objects

        FarmAnimal duck1 = new Duck("Donald", "Male", 3.2, 5,"Quack quack");
        FarmAnimal duck2 = new Duck("Cheese", "female", 3.6, 5, "Quack quack");
        Cow cow = new Cow("Molly","female",1600,3,"mo");
        Chicken chicken = new Chicken("Amelia","female", 1.8, 4,"Cluck cluck");
        Chicken chicken2 = new Chicken("Albert", "Male", 1.6, 2, "Cock-a-Doodle-doo");
        Chicken chicken1 = new Chicken("Dixie", "female", 1.7, 4,"Cluck cluck");
        chicken2.setSound("Cock-a-Doodle-doo");
        animals.add(duck1);
        animals.add(duck2);
        animals.add(cow);
        animals.add(chicken2);
        animals.add(chicken);
        animals.add(chicken1);



//        animals.add(duck);
//        animals.add(duck.feedLoadingSchedule());
//        Exercise1.Chicken chicken = new Exercise1.Chicken("",);
        System.out.println("Animal information:");
//        System.out.println(animals);
        for(FarmAnimal test : animals){
            System.out.println(test.toString());
        }
        //prints out the feed times for the animals
        System.out.println("\nFeeding times:");
        for (FarmAnimal animal : animals){
            System.out.println(animal.feedLoadingSchedule());
        }
    }
}
