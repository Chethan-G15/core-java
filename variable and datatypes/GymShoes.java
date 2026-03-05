class GymShoes {
    static String materialType = "Fabric";
    static String closureType = "Lace-Up";
    static String heelType = "Flat";
    static String waterResistanceLevel = "Not Water Resistant";
    static String soleMaterial = "Ethylene Vinyl Acetate";
    static String style = "Sneaker";
    static String countryOfOrigin = "India";
    static int price = 857;

    public static void main(String[] args) {

        String materialType = "Leather";
        String closureType = "Slip-On";
        String heelType = "Raised Heel";
        String waterResistanceLevel = "Water Resistant";
        String soleMaterial = "Rubber";
        String style = "Running Shoe";
        String countryOfOrigin = "USA";
        int price = 700;

        System.out.println("Material Type is: " + GymShoes.materialType);
        System.out.println("Another Material Type is: " + materialType);

        System.out.println("Closure Type is: " + GymShoes.closureType);
        System.out.println("Another Closure Type is: " + closureType);

        System.out.println("Heel Type is: " + GymShoes.heelType);
        System.out.println("Another Heel Type is: " + heelType);

        System.out.println("Water Resistance Level is: " + GymShoes.waterResistanceLevel);
        System.out.println("Another Water Resistance Level is: " + waterResistanceLevel);

        System.out.println("Sole Material is: " + GymShoes.soleMaterial);
        System.out.println("Another Sole Material is: " + soleMaterial);

        System.out.println("Style is: " + GymShoes.style);
        System.out.println("Another Style is: " + style);

        System.out.println("Country of Origin is: " + GymShoes.countryOfOrigin);
        System.out.println("Another Country of Origin is: " + countryOfOrigin);

        System.out.println("Price is: ₹" + GymShoes.price);
        System.out.println("Another Price is: ₹" + price);
    }
}