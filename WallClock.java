class Meesho {
    public static void main(String[] args) {
        // int
        int cost1 = -2147483648;
        System.out.println("min value of int data type: " + cost1);
        int cost = 2147483647;
        System.out.println("max value of int data type: " + cost);
        // short
        short hours = -32768;
        System.out.println("min value of short data type: " + hours);
        short hour = 32767;
        System.out.println("max value of short data type: " + hour);
        // long
        long minutes = Long.MIN_VALUE;
        System.out.println("min value of long data type: " + minutes);
        long timer = Long.MAX_VALUE;
        System.out.println("max value of long data type: " + timer);
        // byte
        byte seconds = -128;
        System.out.println("min value of byte data type: " + seconds);
        byte sec = 127;
        System.out.println("max value of byte data type: " + sec);
        // float
        float screensize = -3.4028235f;
        System.out.println("min value of float data type: " + screensize);
        float screenlength = 3.4028235f;
        System.out.println("max value of float data type: " + screenlength);
        // double
        double batterycapacity = -1.7976931348623157E308;
        System.out.println("min value of double data type: " + batterycapacity);
        double batteryrate = 1.7976931348623157E308;
        System.out.println("max value of double data type: " + batteryrate);
        // char
        char rating = 'A';
        System.out.println("min value of char data type: " + rating);
        char rate = 'Z';
        System.out.println("max value of char data type: " + rate);
        // boolean
        boolean isWallClock = false;
        System.out.println("min value of boolean data type: " + isWallClock);
        boolean isWallClock2 = true;
        System.out.println("max value of boolean data type: " + isWallClock2);
    }
}