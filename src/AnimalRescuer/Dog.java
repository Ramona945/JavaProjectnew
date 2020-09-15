package AnimalRescuer;

public class Dog {

    private String name = "Athos";
    private Boolean isMale = true;
    private int healthCondition = 8;
    private float feelingHungry = 6;
    private float stateOfMind = 9;
    private String favoriteFood = "American Journey";
    private String favoriteActivity = "Find the ball";

    public String getName(){
        return name;
    }
    public void setName ( String name){
        this.name = name;
    }

    public Boolean getIsMale(){
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

    public String getFavoriteFood(){
        return favoriteFood;
    }
    public void setFavoriteFood( String favoriteFood){
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteActivity(){
        return favoriteActivity;
    }
    public void setFavoriteActivity( String favoriteActivity){
        this.favoriteActivity = favoriteActivity;
    }






    public void run(){
       System.out.println( "Runing...");
    }
    public void play(){
        System.out.println("Looking for the ball ..");
    }



}

