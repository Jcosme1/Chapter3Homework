package Exercise1;

public abstract class FarmAnimal {
//    fields
    private String name;
    private String gender;
    private double weight;
    private int age;

//constructor
    public FarmAnimal(String name, String gender, double weight, int age){
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    public FarmAnimal(){

    }
//    getters
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public double getWeight(){
        return weight;
    }
    public int getAge(){
        return age;
    }
// setters
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    //kept thinking I could add a body to this method but you can't in java
    public abstract String feedLoadingSchedule();


    public String toString(){
//        return "Farm animal information: \nName: " + name + "\nGender: " + gender + "\nWeight: " + weight + " lb"+"\nage: " + age+ " years old";
//        return  "Name=" + name + " Gender=" + gender + " Weight=" + weight + " lb "+"age=" + age+ " years old ";
        return " [name=" +name +"," +" gender=" +gender + ", " + "weight=" + weight +"lb,"+ " age=" +age +"]";
    }

}
