class VisionVault {

    String title;
    String category;
    int score;

    
    public VisionVault(String t, String c, int s) {
        title = t;
        category = c;
        score = s;
    }

    void showDetails() {
        System.out.println("Title     : " + title);
        System.out.println("Category  : " + category);
        System.out.println("Score     : " + score);
        System.out.println("========================");
    }
}