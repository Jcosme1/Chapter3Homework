package Exercise1;

public class Chicken extends FarmAnimal{
    private String sound;
    public Chicken(String name, String gender, double weight, int age, String sound){
        super(name,gender,weight,age);
        this.sound = sound;

    }

//    public Exercise1.Chicken(){
//
//    }
    public String getSound(){
        return "Cluck cluck";
    }
    public void setSound(String sound){
        this.sound = sound;
    }
    public String feedLoadingSchedule(){
        return getName() + ": " +"8am-4pm" ;
    }

    @Override
    public String toString(){
        return "Chicken " +sound +super.toString();
    }
}
