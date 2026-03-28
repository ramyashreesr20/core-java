class NoteSpecification {

    static String paperType = "CottonMix";

    public static void main(String[] args){

        int lengthInCM = 15;
        String noteShade = "Pink";

        System.out.println("For 500rs Note : " + paperType);
        System.out.println("For 500rs Note : " + lengthInCM);
        System.out.println("For 500rs Note : " + noteShade);

        String specialPaper = "FiberMix";
        int noteLength = 18;
        String noteColor = "Black";
        
        System.out.println("For 200rs Note : " + specialPaper);
        System.out.println("For 200rs Note : " + noteLength);
        System.out.println("For 200rs Note : " + noteColor);
         
        noteLength = 20;
        noteColor = "White";
       
        System.out.println("For 200rs Note : " + paperType);
        System.out.println("For 200rs Note : " + noteLength);
        System.out.println("For 200rs Note : " + noteShade);
    }
}