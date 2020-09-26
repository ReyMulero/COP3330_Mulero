import java.util.ArrayList;
import java.util.Scanner;



public class App {

    private static double getUserHeight() {
        Scanner in = new Scanner(System.in);
        double height;
        System.out.println("Please enter a weight for user in height in inches please");
        height = in.nextInt();
        in.nextLine();
        while( height <0) {
            System.out.println("you enter a negative number");
            System.out.println("pleas enter a new number and please make sure it is posative");
            height = in.nextInt();
            in.nextLine();
        }

        if (height > 0){
            System.out.print("you entered " + height);
            in.nextLine();
        }

        return height;
    }

    private static double getUserWeight() {
        Scanner in = new Scanner(System.in);
        double weight;
        System.out.println("Please enter a weight for user in height in inches please");
        weight = in.nextInt();
        in.nextLine();
        while( weight <0)
        {
            System.out.println("you enter a negative number");
            System.out.println("pleas enter a new number and please make sure it is posative");
            weight = in.nextInt();
            in.nextLine();
        }
        if (weight > 0){
            System.out.print("you entered " + weight);
            in.nextLine();
        }

        return weight;
    }

    private static void displayBmiInfo(BodyMassIndex bmi) {
    }

    private static boolean moreInput() {
    }

    private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
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

        displayBmiStatistics(bmiData);
    }



}




