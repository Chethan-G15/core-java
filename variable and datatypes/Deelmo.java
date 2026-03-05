class Deelmo {
    static String materialComposition = "Polyester";
    static String pattern = "Checked";
    static String fitType = "Slim Fit";
    static String sleeveType = "Short Sleeve";
    static String collarStyle = "Mandarin Collar";
    static String neckStyle = "Round Neck";
    static String countryOfOrigin = "USA";
    static int price = 459;

    public static void main(String[] args) {
        String materialComposition = "Cotton";
        String pattern = "Solid";
        String fitType = "Regular Fit";
        String sleeveType = "Long Sleeve";
        String collarStyle = "Spread Collar";
        String neckStyle = "Collared Neck";
        String countryOfOrigin = "India";
        int price = 300;

        System.out.println("Material Composition is: " + Deelmo.materialComposition);
        System.out.println("Another Material Composition is: " + materialComposition);

        System.out.println("Pattern is: " + Deelmo.pattern);
        System.out.println("Another Pattern is: " + pattern);

        System.out.println("Fit Type is: " + Deelmo.fitType);
        System.out.println("Another Fit Type is: " + fitType);

        System.out.println("Sleeve Type is: " + Deelmo.sleeveType);
        System.out.println("Another Sleeve Type is: " + sleeveType);

        System.out.println("Collar Style is: " + Deelmo.collarStyle);
        System.out.println("Another Collar Style is: " + collarStyle);

        System.out.println("Neck Style is: " + Deelmo.neckStyle);
        System.out.println("Another Neck Style is: " + neckStyle);

        System.out.println("Country of Origin is: " + Deelmo.countryOfOrigin);
        System.out.println("Another Country of Origin is: " + countryOfOrigin);

        System.out.println("Price is: ₹" + Deelmo.price);
        System.out.println("Another Price is: ₹" + price);
    }
}