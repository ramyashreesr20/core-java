class InspireHub {

    String contentTitle;
    String topicName;
    int popularity;

    public InspireHub() {
    }

    public InspireHub(String contentTitle, String topicName, int popularity) {
        this.contentTitle = contentTitle;
        this.topicName = topicName;
        this.popularity = popularity;
    }

    public void display() {
        System.out.println(contentTitle);
        System.out.println(topicName);
        System.out.println(popularity);
        System.out.println("-------------------");
    }
}