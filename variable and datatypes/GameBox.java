class GameBox {
    static String size;
	//= "6 cm x 6 cm x 6 cm";
    static String colour; 
	//= "Multicolor";
    static String brand = "MOROVIK";
    static int numberOfPlayers = 1;
    static String productDimensions = "6L x 3W x 6H Centimeters";
    static int price = 799;

    public static void main(String[] args) {

        /*String size = "7 cm x 7 cm x 7 cm";
        String colour = "Red & Blue";
        String brand = "FunPlay";
        int numberOfPlayers = 2;
        String productDimensions = "7L x 4W x 7H Centimeters";
        int price = 800;*/
		
		int size = 888;
        int colour = 400;
        brand = "FunPlay";
        numberOfPlayers = 2;
        productDimensions = "7L x 4W x 7H Centimeters";
        price = 800;

        System.out.println("Size is: " + GameBox.size);
        System.out.println("Another Size is: " + size);

        System.out.println("Colour is: " + GameBox.colour);
        System.out.println("Another Colour is: " + colour);

        System.out.println("Brand is: " + GameBox.brand);
        System.out.println("Another Brand is: " + brand);

        System.out.println("Number of Players is: " + GameBox.numberOfPlayers);
        System.out.println("Another Number of Players is: " + numberOfPlayers);

        System.out.println("Product Dimensions are: " + GameBox.productDimensions);
        System.out.println("Another Product Dimensions are: " + productDimensions);

        System.out.println("Price is: ₹" + GameBox.price);
        System.out.println("Another Price is: ₹" + price);
    }
}