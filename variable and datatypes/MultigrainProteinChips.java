class MultigrainProteinChips {
    static String brand = "EAT Anytime";
    static String flavour = "Cheese & Herbs";
    static String netQuantity = "2 Count";
    static int numberOfItems = 2;
    static String itemWeight = "200 Grams";
    static String size = "Pack of 2";
    static String itemDimensions = "15 x 12 x 12 Centimeters";
    static String packageWeight = "0.30 Kilograms";
    static int price = 199;

    public static void main(String[] args) {
        String brand = "Anytime";
        String flavour = "Peri Peri";
        String netQuantity = "1 Count";
        int numberOfItems = 1;
        String itemWeight = "180 Grams";
        String size = "1 count (Pack of 1)";
        String itemDimensions = "14.5 x 10 x 10 Centimeters";
        String packageWeight = "0.24 Kilograms";
        int price = 185;

        System.out.println("Brand is: " + MultigrainProteinChips.brand);
        System.out.println("Another Brand is: " + brand);

        System.out.println("Flavour is: " + MultigrainProteinChips.flavour);
        System.out.println("Another Flavour is: " + flavour);

        System.out.println("Net Quantity is: " + MultigrainProteinChips.netQuantity);
        System.out.println("Another Net Quantity is: " + netQuantity);

        System.out.println("Number of Items is: " + MultigrainProteinChips.numberOfItems);
        System.out.println("Another Number of Items is: " + numberOfItems);

        System.out.println("Item Weight is: " + MultigrainProteinChips.itemWeight);
        System.out.println("Another Item Weight is: " + itemWeight);

        System.out.println("Size is: " + MultigrainProteinChips.size);
        System.out.println("Another Size is: " + size);

        System.out.println("Item Dimensions (L x W x H) are: " + MultigrainProteinChips.itemDimensions);
        System.out.println("Another Item Dimensions (L x W x H) are: " + itemDimensions);

        System.out.println("Package Weight is: " + MultigrainProteinChips.packageWeight);
        System.out.println("Another Package Weight is: " + packageWeight);

        System.out.println("Price is: ₹" + MultigrainProteinChips.price);
        System.out.println("Another Price is: ₹" + price);
    }
}