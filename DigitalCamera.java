class DigitalCamera {

    // Static variables 
    static double price = 54999.80;
    static int megapixels = 48;
    static String brand = "Canon";

    public static void main(String[] args) {

        // Local variables 
        boolean is4KSupported = true;
        String color = "Black";
        int zoomLevel = 20;

        System.out.println("======= DIGITAL CAMERA DETAILS =======");

        System.out.println("Price        : " + price);
        System.out.println("Megapixels   : " + megapixels);
        System.out.println("Brand        : " + brand);

        System.out.println("---------------------------------------");

        System.out.println("4K Supported : " + is4KSupported);
        System.out.println("Color        : " + color);
        System.out.println("Zoom Level   : " + zoomLevel + "x");

        System.out.println("=======================================");
    }
}