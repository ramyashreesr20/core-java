class Brand {

    // Static variables 
    static double price = 34999.99;
    static int stockAvailable = 120;
    static String brandName = "Sony";

    public static void main(String[] args) {

        // Local variables 
        boolean isImported = true;
        String productType = "Headphones";
        int warrantyMonths = 24;

        System.out.println("***** BRAND PRODUCT DETAILS *****");

        // Printing static variables (shuffled print order)
        System.out.println("Stock Available : " + stockAvailable);
        System.out.println("Brand Name      : " + brandName);
        System.out.println("Price (INR)     : " + price);

        System.out.println("----------------------------------");

        // Printing local variables 
        System.out.println("Warranty (Months): " + warrantyMonths);
        System.out.println("Product Type     : " + productType);
        System.out.println("Imported         : " + isImported);

        System.out.println("******** END ********");
    }
}