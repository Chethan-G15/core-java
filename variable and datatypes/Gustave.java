class Gustave {

    static String brand = "GUSTAVE Original";
    static String material = "Leather";
    static int size = 28;
    static String sport = "Cycling";
    static String gloveType = "Winter Gloves";
    static String ageRange = "Adults";
    static String colour = "Brown";
    static String specialFeature = "Durable, Breathable";
    static String handOrientation = "Right Hand";
    static int itemPackageQuantity = 2;

    public static void main(String[] args) {

        String brand = "GUSTAVE";
        String material = "Cotton, Polyurethane";
        int size = 30;
        String sport = "Riding";
        String gloveType = "Skiing, Cycling";
        String ageRange = "All Ages";
        String colour = "Black - Grey";
        String specialFeature = "Flexible, Slip Resistant, Waterproof";
        String handOrientation = "Ambidextrous";
        int itemPackageQuantity = 1;

        System.out.println("Brand: " + Gustave.brand);
        System.out.println("Another Brand: " + brand);

        System.out.println("Material: " + Gustave.material);
        System.out.println("Another Material: " + material);

        System.out.println("Size: " + Gustave.size);
        System.out.println("Another Size: " + size);

        System.out.println("Sport: " + Gustave.sport);
        System.out.println("Another Sport: " + sport);

        System.out.println("Glove Type: " + Gustave.gloveType);
        System.out.println("Another Glove Type: " + gloveType);

        System.out.println("Age Range: " + Gustave.ageRange);
        System.out.println("Another Age Range: " + ageRange);

        System.out.println("Colour: " + Gustave.colour);
        System.out.println("Another Colour: " + colour);

        System.out.println("Special Feature: " + Gustave.specialFeature);
        System.out.println("Another Special Feature: " + specialFeature);

        System.out.println("Hand Orientation: " + Gustave.handOrientation);
        System.out.println("Another Hand Orientation: " + handOrientation);

        System.out.println("Item Package Quantity: " + Gustave.itemPackageQuantity);
        System.out.println("Another Item Package Quantity: " + itemPackageQuantity);
    }
}