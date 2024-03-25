package Exercise2;

public class Airplane implements Flight {

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
    public void fly() {

    }
}
