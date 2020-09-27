public class BodyMassIndex {

    public double BmiCalculation( double inches , double pounds){
       double Bmi = 0;
       Bmi =(703 * pounds / Math.pow(inches,2));
       return Bmi;
    }
    public String BmiCategory(double Bmi){
        String bmiCategory = "";
        if (Bmi < 18.5){
            bmiCategory= "underweight";
        }
        else if ((Bmi >=18.5) && (Bmi <= 24.99)){
            bmiCategory = "normal";

        }
        else if ((Bmi>= 25 )&& (Bmi <= 29.99)){
            bmiCategory = "overweight";
        }
        else if (Bmi >= 30) {
            bmiCategory = "Obesity";
        }
        return bmiCategory;
    }

    BodyMassIndex(double height, double weight){
        double bmi;
        bmi = BmiCalculation(height, weight);
        BmiCategory(bmi);
    }

}


