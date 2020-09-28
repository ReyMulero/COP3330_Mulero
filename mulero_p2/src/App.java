import java.util.ArrayList;
import java.util.Scanner;



public class App {
    private static double Height;
    private static double Weight;
    private static ArrayList<Double> Scores = new ArrayList<Double>();

    private static double getUserHeight() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a height for user in height in inches please");
        Height = in.nextInt();
        in.nextLine();
        while( Height <0) {
            System.out.println("you enter a invalid response");
            System.out.println("pleas enter a new number and please make sure it is positive");
            Height = in.nextInt();

        }

        if (Height > 0){
            System.out.println("you entered " + Height);
        }

        return Height;
    }

    private static double getUserWeight() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a weight for user in weight in pounds please");
        Weight = in.nextInt();

        while( Weight <0)
        {
            System.out.println("you enter a invalid response");
            System.out.println("pleas enter a new number and please make sure it is posative");
            Weight = in.nextInt();
            in.nextLine();
        }
        if (Weight > 0){
            System.out.println("you entered " + Weight);
        }

        return Weight;
    }

    private static void displayBmiInfo(BodyMassIndex bmi) {
        double bmiscore;
        String BmiCategory;
        bmiscore = bmi.BmiCalculation(Height,Weight);
        System.out.printf("Your bmi is %.1f \n", bmiscore);
        Scores.add(bmiscore);
        BmiCategory = bmi.BmiCategory(bmiscore);
        System.out.println("with a category of "+ BmiCategory);
        System.out.println();
    }

    private static boolean moreInput() {
        Scanner in = new Scanner(System.in);
        boolean answer;
        System.out.println("would you like to enter a new set of measurements for calculations\n" +
                "type Y for yes or N for no");
        String YesOrNo = in.nextLine();
        if (YesOrNo.equalsIgnoreCase("Y")){
            answer = true;
        }
        else {
            answer = false;
        }
        return answer;
    }

    private static void displayBmiStatistics() {
         int count = 0;
         double total = 0;
        for (double score:Scores) {
           total += score;
           count++;
        }
        double average = 0;
        average = total/count;
        System.out.printf("The average of all bmi enter is %.1f \n",average);
    }

    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);
            System.out.println();
            displayBmiInfo(bmi);
        }

        displayBmiStatistics();
    }



}




