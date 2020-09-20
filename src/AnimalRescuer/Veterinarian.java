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
   public void talk (){
      System.out.println(" Talking... ");
   }
   public void work (){
      System.out.println(" Working... ");
   }







}
