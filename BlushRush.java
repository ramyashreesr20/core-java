class BlushRush {

    String styleName;
    String themeType;
    int rating;

    BlushRush(String s, String t, int r) {
        styleName = s;
        themeType = t;
        rating = r;
    }

    void printInfo() {
        System.out.println("Style  -> " + styleName);
        System.out.println("Theme  -> " + themeType);
        System.out.println("Rating -> " + rating);
        System.out.println("***********************");
    }
}