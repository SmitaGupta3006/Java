package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatVal = Float.MIN_VALUE;
        float myMaxFloatVal = Float.MAX_VALUE;
        System.out.println("Float Minimum Value is = " + myMinFloatVal);
        System.out.println("Float Maximum Value is = " + myMaxFloatVal);

        double myMinDoubleVal = Double.MIN_VALUE;
        double myMaxDoubleVal = Double.MAX_VALUE;
        System.out.println("Double Minimum Value is = " + myMinDoubleVal);
        System.out.println("Double Maximum Value is = " + myMaxDoubleVal);

        int myIntVal = 5 / 3;
        float myFloatVal = 5f / 3f;
        double myDoubleVal = 5d / 3d;
        System.out.println("MyIntValue " + myIntVal);
        System.out.println("MyFloatValue " + myFloatVal);
        System.out.println("MyDoubleValue " + myDoubleVal);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d ;
        System.out.println("The Equivalent amount in kilograms is " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
