class ZebronicsThunderBluetooth {
    static String brand = "ZEBRONICS";
    static String colour = "Blue";
    static String earPlacement = "In Ear";
    static String formFactor = "Earbuds";
    static int price = 799;

    public static void main(String[] args) {
        String brand = "ZEBRONICS";
        String colour = "Black (Zeb-Thunder)";
        String earPlacement = "Over Ear";
        String formFactor = "Over Ear";
        int price = 749;

        System.out.println("Brand is: " + ZebronicsThunderBluetooth.brand);
        System.out.println("Another Brand is: " + brand);

        System.out.println("Colour is: " + ZebronicsThunderBluetooth.colour);
        System.out.println("Another Colour is: " + colour);

        System.out.println("Ear Placement is: " + ZebronicsThunderBluetooth.earPlacement);
        System.out.println("Another Ear Placement is: " + earPlacement);

        System.out.println("Form Factor is: " + ZebronicsThunderBluetooth.formFactor);
        System.out.println("Another Form Factor is: " + formFactor);

        System.out.println("Price is: ₹" + ZebronicsThunderBluetooth.price);
        System.out.println("Another Price is: ₹" + price);
    }
}