class ElectricCar {

    // Static variables 
    static String brand = "Tesla";
    static double price = 4899999.90;
    static int batteryRange = 520;   // in KM

    public static void main(String[] args) {

        // Local variables (new values)
        String color = "Midnight Silver";
        boolean autopilotEnabled = true;
        int chargingTime = 6;   // hours

        System.out.println("###############################");
        System.out.println("#       ELECTRIC CAR INFO     #");
        System.out.println("###############################");

        System.out.println("| Brand Name      :: " + brand);
        System.out.println("| Price (INR)     :: " + price);
        System.out.println("| Range (KM)      :: " + batteryRange);

        System.out.println("================================");

        System.out.println("| Color           :: " + color);
        System.out.println("| Autopilot       :: " + autopilotEnabled);
        System.out.println("| Charging Time   :: " + chargingTime + " hrs");

        System.out.println("###############################");
        System.out.println("#     DRIVE THE FUTURE 🚗     #");
        System.out.println("###############################");
    }
}