class BabyBoyDoll {
	static String modelNumber = "Boy Doll";
	static int numberOfPuzzlePieces;
	static String assemblyRequired;
	static String batteriesRequired;
	static String batteryDescription;
	static String materialType;
	static String colour;
	static String packageDimensions;
	static String itemModelNumber;
	static String recommendedAge;
	static String manufacturer;
	static String countryOfOrigin;
	static String itemWeight;
	static int price;
    public static void main(String[] args) {

        String modelNumber = "Doll Boy";
        int numberOfPuzzlePieces = 1;
        String assemblyRequired = "No";
        String batteriesRequired = "No";
        String batteryDescription = "Battery required for musical and light-up features";
        String materialType = "Plastic";
        String colour = "Multicolor";
        String packageDimensions = "35 x 12 x 10 cm; 300 g";
        String itemModelNumber = "Boy Doll";
        String recommendedAge = "18 months - 3 years";
        String manufacturer = "Yogi Enterprise01";
        String countryOfOrigin = "India";
        String itemWeight = "300 g";
        int price = 499;

        System.out.println("Model Number is: " + modelNumber);
        System.out.println("Number of Puzzle Pieces is: " + numberOfPuzzlePieces);
        System.out.println("Assembly Required: " + assemblyRequired);
        System.out.println("Batteries Required: " + batteriesRequired);
        System.out.println("Battery Description: " + batteryDescription);
        System.out.println("Material Type is: " + materialType);
        System.out.println("Colour is: " + colour);
        System.out.println("Package Dimensions are: " + packageDimensions);
        System.out.println("Item Model Number is: " + itemModelNumber);
        System.out.println("Manufacturer Recommended Age: " + recommendedAge);
        System.out.println("Manufacturer is: " + manufacturer);
        System.out.println("Country of Origin is: " + countryOfOrigin);
        System.out.println("Item Weight is: " + itemWeight);
        System.out.println("Price is: ₹" + price);
    }
}
