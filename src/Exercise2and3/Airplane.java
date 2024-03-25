package Exercise2and3;

public class Airplane implements Flight,Movement{

    private String model;
    private int yearBuilt;

    //constructor
    public Airplane(String model,int yearBuilt){
        this.model = model;
        this.yearBuilt = yearBuilt;

    }


   //setters and getters
    public String getModel(){
        return model;
    }
    public int getYearBuilt(){
        return yearBuilt;
    }
    public void setModel(String model){
        this.model = model;

    }
    public void setYearBuilt(int yearBuilt){
        this.yearBuilt = yearBuilt;
    }

    @Override
    public void jump() {
        System.out.println("I cannot jump");
    }

    @Override
    public void walk() {
        System.out.println("I tax on my wheels");
    }

    @Override
    public void fly() {

        System.out.println("I'm an airplane that relies on a engine to fly.");
    }
    public String toString(){
        return "Airplane " + "[model=" + model +", year=" + yearBuilt +"]: ";
    }
}
