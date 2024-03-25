package Exercise2and3;

public class Bird implements Flight,Movement {
    private String type;




    //constructor


    public Bird(String type){
        this.type = type;
    }
    //setters and getters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println("I'm a bird who flaps wings to fly.");
    }

    @Override
    public void jump() {
        System.out.println("I jump by leaping from my feet");
    }

    @Override
    public void walk() {
        System.out.println("I walk on my feet");
    }
    public String toString(){
        return "Bird " +"[type=" + type +"]: ";
    }
}
