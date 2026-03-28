class MusicSpeaker {

    // Static variables 
    static double price = 15999.45;
    static String brand = "JBL";
    static int outputWatts = 80;

    public static void main(String[] args) {

        // Local variables 
        boolean isBluetooth = true;
        String color = "Black";
        int batteryHours = 12;

        System.out.println("====== MUSIC SPEAKER DETAILS ======");

        // Printing Static Variables (shuffled print order)
        System.out.println("Output Power (Watts): " + outputWatts);
        System.out.println("Brand Name          : " + brand);
        System.out.println("Price (INR)         : " + price);

        System.out.println("------------------------------------");

        // Printing Local Variables 
        System.out.println("Battery Backup (hrs): " + batteryHours);
        System.out.println("Bluetooth Support   : " + isBluetooth);
        System.out.println("Color               : " + color);

        System.out.println("====== SOUND ON 🔊 ======");
    }
}