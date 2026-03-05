class PhoneChargingStand {
    static String brand = "LIRAMARK";
    static String colour = "Black";
    static String formFactor = "Tabletop";
    static String compatibleDevices = "Smartphones";
    static String compatiblePhoneModels = "Universal";
    static int price = 150;

    public static void main(String[] cleaner) {
        String brand = "RAMARK";
        String colour = "White";
        String formFactor = "Wall Mount";
        String compatibleDevices = "Cell Phone, Mobile Phone, Smartphones";
        String compatiblePhoneModels = "All Smartphones, Cell Phone, Mobile Phone";
        int price = 119;

        System.out.println("Product Brand is: " + PhoneChargingStand.brand);
        System.out.println("Another Product Brand is: " + brand);

        System.out.println("Colour is: " + PhoneChargingStand.colour);
        System.out.println("Another Colour is: " + colour);

        System.out.println("Form Factor is: " + PhoneChargingStand.formFactor);
        System.out.println("Another Form Factor is: " + formFactor);

        System.out.println("Compatible Devices are: " + PhoneChargingStand.compatibleDevices);
        System.out.println("Another Compatible Devices are: " + compatibleDevices);

        System.out.println("Compatible Phone Models are: " + PhoneChargingStand.compatiblePhoneModels);
        System.out.println("Another Compatible Phone Models are: " + compatiblePhoneModels);

        System.out.println("Price is: ₹" + PhoneChargingStand.price);
        System.out.println("Another Price is: ₹" + price);
    }
}