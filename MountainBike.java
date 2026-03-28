class MountainBike {

    // Static variables 
    static int gearCount = 21;
    static String brand = "Trek";
    static double price = 25999.50;

    public static void main(String[] args) {

        // Local variables 
        boolean isElectric = false;
        String color = "Red";
        double weight = 14.75;

        System.out.println("********** BIKE DETAILS **********");

        System.out.println("★ Gear Count  ---> " + gearCount);
        System.out.println("★ Brand       ---> " + brand);
        System.out.println("★ Price       ---> " + price);

        System.out.println("***********************************");

        System.out.println("★ Electric    ---> " + isElectric);
        System.out.println("★ Color       ---> " + color);
        System.out.println("★ Weight      ---> " + weight + " kg");

        System.out.println("********** END OF DETAILS **********");
    }
}