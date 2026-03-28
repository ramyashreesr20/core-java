class Notebook {
    static String brand = "Classmate";
    public static void main(String[] args){
        int pages;
        String color;
        double price;
        String type;
        boolean isAvailable;
        char qualityGrade;
        color = "Blue";
        pages = 200;
        price = 85.50;
        isAvailable = true;
        qualityGrade = 'A';
        type = "Ruled";
 
        System.out.println("Brand          : " + brand);
        System.out.println("Pages          : " + pages);
        System.out.println("Color          : " + color);
        System.out.println("Price          : " + price);
        System.out.println("Type           : " + type);
        System.out.println("Available      : " + isAvailable);
        System.out.println("Quality Grade  : " + qualityGrade);
 
        pages = 300;
        color = "Red";
        price = 95.75;
        System.out.println("\n--- Updated Details ---");
        System.out.println("Pages          : " + pages);
        System.out.println("Color          : " + color);
        System.out.println("Price          : " + price);
    }
}