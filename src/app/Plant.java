package app;

public abstract class Plant {

private static int totalPlantCount; // counter 

private int age; // all plants have an age property
private int wateringInterval; // all plants have a watering interval
private String commonName; // all plants have a String property for common name
private int height; // height property in cm
private boolean sold = false;

public Plant(int age, int wateringInterval, String commonName, int height) {
    this.age = age;
    this.wateringInterval = wateringInterval;
    this.commonName = commonName;
    this.height = height;
    totalPlantCount++; // increase number of plants by 1
}

public void sold(){
    sold = true;
    totalPlantCount--;
}

    public static int getTotalPlantCount() { // only getter because value should not be changed
        return totalPlantCount;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWateringInterval() {
        return wateringInterval;
    }

    public void setWateringInterval(int wateringInterval) {
        this.wateringInterval = wateringInterval;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
      
}