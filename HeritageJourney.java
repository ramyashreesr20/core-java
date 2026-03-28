class HeritageJourney {
    public static void main(String[] args) {
        // ===== Step 1: Variable Declaration (Mixed Order) =====
        int participantCount;
        String travelLocation;
        boolean registrationStatus;
        double tripCost;
        char journeyRank;
        // ===== Step 2: Variable Initialization (Different Order) =====
        travelLocation = "Hampi";
        tripCost = 27500.90;
        participantCount = 9;
        journeyRank = 'A';
        registrationStatus = true;
        // ===== Step 3: Show Journey Details =====
        System.out.println("====== HERITAGE JOURNEY DETAILS ======");
        System.out.println("Location          : " + travelLocation);
        System.out.println("Participants      : " + participantCount);
        System.out.println("Total Cost        : " + tripCost);
        System.out.println("Journey Rank      : " + journeyRank);
        System.out.println("Registered        : " + registrationStatus);
        // ===== Step 4: Update Values (Shuffled Again) =====
        registrationStatus = false;
        participantCount = 5;
        travelLocation = "Varanasi";
        tripCost = 19800.75;
        journeyRank = 'B';
        // ===== Step 5: Show Updated Details =====
        System.out.println("\n====== UPDATED JOURNEY DETAILS ======");
        System.out.println("Journey Rank      : " + journeyRank);
        System.out.println("Location          : " + travelLocation);
        System.out.println("Registered        : " + registrationStatus);
        System.out.println("Participants      : " + participantCount);
        System.out.println("Total Cost        : " + tripCost);
    }
}