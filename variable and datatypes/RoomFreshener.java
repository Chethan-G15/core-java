class RoomFreshener {
    static String scent = "Violet Valley Bloom";
    static String colour = "Blue";
    static String brand = "Godrej Original";
    static String itemForm = "Liquid";
    static String itemDimensions = "10 x 8 x 20 Centimeters";
    static int price = 300;

    public static void main(String[] args) {
        String scent = "VioletBloom";
        String colour = "Violet Valley Bloom";
        String brand = "Godrej aer";
        String itemForm = "Spray";
        String itemDimensions = "11.6 x 9 x 23 Centimeters";
        int price = 350;

        System.out.println("Scent is: " + RoomFreshener.scent);
        System.out.println("Another Scent is: " + scent);

        System.out.println("Colour is: " + RoomFreshener.colour);
        System.out.println("Another Colour is: " + colour);

        System.out.println("Brand is: " + RoomFreshener.brand);
        System.out.println("Another Brand is: " + brand);

        System.out.println("Item Form is: " + RoomFreshener.itemForm);
        System.out.println("Another Item Form is: " + itemForm);

        System.out.println("Item Dimensions (L x W x H) is: " + RoomFreshener.itemDimensions);
        System.out.println("Another Item Dimensions (L x W x H) is: " + itemDimensions);

        System.out.println("Price is: ₹" + RoomFreshener.price);
        System.out.println("Another Price is: ₹" + price);
    }
}