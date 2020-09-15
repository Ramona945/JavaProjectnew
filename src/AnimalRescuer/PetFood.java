package AnimalRescuer;

import java.security.KeyStore;

public class PetFood {

    private String name = " American Journey";
    private float foodPrice = 50;
    private double quantity = 80;
    private boolean availability = true;

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

}
