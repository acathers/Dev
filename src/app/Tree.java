package app;

public class Tree extends Plant {

    private final boolean isDeciuous;

    public Tree(int age, int wateringInterval, String commonName, int height, boolean isDeciuous) {
        super(age, wateringInterval, commonName, height);
        this.isDeciuous = isDeciuous;
    }

    public boolean isDeciuous() {
        return isDeciuous;
    }

    
    
}