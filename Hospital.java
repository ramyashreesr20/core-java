class Hospital {
    public static void main(String[] args) {
        // 1st --> Declaration
        String hospitalName;
        int numberOfDoctors;
        double rating;
        char category;
        boolean isOpen;
        // 2nd --> Initialization
        hospitalName = "City Care";
        numberOfDoctors = 45;
        rating = 4.5;
        category = 'A';
        isOpen = true;
        // Print variables
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Number of Doctors: " + numberOfDoctors);
        System.out.println("Rating: " + rating);
        System.out.println("Category: " + category);
        System.out.println("Open: " + isOpen);
        // Reassign the variables
        hospitalName = "Metro Health";
        numberOfDoctors = 60;
        rating = 4.8;
        category = 'S';
        isOpen = false;
        // Print again
        System.out.println("---- After Changing Values ----");
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Number of Doctors: " + numberOfDoctors);
        System.out.println("Rating: " + rating);
        System.out.println("Category: " + category);
        System.out.println("Open: " + isOpen);
    }
}