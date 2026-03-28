class Car {
    public static void main(String[] args) {
        // 1st --> Declaration
        String brand;
        int modelYear;
        double price;
        char fuelType;
        boolean isAvailable;
        // 2nd --> Initialization
        brand = "Toyota";
        modelYear = 2022;
        price = 850000.50;
        fuelType = 'P';
        isAvailable = true;
        // Print variables
        System.out.println("Brand: " + brand);
        System.out.println("Model Year: " + modelYear);
        System.out.println("Price: " + price);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Available: " + isAvailable);
        // Reassign the variables
        brand = "Honda";
        modelYear = 2023;
        price = 920000.75;
        fuelType = 'D';
        isAvailable = false;
        // Print again
        System.out.println("---- After Changing Values ----");
        System.out.println("Brand: " + brand);
        System.out.println("Model Year: " + modelYear);
        System.out.println("Price: " + price);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Available: " + isAvailable);
    }
}