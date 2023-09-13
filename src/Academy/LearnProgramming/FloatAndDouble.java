package Academy.LearnProgramming;

public class FloatAndDouble {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MIN_VALUE;
        System.out.println("float minimum value = " + myMinFloatValue);
        System.out.println("float maximum value =" + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value =" + myMinDoubleValue);
        System.out.println("double maximum value =" + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue  = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

    }
}
