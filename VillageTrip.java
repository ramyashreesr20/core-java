class VillageTrip {
    public static void main(String[] args) {
        // Declaration + Initialization
        String placeName = "Manali";
        int numberOfPeople = 5;
        double budget = 25000.75;
        char tripGrade = 'A';
        boolean isConfirmed = true;
        // Print values
        System.out.println("=== Trip Details ===");
        System.out.println("Place Name: " + placeName);
        System.out.println("Number Of People: " + numberOfPeople);
        System.out.println("Budget: " + budget);
        System.out.println("Trip Grade: " + tripGrade);
        System.out.println("Confirmed: " + isConfirmed);
        // Reassign values
        placeName = "Ooty";
        numberOfPeople = 3;
        budget = 18000.50;
        tripGrade = 'B';
        isConfirmed = false;
        // Print again
        System.out.println("\n=== Updated Trip Details ===");
        System.out.println("Place Name: " + placeName);
        System.out.println("Number Of People: " + numberOfPeople);
        System.out.println("Budget: " + budget);
        System.out.println("Trip Grade: " + tripGrade);
        System.out.println("Confirmed: " + isConfirmed);
    }
}