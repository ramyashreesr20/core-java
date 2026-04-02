class TrendPinRunner {
    public static void main(String[] args) {

        TrendPin homeVibe = new TrendPin("Likitha", "Home Ideas", 873);
        homeVibe.display();

        TrendPin glamLook = new TrendPin("Makeup Look", "Beauty Tips", 578);
        glamLook.display();

        TrendPin fitZone = new TrendPin("Workout Plan", "Fitness Goals", 655);
        fitZone.display();

        TrendPin studyAura = new TrendPin("Study Notes", "Exam Prep", 176);
        studyAura.display();

        TrendPin travelMood = new TrendPin("Travel Spots", "Holiday Plans", 464);
        travelMood.display();

        TrendPin healthyBites = new TrendPin("Healthy Recipes", "Food Ideas", 843);
        healthyBites.display();

        TrendPin styleSnap = new TrendPin("Outfit Style", "Fashion Board", 974);
        styleSnap.display();
    }
}