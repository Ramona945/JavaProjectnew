package AnimalRescuer;

public class Food {

    private String name;
    private float foodPrice;
    private double quantity;
    private boolean availability;
    private String taste;
    private String color;
    private float weight;
    private String origin;


    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public float getFoodPrice(){
        return foodPrice;
    }
    public void setFoodPrice(float foodPrice){
        this.foodPrice = foodPrice;
    }

    public double getQuantity(){
        return quantity;
    }
    public void setQuantity(double quantity){
        this.quantity = quantity;
    }

    public boolean getAvailability(){
        return availability;
    }
    public void setAvailability( boolean availability){
        this.availability = availability;
    }

    public String getTaste() {
        return taste;
    }
    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
