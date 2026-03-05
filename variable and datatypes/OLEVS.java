class OLEVS {

    static String caseDiameter = "40 Millimetres";
    static String bandColour = "Black";
    static String bandMaterialType = "Leather";
    static String warrantyType = "6 Months Warranty";
    static String watchMovementType = "Automatic";
    static String caseThickness = "10 Millimetres";
    static String countryOfOrigin = "Japan";

    public static void main(String[] args) {

        String caseDiameter = "41 Millimetres";
        String bandColour = "Multicolor";
        String bandMaterialType = "Stainless Steel";
        String warrantyType = "1 Year On Manufacturing Defects";
        String watchMovementType = "Quartz";
        String caseThickness = "11 Millimetres";
        String countryOfOrigin = "Hong Kong";

        System.out.println("Case Diameter: " + OLEVS.caseDiameter);
        System.out.println("Another Case Diameter: " + caseDiameter);

        System.out.println("Band Colour: " + OLEVS.bandColour);
        System.out.println("Another Band Colour: " + bandColour);

        System.out.println("Band Material Type: " + OLEVS.bandMaterialType);
        System.out.println("Another Band Material Type: " + bandMaterialType);

        System.out.println("Warranty Type: " + OLEVS.warrantyType);
        System.out.println("Another Warranty Type: " + warrantyType);

        System.out.println("Watch Movement Type: " + OLEVS.watchMovementType);
        System.out.println("Another Watch Movement Type: " + watchMovementType);

        System.out.println("Case Thickness: " + OLEVS.caseThickness);
        System.out.println("Another Case Thickness: " + caseThickness);

        System.out.println("Country of Origin: " + OLEVS.countryOfOrigin);
        System.out.println("Another Country of Origin: " + countryOfOrigin);
    }
}