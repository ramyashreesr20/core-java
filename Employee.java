class Employee {
    public static void main(String[] args) {
        // 1st --> Declaration
        String empName;
        int empId;
        double salary;
        char grade;
        boolean isPermanent;
        // 2nd --> Initialization
        empName = "Ravi";
        empId = 101;
        salary = 45000.75;
        grade = 'A';
        isPermanent = true;
        // Print variables
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Permanent: " + isPermanent);
        // Reassign the variables
        empName = "Sneha";
        empId = 102;
        salary = 52000.50;
        grade = 'B';
        isPermanent = false;
        // Print again
        System.out.println("---- After Changing Values ----");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Permanent: " + isPermanent);
    }
}