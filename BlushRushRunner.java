class BlushRushRunner {
    public static void main(String[] args) {

        BlushRush b1 = new BlushRush("kavyaCraft", "Home Ideas", 898);
        BlushRush b2 = new BlushRush("Makeup Look", "Beauty Tips", 340);
        BlushRush b3 = new BlushRush("Workout Plan", "Fitness Goals", 776);
        BlushRush b4 = new BlushRush("Study Notes", "Exam Prep", 897);
        BlushRush b5 = new BlushRush("Travel Spots", "Holiday Plans", 064);
        BlushRush b6 = new BlushRush("Healthy Recipes", "Food Ideas", 749);
        BlushRush b7 = new BlushRush("Outfit Style", "Fashion Board", 767);

        BlushRush[] arr = {b1, b2, b3, b4, b5, b6, b7};

        for (BlushRush x : arr) {
            x.printInfo();
        }
    }
}