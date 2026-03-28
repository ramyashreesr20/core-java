class SmartTV {

    // Static variables 
    static int screenSizeInches = 55;
    static String brandName = "Samsung";
    static double price = 72999.80;

    public static void main(String[] args) {

        // Local variables
        boolean is4K = true;
        int warrantyYears = 3;
        String displayType = "QLED";

        System.out.println("<<<<<<<<<< SMART TV DETAILS >>>>>>>>>>");

        // Printing static variables 
        System.out.println("Brand Name        : " + brandName);
        System.out.println("Screen Size       : " + screenSizeInches + " inches");
        System.out.println("Price (INR)       : " + price);

        System.out.println("=======================================");

        // Printing local variables 
        System.out.println("Display Type      : " + displayType);
        System.out.println("Warranty (Years)  : " + warrantyYears);
        System.out.println("4K Supported      : " + is4K);

        System.out.println("<<<<<<<<<< END >>>>>>>>>>");
    }
}