package AnimalRescuer;

public class Dog extends Animal {



    private String favoriteFood;
    private String favoriteActivity;
    private String fur;
    private float fangs;
    private Boolean snout;
    private int tail;

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

    public String getfur(){
        return fur;
    }
    public void setFur( String fur){
        this.fur = fur;
    }

    public float getFangs(){
        return fangs;
    }
    public void setFangs(float fangs){
        this.fangs = fangs;
    }

    public Boolean getSnout(){
        return snout;
    }
    public void setSnout(Boolean snout){
        this.snout = snout;
    }

    public int getTail(){
        return tail;
    }
    public void setTail( int tail){
        this.tail = tail;
    }




    public void run(){
       System.out.println( "Runing...");
    }


    public void walk(){
        System.out.println("Walking...");
    }
    public void bark(){
        System.out.println("Barking...");
    }
    public void snore(){
        System.out.println("Snoring...");
    }
    public void jump(){

        System.out.println("Jumping...");
    }
    public void sniff(){
        System.out.println("Sniffing...");
    }


    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("zzzzzzzz");

    }

    @Override
    public void scratch() {
        System.out.println("Deep scratches");

    }
    @Override
    public void speak() {
        System.out.println("Ham, Ham");

    }


}

