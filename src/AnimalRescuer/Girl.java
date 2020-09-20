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
    public void talk(){
        System.out.println("Talking...");
    }




}
