class IdeaBoard {

    String ideaTitle;
    String categoryName;
    int views;

    public IdeaBoard() {
    }

    public IdeaBoard(String ideaTitle, String categoryName, int views) {
        this.ideaTitle = ideaTitle;
        this.categoryName = categoryName;
        this.views = views;
    }

    public void display() {
        System.out.println(ideaTitle);
        System.out.println(categoryName);
        System.out.println(views);
        System.out.println("-------------------");
    }
}