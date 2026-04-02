class SnapStyleRunner {
    public static void main(String[] args) {

        SnapStyle s1 = new SnapStyle("P00ja Craft", "Home Ideas", 640);
        SnapStyle s2 = new SnapStyle("Makeup Look", "Beauty Tips", 940);
        SnapStyle s3 = new SnapStyle("Workout Plan", "Fitness Goals", 100);
        SnapStyle s4 = new SnapStyle("Study Notes", "Exam Prep", 180);
        SnapStyle s5 = new SnapStyle("Travel Spots", "Holiday Plans", 530);
        SnapStyle s6 = new SnapStyle("Healthy Recipes", "Food Ideas", 275);
        SnapStyle s7 = new SnapStyle("Outfit Style", "Fashion Board", 970);

        // Printing using return method (style changed)
        System.out.println(s1.getDetails());
        System.out.println(s2.getDetails());
        System.out.println(s3.getDetails());
        System.out.println(s4.getDetails());
        System.out.println(s5.getDetails());
        System.out.println(s6.getDetails());
        System.out.println(s7.getDetails());
    }
}