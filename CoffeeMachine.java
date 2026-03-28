class CoffeeMachine {
    // Static variables 
    static double powerWatts = 1450.75;
    static int capacityML = 1200;
    static String brand = "Philips";
    public static void main(String[] args) {
        // Local variables 
        boolean hasMilkFrother = true;
        int cupsPerBrew = 4;
        double temperature = 92.5;
        System.out.println("############# COFFEE MACHINE #############");
        System.out.println("|| Brand        :: " + brand);
        System.out.println("|| Power (W)    :: " + powerWatts);
        System.out.println("|| Capacity(ml) :: " + capacityML);
        System.out.println("-------------------------------------------");
        System.out.println("|| Milk Frother :: " + hasMilkFrother);
        System.out.println("|| Cups/Brew    :: " + cupsPerBrew);
        System.out.println("|| Temperature  :: " + temperature + "°C");

        System.out.println("############# READY TO BREW #############");
    }
}