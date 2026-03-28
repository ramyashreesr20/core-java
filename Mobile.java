class Mobile {

    public static void main(String[] args) {

        String[] mobileBrand = {"Samsung", "Apple", "OnePlus", "Vivo", "Oppo"};
        int[] mobilePrice = {20000, 80000, 35000, 18000, 22000};

        // Printing using index values
        System.out.println("----- Printing using Index -----");

        System.out.println(mobileBrand[0] + " : " + mobilePrice[0]);
        System.out.println(mobileBrand[1] + " : " + mobilePrice[1]);
        System.out.println(mobileBrand[2] + " : " + mobilePrice[2]);
        System.out.println(mobileBrand[3] + " : " + mobilePrice[3]);
        System.out.println(mobileBrand[4] + " : " + mobilePrice[4]);

        // Printing using foreach loop
        System.out.println("----- Printing using Foreach Loop -----");

        for(String brand : mobileBrand){
            System.out.println("Brand: " + brand);
        }

        for(int price : mobilePrice){
            System.out.println("Price: " + price);
        }

    }
}