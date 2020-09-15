package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {

        Dog myObject = new Dog();
        myObject.play();
        Girl owner = new Girl();
        PetFood petFood = new PetFood();
        RecreationActivity  activity = new RecreationActivity();
        Veterinarian vet = new Veterinarian();

        myObject.setFeelingHungry(8);
        myObject.setStateOfMind(7);
        petFood.setQuantity(100);
        petFood.setFoodPrice(40);



        System.out.println("Hi, I'm "+ owner.getOwnerName() +", and " + myObject.getName() + " is my dog." + "\n" +
        "I saved him two months ago, being abandoned on the streets. He is an enthusiastic boy," +
        " especially when it comes to his favorite activity; " + activity.getNameActivity() + "." + "\n" + " " +
        "After I gave him a bath, I took him to" + vet.getName() + "," + " who is a very good veterinarian and " + "\n"+
        vet.getSpecialist()+ "." + " I was surprised to find out that he has a state of mind of" + "\n"
        + myObject.getStateOfMind() + " out of 10 and a healt condition of ; " + myObject.getStateOfMind() + " \n" +
        "out of 10. " +
        "Well, I paid quite a lot for the dog's consultation but I am happy that" +
        " I had the necessary resources, having some money put aside " + owner.getMoney()+ " $ " + "\n" +
        "I tried to pay attention to him and give him the best food possible," +
        " his favorite food being " + myObject.getFavoriteFood() + "," + "\n" +
        "and it's not very expensive, I pay "+ petFood.getFoodPrice() + " $ " + " on a 3 kg bag and it's enough" + "\n"+
        "for 1 week. Just today I asked at the store if they have enough food to make sure we never run out of " + "\n"+
        "favorite food and they replied that every day they have a quantity of " + petFood.getQuantity() + "\n"+
        "kg available " + petFood.getAvailability() + "," + " well that is enough for me to hear," + "\n" +
        "because between; one and ten, "+ myObject.getName() + " has an appetite of " + myObject.getFeelingHungry()+
        "\n" + "Anyway, I'm glad to share my dog's story with someone, but now I'm going" +
        " to play" + activity.getNameActivity() + "with my beloved puppy.");


    }

}
