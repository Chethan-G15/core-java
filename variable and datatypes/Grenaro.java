class Grenaro {

    static String recommendedUsesForProduct = "Gaming";
    static String brand = "GrenaroTech";
    static String modelName = "X10";
    static String connectivityTechnology = "Bluetooth 5.0";
    static String connectorType = "USB Type-A";

    public static void main(String[] args) {

        String recommendedUsesForProduct = "Streaming";
        String brand = "GRENARO";
        String modelName = "S12";
        String connectivityTechnology = "2402-2480 MHz";
        String connectorType = "USB Type-C";

        System.out.println("Recommended Uses For Product: " + Grenaro.recommendedUsesForProduct);
        System.out.println("Another Recommended Uses For Product: " + recommendedUsesForProduct);

        System.out.println("Brand: " + Grenaro.brand);
        System.out.println("Another Brand: " + brand);

        System.out.println("Model Name: " + Grenaro.modelName);
        System.out.println("Another Model Name: " + modelName);

        System.out.println("Connectivity Technology: " + Grenaro.connectivityTechnology);
        System.out.println("Another Connectivity Technology: " + connectivityTechnology);

        System.out.println("Connector Type: " + Grenaro.connectorType);
        System.out.println("Another Connector Type: " + connectorType);
    }
}