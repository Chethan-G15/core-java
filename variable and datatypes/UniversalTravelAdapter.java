class UniversalTravelAdapter {
    static String brand = "Adapter";
    static String colour = "Black";
    static String itemWeight = "90 Grams";
    static int inputVoltage = 240; // Volts
    static String itemDimensions = "8.4 x 5.7 x 4.8 Centimeters";
    static int price = 579;

    public static void main(String[] args) {
        String brand = "rts";
        String colour = "White";
        String itemWeight = "100 Grams";
        int inputVoltage = 220; // Volts
        String itemDimensions = "9.0 x 6.0 x 5.0 Centimeters";
        int price = 499;

        System.out.println("Brand is: " + UniversalTravelAdapter.brand);
        System.out.println("Another Brand is: " + brand);

        System.out.println("Colour is: " + UniversalTravelAdapter.colour);
        System.out.println("Another Colour is: " + colour);

        System.out.println("Item Weight is: " + UniversalTravelAdapter.itemWeight);
        System.out.println("Another Item Weight is: " + itemWeight);

        System.out.println("Input Voltage is: " + UniversalTravelAdapter.inputVoltage + " Volts");
        System.out.println("Another Input Voltage is: " + inputVoltage + " Volts");

        System.out.println("Item Dimensions (L x W x H) are: " + UniversalTravelAdapter.itemDimensions);
        System.out.println("Another Item Dimensions (L x W x H) are: " + itemDimensions);

        System.out.println("Price is: ₹" + UniversalTravelAdapter.price);
        System.out.println("Another Price is: ₹" + price);
    }
}