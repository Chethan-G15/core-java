class ScotchBrite {
    static String brand = "Scotch-Brite";
    static String material = "Foam";
    static String recommendedUsesForProduct = "Cleaning";
    static String colour = "Yellow";
    static String specialFeature = "Durable";
    static int price = 100;

    public static void main(String[] cleaner) {
        String brand = "Scotch";
        String material = "Sponge";
        String recommendedUsesForProduct = "Scrubbing";
        String colour = "Green";
        String specialFeature = "Long Lasting";
        int price = 75;

        System.out.println("Product Brand is: " + ScotchBrite.brand);
        System.out.println("Another Product Brand is: " + brand);

        System.out.println("Material is: " + ScotchBrite.material);
        System.out.println("Another Material is: " + material);

        System.out.println("Recommended Uses For Product is: " + ScotchBrite.recommendedUsesForProduct);
        System.out.println("Another Recommended Uses For Product is: " + recommendedUsesForProduct);

        System.out.println("Colour is: " + ScotchBrite.colour);
        System.out.println("Another Colour is: " + colour);

        System.out.println("Special Feature is: " + ScotchBrite.specialFeature);
        System.out.println("Another Special Feature is: " + specialFeature);

        System.out.println("Price is: ₹" + ScotchBrite.price);
        System.out.println("Another Price is: ₹" + price);
    }
}