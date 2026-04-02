class SnapStyle {

    String name;
    String type;
    int count;

    SnapStyle() {
        name = "Unknown";
        type = "General";
        count = 0;
    }

    SnapStyle(String n, String t, int c) {
        name = n;
        type = t;
        count = c;
    }

    String getDetails() {
        return "Name: " + name + "\nType: " + type + "\nCount: " + count + "\n-------------------";
    }
}