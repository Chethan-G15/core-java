class Kingone {

    static String colour = "Black";
    static String brand = "Kingone Original";
    static String material = "Aluminium";
    static String numberOfBatteries = "2 AA batteries required";
    static String itemWeight = "100 Grams";

    public static void main(String[] args) {

        String colour = "White";
        String brand = "Kingone";
        String material = "Copper";
        String numberOfBatteries = "1 Lithium Ion battery required (included)";
        String itemWeight = "70 Grams";

        System.out.println("Colour: " + Kingone.colour);
        System.out.println("Another Colour: " + colour);

        System.out.println("Brand: " + Kingone.brand);
        System.out.println("Another Brand: " + brand);

        System.out.println("Material: " + Kingone.material);
        System.out.println("Another Material: " + material);

        System.out.println("Number Of Batteries: " + Kingone.numberOfBatteries);
        System.out.println("Another Number Of Batteries: " + numberOfBatteries);

        System.out.println("Item Weight: " + Kingone.itemWeight);
        System.out.println("Another Item Weight: " + itemWeight);
    }
}