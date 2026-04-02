class VisionVaultRunner {
    public static void main(String[] args) {

        VisionVault v1 = new VisionVault("DIY Craft", "Home Ideas", 120);
        VisionVault v2 = new VisionVault("Makeup Look", "Beauty Tips", 340);
        VisionVault v3 = new VisionVault("Workout Plan", "Fitness Goals", 210);
        VisionVault v4 = new VisionVault("Study Notes", "Exam Prep", 180);
        VisionVault v5 = new VisionVault("Travel Spots", "Holiday Plans", 400);
        VisionVault v6 = new VisionVault("Healthy Recipes", "Food Ideas", 275);
        VisionVault v7 = new VisionVault("Outfit Style", "Fashion Board", 150);

        // Loop used instead of repeating display calls (style changed)
        VisionVault[] list = {v1, v2, v3, v4, v5, v6, v7};

        for (VisionVault v : list) {
            v.showDetails();
        }
    }
}