class Sobby {
    static String brand = "SOBBY";
    static String colour = "Blue";
    static String towelFormType = "Bath Towel";
    static String material = "Cotton";
    static String productDimensions = "25L x 18W Centimeters";
    static String style = "Classic";
    static String pattern = "Striped";
    static String specialFeature = "Soft & Absorbent";
    static int fabricWeight = 1500;

    public static void main(String[] cleaner) {
        String brand = "DOBBY";
        String colour = "Assorted Colours";
        String towelFormType = "Washcloth";
        String material = "Microfiber";
        String productDimensions = "24L x 16W Centimeters";
        String style = "Modern";
        String pattern = "Solid";
        String specialFeature = "Premium";
        int fabricWeight = 1600;

        System.out.println("Product Brand is: " + Sobby.brand);
        System.out.println("Another Product Brand is: " + brand);

        System.out.println("Colour is: " + Sobby.colour);
        System.out.println("Another Colour is: " + colour);

        System.out.println("Towel Form Type is: " + Sobby.towelFormType);
        System.out.println("Another Towel Form Type is: " + towelFormType);

        System.out.println("Material is: " + Sobby.material);
        System.out.println("Another Material is: " + material);

        System.out.println("Product Dimensions are: " + Sobby.productDimensions);
        System.out.println("Another Product Dimensions are: " + productDimensions);

        System.out.println("Style is: " + Sobby.style);
        System.out.println("Another Style is: " + style);

        System.out.println("Pattern is: " + Sobby.pattern);
        System.out.println("Another Pattern is: " + pattern);

        System.out.println("Special Feature is: " + Sobby.specialFeature);
        System.out.println("Another Special Feature is: " + specialFeature);

        System.out.println("Fabric Weight is: " + Sobby.fabricWeight + " grams");
        System.out.println("Another Fabric Weight is: " + fabricWeight + " grams");
    }
}