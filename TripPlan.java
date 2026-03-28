class TripPlan {
    public static void main(String[] args) {
        // Declaration + Initialization (Shuffled)
        int people = 4;
        String place = "Goa";
        boolean booked = true;
        double cost = 20000.50;
        char grade = 'A';
        // Print Details
        System.out.println("---- Trip Details ----");
        System.out.println("Place   : " + place);
        System.out.println("People  : " + people);
        System.out.println("Cost    : " + cost);
        System.out.println("Grade   : " + grade);
        System.out.println("Booked  : " + booked);
        // Change Values
        grade = 'B';
        place = "Ooty";
        people = 2;
        cost = 12000.75;
        booked = false;
        // Print Updated Details
        System.out.println("\n---- Updated Trip Details ----");
        System.out.println("Grade   : " + grade);
        System.out.println("Place   : " + place);
        System.out.println("Booked  : " + booked);
        System.out.println("People  : " + people);
        System.out.println("Cost    : " + cost);
    }
}