package Exercise1;

public class Cow extends FarmAnimal {
    private String sound;

    public Cow (String name, String gender, double weight, int age, String sound){
        super(name, gender, weight, age);
        this.sound = "Moooo";
    }


     public String getSound(){
        return "Mooo";
     }

    public String feedLoadingSchedule(){
        return getName() + ": " +"6am-4pm" ;
    }

    //toString method the builds upon the superclass toString method
    @Override
    public String toString(){
        return "Cow " +sound +super.toString();
    }
}
