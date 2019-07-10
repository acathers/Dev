package app;

public class Nursery {
    public static void main(String[] args) throws Exception {
        FruitTree peach = new FruitTree(3, 5, "peach", 15, false, "peach");
        FruitTree plum = new FruitTree(3, 5, "plum", 15, false, "plum");
        FruitTree persimmon = new FruitTree(3, 5, "persimmon", 15, true, "persimmon");
        System.out.println("Total number of plants: " + Plant.getTotalPlantCount());

        // age, wateringInterval, commonName, height
        Shrub gojiberry = new Shrub(8, 5, "gojiberry", 100);
        FruitTree bananna = new FruitTree(3, 5, "banana", 15, true, "banana");
        gojiberry.sold();
        System.out.println("Total number of plants: " + Plant.getTotalPlantCount());

    }
}