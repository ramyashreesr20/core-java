class DreamVacation {
    public static void main(String[] args) {
        // ===== Declaration + Initialization  =====
        double expenseAmount = 36000.85;
        String vacationSpot = "Shimla";
        boolean tripStatus = true;
        int peopleCount = 11;
        char vacationGrade = 'A';
        // ===== Display Details =====
        System.out.println("<<<<<<<< DREAM VACATION DETAILS >>>>>>>>");
        System.out.println("Spot           : " + vacationSpot);
        System.out.println("People Count   : " + peopleCount);
        System.out.println("Expense Amount : " + expenseAmount);
        System.out.println("Vacation Grade : " + vacationGrade);
        System.out.println("Trip Status    : " + tripStatus);
        // ===== Changing Values) =====
        vacationSpot = "Kodaikanal";
        vacationGrade = 'B';
        expenseAmount = 25000.40;
        tripStatus = false;
        peopleCount = 6;
        // ===== Updated Output =====
        System.out.println("\n<<<<<<<< UPDATED VACATION DETAILS >>>>>>>>");
        System.out.println("Grade          : " + vacationGrade);
        System.out.println("Spot           : " + vacationSpot);
        System.out.println("Status         : " + tripStatus);
        System.out.println("People Count   : " + peopleCount);
        System.out.println("Expense Amount : " + expenseAmount);
    }
}