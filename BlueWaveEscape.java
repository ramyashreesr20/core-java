class BlueWaveEscape {
    public static void main(String[] args) {
        // Declaration + Initialization mixed
        int groupSize = 10;
        char rating = 'A';
        String spot = "Andaman";
        boolean paymentDone = false;
        double price = 54000.90;
        System.out.println("***** ESCAPE DETAILS *****");
        System.out.println("Spot: " + spot);
        System.out.println("Group Size: " + groupSize);
        // Changing some values in between
        paymentDone = true;
        rating = 'S';
        System.out.println("Price: " + price);
        System.out.println("Rating: " + rating);
        System.out.println("Payment Done: " + paymentDone);
        // Reassign all again (different order)
        spot = "Lakshadweep";
        price = 32000.45;
        groupSize = 5;
        rating = 'B';
        paymentDone = false;
        System.out.println("\n***** UPDATED ESCAPE DETAILS *****");
        System.out.println(spot + " | " + groupSize + " | " + price);
        System.out.println("Rating: " + rating + " | Paid: " + paymentDone);
    }
}