class InspireHubRunner {
    public static void main(String[] args) {

        InspireHub craftZone = new InspireHub("DIY Craft", "Home Ideas", 146);
        craftZone.display();

        InspireHub glamStudio = new InspireHub("Makeup Look", "Beauty Tips", 385);
        glamStudio.display();

        InspireHub fitnessFlow = new InspireHub("Workout Plan", "Fitness Goals", 610);
        fitnessFlow.display();

        InspireHub studyNest = new InspireHub("Study Notes", "Exam Prep", 165);
        studyNest.display();

        InspireHub travelDiary = new InspireHub("Travel Spots", "Holiday Plans", 670);
        travelDiary.display();

        InspireHub healthBowl = new InspireHub("Healthy Recipes", "Food Ideas", 745);
        healthBowl.display();

        InspireHub styleCanvas = new InspireHub("Outfit Style", "Fashion Board", 798);
        styleCanvas.display();
    }
}