class RucksackBag {
    static String productDimensions = "22 x 22 x 42 cm; 1.60 kg";
    static String dateFirstAvailable = "15 January 2019";
    static String manufacturer = "TRAWOC Originals";
    static String returnPolicy = "Standard 10-day return policy";
    static String asin = "B0847PGZZX";
    static String itemModelNumber = "HK005";
    static String countryOfOrigin = "USA";
    static String department = "Men";
    static String manufacturerDetails = "TRAWOC Originals, Support: support@trawoc.com";
    static String packer = "TRAWOC Originals";
    static String itemWeight = "1.6 kg";
    static String itemDimensions = "22 x 22 x 42 Centimeters";
    static String netQuantity = "2.0 Pieces";
    static String genericName = "Travel Rucksack";
    static int price = 3499;

    public static void main(String[] args) {
        String productDimensions = "20 x 20 x 40 cm; 1.55 kg";
        String dateFirstAvailable = "31 January 2020";
        String manufacturer = "TRAWOC Gears";
        String returnPolicy = "30-day return policy (Refer to return details for exceptions)";
        String asin = "B0847PGZZM";
        String itemModelNumber = "HK007";
        String countryOfOrigin = "India";
        String department = "unisex-adult";
        String manufacturerDetails = "TRAWOC Gears, Customer care: mail@trawoc.com, Whatsapp: 90371 86695, Call: 080-69647420";
        String packer = "TRAWOC Gears";
        String itemWeight = "1 kg 550 g";
        String itemDimensions = "20 x 20 x 40 Centimeters";
        String netQuantity = "1.0 Piece";
        String genericName = "Travel Backpack";
        int price = 3295;

        System.out.println("Product Dimensions are: " + RucksackBag.productDimensions);
        System.out.println("Another Product Dimensions are: " + productDimensions);

        System.out.println("Date First Available is: " + RucksackBag.dateFirstAvailable);
        System.out.println("Another Date First Available is: " + dateFirstAvailable);

        System.out.println("Manufacturer is: " + RucksackBag.manufacturer);
        System.out.println("Another Manufacturer is: " + manufacturer);

        System.out.println("Return Policy: " + RucksackBag.returnPolicy);
        System.out.println("Another Return Policy: " + returnPolicy);

        System.out.println("ASIN is: " + RucksackBag.asin);
        System.out.println("Another ASIN is: " + asin);

        System.out.println("Item Model Number is: " + RucksackBag.itemModelNumber);
        System.out.println("Another Item Model Number is: " + itemModelNumber);

        System.out.println("Country of Origin is: " + RucksackBag.countryOfOrigin);
        System.out.println("Another Country of Origin is: " + countryOfOrigin);

        System.out.println("Department is: " + RucksackBag.department);
        System.out.println("Another Department is: " + department);

        System.out.println("Manufacturer Details: " + RucksackBag.manufacturerDetails);
        System.out.println("Another Manufacturer Details: " + manufacturerDetails);

        System.out.println("Packer is: " + RucksackBag.packer);
        System.out.println("Another Packer is: " + packer);

        System.out.println("Item Weight is: " + RucksackBag.itemWeight);
        System.out.println("Another Item Weight is: " + itemWeight);

        System.out.println("Item Dimensions (L x W x H) are: " + RucksackBag.itemDimensions);
        System.out.println("Another Item Dimensions (L x W x H) are: " + itemDimensions);

        System.out.println("Net Quantity is: " + RucksackBag.netQuantity);
        System.out.println("Another Net Quantity is: " + netQuantity);

        System.out.println("Generic Name is: " + RucksackBag.genericName);
        System.out.println("Another Generic Name is: " + genericName);

        System.out.println("Price is: ₹" + RucksackBag.price);
        System.out.println("Another Price is: ₹" + price);
    }
}