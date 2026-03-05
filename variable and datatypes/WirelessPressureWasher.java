class WirelessPressureWasher {
    static String manufacturer = "Whimsify Original";
    static String itemPartNumber = "CWG1";
    static String productDimensions = "12 x 12 x 12 cm; 500 g";
    static String asin = "B0G6Z3BB88";
    static int price = 1499;

    public static void main(String[] args) {
        String manufacturer = "The Whimsify Store, Indore, M.P.";
        String itemPartNumber = "CWG2";
        String productDimensions = "10 x 10 x 10 cm; 499 g";
        String asin = "B0G6Z3BB99";
        int price = 1389;

        System.out.println("Manufacturer is: " + WirelessPressureWasher.manufacturer);
        System.out.println("Another Manufacturer is: " + manufacturer);

        System.out.println("Item Part Number is: " + WirelessPressureWasher.itemPartNumber);
        System.out.println("Another Item Part Number is: " + itemPartNumber);

        System.out.println("Product Dimensions are: " + WirelessPressureWasher.productDimensions);
        System.out.println("Another Product Dimensions are: " + productDimensions);

        System.out.println("ASIN is: " + WirelessPressureWasher.asin);
        System.out.println("Another ASIN is: " + asin);

        System.out.println("Price is: ₹" + WirelessPressureWasher.price);
        System.out.println("Another Price is: ₹" + price);
    }
}