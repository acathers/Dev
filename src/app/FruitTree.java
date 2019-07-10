package app;

public class FruitTree extends Tree {

    private String fruit;

    public FruitTree(int age, int wateringInterval, String commonName, int height, boolean isDeciuous, String fruit) {
        super(age, wateringInterval, commonName, height, isDeciuous);
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

}