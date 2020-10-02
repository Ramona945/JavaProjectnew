package AnimalRescuer;

public class Girl extends Human {


    private double money;
    private String hairColor;




    public double getMoney(){
        return money;
    }
    public void setMoney( double money){
        this.money = money;
    }

    public String getHairColor(){
        return hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void sing(){
        System.out.println(" Singing...");
    }
    public void jump(){
        System.out.println(" Jumping...");
    }


    @Override
    public void eat() {
        System.out.println("Eating little...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping a few hours...");

    }

    @Override
    public void think() {
        System.out.println("Thinking a lot...");

    }

    @Override
    public void speak() {
        System.out.println("Speaking slowly...");

    }
}
