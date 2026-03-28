class Laptop {
    // Static variables
    static String brand = "Dell";
    static int ramSize = 16;
    static double price = 65000.50;
    public static void main(String[] args) {
        // Local variables
        String color = "Black";
        int storage = 512;
        boolean isTouchScreen = true;
        // Printing Static Variables
        System.out.println("Static Variable - Brand: " + brand);
        System.out.println("Static Variable - RAM Size: " + ramSize + "GB");
        System.out.println("Static Variable - Price: " + price);
        // Printing Local Variables
        System.out.println("Local Variable - Color: " + color);
        System.out.println("Local Variable - Storage: " + storage + "GB");
        System.out.println("Local Variable - Touch Screen: " + isTouchScreen);
    }
}