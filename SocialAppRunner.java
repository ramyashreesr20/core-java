class SocialAppRunner {

    public static void main(String[] args) {

        // Initialize static variables
        SocialApp.companyName = "Google";
        SocialApp.appName = "YouTube";

        // Object 1
        SocialApp user1 = new SocialApp();
        user1.personName = "Ramya";
        user1.email = "ramya@gmail.com";
        user1.phNo = 47485656810L;
        user1.dob = "20-03-2006";
        user1.userName = "ramya_yt";
        user1.password = "ramya@123";

        System.out.println("Company Name: " + SocialApp.companyName);
        System.out.println("App Name: " + SocialApp.appName);
        System.out.println("User1 Name: " + user1.personName);

        // Object 2
        SocialApp user2 = new SocialApp();
        user2.personName = "Sneha";
        user2.email = "sneha@gmail.com";
        user2.phNo = 9123456780L;
        user2.dob = "05-07-2002";
        user2.userName = "sneha_live";
        user2.password = "sneha@456";

        System.out.println("Company Name: " + SocialApp.companyName);
        System.out.println("App Name: " + SocialApp.appName);
        System.out.println("User2 Name: " + user2.personName);
    }
}