package AnimalRescuer;

public class Animal {

    private String name;
    private int age;
    private String color;
    private String size;
    private Boolean isMale;
    private int healthCondition;
    private float feelingHungry;
    private float stateOfMind;
    private int limbs;
    private int weight;

    public String getName(){
        return name;
    }
    public void setName ( String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getSize() {
        return size;
    }
    public void setSize( String size){
        this.size = size;
    }

    public Boolean IsMale(){
        return isMale;
    }
    public void setIsMale( Boolean isMale) {
        this.isMale = isMale;
    }

    public int getHealthCondition(){
        return healthCondition;
    }
    public void setHealthCondition(int healthCondition){
        this.healthCondition = healthCondition;
    }

    public float getFeelingHungry(){
        return feelingHungry;
    }
    public void setFeelingHungry(float feelingHungry){
        this.feelingHungry = feelingHungry;
    }

    public float getStateOfMind(){
        return stateOfMind;
    }
    public void setStateOfMind(float stateOfMind){
        this.stateOfMind = stateOfMind;
    }

    public int getLimbs() {
        return limbs;
    }
    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Eating...");}
    public void sleep(){
        System.out.println("Sleeping...");  }
    public void scratch(){
        System.out.println("Scratching...");}



}
