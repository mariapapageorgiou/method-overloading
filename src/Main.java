public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);

        calcFeetAndInchesToCentimeters(3,9);
        calcFeetAndInchesToCentimeters(-10,1);
        calcFeetAndInchesToCentimeters(3,-1);
        calcFeetAndInchesToCentimeters(2, 17);
        calcFeetAndInchesToCentimeters(0,3);

        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(157);
        calcFeetAndInchesToCentimeters(-10);



    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    // Create a method called calcFeetAndInchesToCentimeters.
    // It needs to have two parameters.
    // feet is the first parameter, inches is the second parameter.
    //
    // Validate that the first parameter feet is >=0
    // Validate that the second parameter inches is >=0 and <=12
    // return -1 from the method if either of the above is not true
    // if the parameters are valid, then calculate how many centimetres comprise the feet and inches passed to this
    // method and return the value.
    //
    // Create a second method of the same name but with only one parameter inches
    // Validate that it is >=0, return -1 if it is not true
    // if it is valid, then calculate how many feet are in the inches
    // call the other overloaded method passing the correct feet and inches calculated so that it can calculate correctly
    //
    // hints: use double for your number datatypes
    // 1 inch = 2.54cm and 1 foot = 12 inches

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {

        if(feet >= 0 && (inches >=0 && inches<=12)) {
            double centimeters = feet*12*2.54 + inches*2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
        System.out.println("Invalid feet or inches parameters");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {

        if(inches>=0) {
            double feetInInches = (int) inches / 12;
            double inchesLeft = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feetInInches + " feet and " + inchesLeft + " inches");
            return calcFeetAndInchesToCentimeters(feetInInches, inchesLeft);
        }
        System.out.println("Invalid inches");
        return -1;
    }



}
