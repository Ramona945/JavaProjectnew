package AnimalRescuer;

public class Veterinarian extends Human {


   private String specialist;
   private boolean bald;



   public String getSpecialist(){
      return specialist;
   }
   public void setSpecialist(String specialist){
      this.specialist = specialist;
   }

   public boolean isBald(){
      return bald;
   }
   public void setBald(boolean bald) {
      this.bald = bald;
   }

   public void clientConsult (){
      System.out.println(" Consulting the client... ");
   }

   @Override
   public void eat() {
      System.out.println();
   }

   @Override
   public void sleep() {
      System.out.println("Sleeping restlessly...");

   }

   @Override
   public void think() {
      System.out.println("Thinking...");
   }

   @Override
   public void speak() {
      System.out.println("Talking loudly... ");

   }
   public void work(){
      System.out.println("Working usually");
   }







}
