class SpaceMission {
    public static void main(String[] args) {
        // 1st --> Declaration
        String missionName;
        int astronauts;
        double missionDuration;
        char missionGrade;
        boolean isSuccessful;
        // 2nd --> Initialization
        missionName = "Chandrayaan";
        astronauts = 4;
        missionDuration = 15.5;
        missionGrade = 'A';
        isSuccessful = true;
        // Print variables
        System.out.println("Mission Name: " + missionName);
        System.out.println("Number of Astronauts: " + astronauts);
        System.out.println("Mission Duration: " + missionDuration);
        System.out.println("Mission Grade: " + missionGrade);
        System.out.println("Successful: " + isSuccessful);
        // Reassign the variables
        missionName = "Mars Explorer";
        astronauts = 6;
        missionDuration = 30.0;
        missionGrade = 'S';
        isSuccessful = false;
        // Print again
        System.out.println("---- After Changing Values ----");
        System.out.println("Mission Name: " + missionName);
        System.out.println("Number of Astronauts: " + astronauts);
        System.out.println("Mission Duration: " + missionDuration);
        System.out.println("Mission Grade: " + missionGrade);
        System.out.println("Successful: " + isSuccessful);
    }
}