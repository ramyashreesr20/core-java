class FamilyJourney {
    public static void main(String[] args) {
        // Declaration
        String location;
        int members;
        double totalAmount;
        char campGrade;
        boolean isBooked;
        // Initialization
        location = "Coorg";
        members = 6;
        totalAmount = 28000.75;
        campGrade = 'A';
        isBooked = true;
        // Print Details
        System.out.println("=== Adventure Camp Details ===");
        System.out.println("Location  : " + location);
        System.out.println("Members   : " + members);
        System.out.println("Amount    : " + totalAmount);
        System.out.println("Grade     : " + campGrade);
        System.out.println("Booked    : " + isBooked);
        // Reassign Values
        location = "Wayanad";
        members = 3;
        totalAmount = 15000.50;
        campGrade = 'B';
        isBooked = false;
        // Print Updated Details
        System.out.println("\n=== Updated Camp Details ===");
        System.out.println("Location  : " + location);
        System.out.println("Members   : " + members);
        System.out.println("Amount    : " + totalAmount);
        System.out.println("Grade     : " + campGrade);
        System.out.println("Booked    : " + isBooked);
    }
}