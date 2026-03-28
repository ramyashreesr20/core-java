class AirConditioner {
    // Static variables 
    static boolean inverterTechnology = true;
    static String brand = "Daikin";
    static double price = 45600.80;
    public static void main(String[] args) {
        // Local variables 
        double temperature = 22.5;
        int warrantyYears = 5;
        String color = "White";
        System.out.println("<<<<<<<< AC DETAILS >>>>>>>>>>");
       
        System.out.println(">> Brand              : " + brand);
        System.out.println(">> Inverter Technology: " + inverterTechnology);
        System.out.println(">> Price              : " + price);

        System.out.println("================================");

        System.out.println(">> Temperature Set    : " + temperature + "°C");
        System.out.println(">> Warranty (Years)   : " + warrantyYears);
        System.out.println(">> Color              : " + color);

        System.out.println("<<<<<<<< THANK YOU >>>>>>>>>>");
    }
}