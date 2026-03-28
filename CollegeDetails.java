class CollegeDetails {

    // Static Variables (Class Variables)
    static String collegeName = "Global Institute";
    static String universityName = "VTU";
    static int establishedYear = 2005;

    public static void main(String[] args) {

        // Local Variables
        String studentName = "Likitha";
        int rollNumber = 101;
        double percentage = 88.5;

        // Printing Static Variables
        System.out.println("College Name: " + collegeName);
        System.out.println("University Name: " + universityName);
        System.out.println("Established Year: " + establishedYear);

        // Printing Local Variables
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Percentage: " + percentage);
    }
}