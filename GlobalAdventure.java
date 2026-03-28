class GlobalAdventure {
    public static void main(String[] args) {
       // ===== Declaration (Shuffled Order) =====
        double totalBudget;
        boolean bookingStatus;
        char adventureLevel;
        String destinationPlace;
        int groupSize;
        // ===== Initialization (Different Order) =====
        groupSize = 10;
        destinationPlace = "Switzerland";
        adventureLevel = 'S';
        totalBudget = 95000.45;
        bookingStatus = true;
        // ===== Display Adventure Details =====
        System.out.println("***** GLOBAL ADVENTURE DETAILS *****");
        System.out.println("Destination       : " + destinationPlace);
        System.out.println("Group Size        : " + groupSize);
        System.out.println("Total Budget      : " + totalBudget);
        System.out.println("Adventure Level   : " + adventureLevel);
        System.out.println("Booking Confirmed : " + bookingStatus);
        // ===== Update Values (Shuffled Again) =====
        bookingStatus = false;
        totalBudget = 72000.80;
        destinationPlace = "Thailand";
        groupSize = 6;
        adventureLevel = 'A';
        // ===== Display Updated Details =====
        System.out.println("\n***** UPDATED ADVENTURE DETAILS *****");
        System.out.println("Adventure Level   : " + adventureLevel);
        System.out.println("Total Budget      : " + totalBudget);
        System.out.println("Destination       : " + destinationPlace);
        System.out.println("Booking Confirmed : " + bookingStatus);
        System.out.println("Group Size        : " + groupSize);
    }
}