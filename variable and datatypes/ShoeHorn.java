class ShoeHorn {

    static String brand = "Harniruco Original";
    static String colour = "Black";
    static String handleMaterial = "Plastic";
    static String specificUsesForProduct = "Boots";
    static String material = "Wood";

    public static void main(String[] args) {

        String brand = "Harniruco";
        String colour = "Silver";
        String handleMaterial = "Stainless Steel";
        String specificUsesForProduct = "Shoes";
        String material = "Metal";

        System.out.println("Brand: " + ShoeHorn.brand);
        System.out.println("Another Brand: " + brand);

        System.out.println("Colour: " + ShoeHorn.colour);
        System.out.println("Another Colour: " + colour);

        System.out.println("Handle Material: " + ShoeHorn.handleMaterial);
        System.out.println("Another Handle Material: " + handleMaterial);

        System.out.println("Specific Uses For Product: " + ShoeHorn.specificUsesForProduct);
        System.out.println("Another Specific Uses For Product: " + specificUsesForProduct);

        System.out.println("Material: " + ShoeHorn.material);
        System.out.println("Another Material: " + material);
    }
}