class GamingLaptop {

    // Static variables 
    static String brand = "Asus ROG";
    static double price = 125999.75;
    static int ramGB = 32;

    public static void main(String[] args) {

        // Local variables 
        String processor = "Intel i9";
        int storageGB = 1024;
        boolean isRGBKeyboard = true;

        System.out.println("~~~~~~~~~~ GAMING LAPTOP DETAILS ~~~~~~~~~~");

        System.out.println(">>> Brand        : " + brand);
        System.out.println(">>> Price        : " + price);
        System.out.println(">>> RAM (GB)     : " + ramGB);

        System.out.println("--------------------------------------------");

        System.out.println(">>> Processor    : " + processor);
        System.out.println(">>> Storage (GB) : " + storageGB);
        System.out.println(">>> RGB Keyboard : " + isRGBKeyboard);

        System.out.println("~~~~~~~~~~ POWERED FOR PERFORMANCE ~~~~~~~~~~");
    }
}