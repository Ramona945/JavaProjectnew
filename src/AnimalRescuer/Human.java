package AnimalRescuer;

public abstract class Human {

    private String name;
    private int age;
    private int height;
    private int weight;
    private int levelOfIntelligence;
    private String gender;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLevelOfIntelligence() {
        return levelOfIntelligence;
    }

    public void setLevelOfIntelligence(int levelOfIntelligence) {
        this.levelOfIntelligence = levelOfIntelligence;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void think ();
    public abstract void speak();





}



