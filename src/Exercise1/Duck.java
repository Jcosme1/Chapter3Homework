package Exercise1;

public class Duck extends FarmAnimal{

    private String sound;

    public Duck(String name, String gender, double weight, int age, String sound){
        super(name, gender, weight, age);
        this.sound = "Quack quack";
    }


    public String getSound(){
        return "Quack quack";
    }
    public String feedLoadingSchedule(){
        return getName() + ": " +"8am-12pm-6pm" ;
    }
    @Override
    public String toString(){
        return "Duck " +sound +super.toString();
    }
}
