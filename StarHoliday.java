class StarHoliday {
    public static void main(String args[]) {
        // Declare variables first (different order)
        boolean confirmed;
        char category;
        double amount;
        String destination;
        int persons;
        // Initialize in completely different order
        destination = "Kashmir";
        amount = 65000.55;
        persons = 8;
        confirmed = true;
        category = 'A';
        System.out.println("---- HOLIDAY INFORMATION ----");
        // Print in mixed order
        System.out.println("Destination : " + destination);
        System.out.println("Amount      : " + amount);
        // Change some values in middle
        persons = 5;
        category = 'B';
        System.out.println("Persons     : " + persons);
        System.out.println("Category    : " + category);
        System.out.println("Confirmed   : " + confirmed);
        // Final update (again different order)
        confirmed = false;
        destination = "Darjeeling";
        amount = 42000.25;
        System.out.println("\n---- UPDATED INFORMATION ----");
        System.out.println(destination + " - " + persons + " Members");
        System.out.println("Total: " + amount);
        System.out.println("Category: " + category + ", Confirmed: " + confirmed);
    }
}