class PrestigeIris {
    static String colour = "Black";
    static String material = "Plastic";
    static String specialFeature = "Shock Proof Design";
    static String brand = "Prestige Original";
    static int heatingElements = 2;
    static int price = 1699;

    public static void main(String[] args) {
        String colour = "White";
        String material = "Glass";
        String specialFeature = "Anti-Magnetic Wall, Automatic Voltage Regulator, Easy to Maintain, Healthy";
        String brand = "Prestige";
        int heatingElements = 1;
        int price = 1549;

        System.out.println("Brand is: " + PrestigeIris.brand);
        System.out.println("Another Brand is: " + brand);

        System.out.println("Colour is: " + PrestigeIris.colour);
        System.out.println("Another Colour is: " + colour);

        System.out.println("Material is: " + PrestigeIris.material);
        System.out.println("Another Material is: " + material);

        System.out.println("Special Feature is: " + PrestigeIris.specialFeature);
        System.out.println("Another Special Feature is: " + specialFeature);

        System.out.println("Heating Elements are: " + PrestigeIris.heatingElements);
        System.out.println("Another Heating Elements are: " + heatingElements);

        System.out.println("Price is: ₹" + PrestigeIris.price);
        System.out.println("Another Price is: ₹" + price);
    }
}