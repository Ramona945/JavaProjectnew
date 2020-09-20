package AnimalRescuer;

public class Activity {

    private String nameActivity;
    private String area;
    private boolean groupActivities;
    private boolean objectsNeeded;

    public String getNameActivity(){
        return nameActivity;
    }
    public void setNameActivity(String nameActivity){
        this.nameActivity = nameActivity;
    }

    public String getarea () {
        return area;
    }
    public void setarea(String area) {
        this.area = area;
    }

    public boolean isGroupActivities(){
        return groupActivities;
    }
    public void setGroupActivities( boolean groupActivities){
        this.groupActivities=groupActivities;
    }

    public boolean isObjectsNeeded() {
        return objectsNeeded;
    }

    public void setObjectsNeeded(boolean objectsNeeded) {
        this.objectsNeeded = objectsNeeded;

    }
}
