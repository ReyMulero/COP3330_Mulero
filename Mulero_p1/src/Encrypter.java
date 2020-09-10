public class Encrypter {

    public static int[] swapNumbersPlaces(int digit1, int digit2, int digit3, int digit4){
        int[] numers = new int[4];
        numers[0]= digit1;
        numers[1]= digit2;
        numers[2] = digit3;
        numers[3] = digit4;

        int SwapVariable;
        SwapVariable = numers[0];
        numers[0] = numers[2];
        numers[2]= SwapVariable;
        SwapVariable =digit2;
        numers[1]= digit4;
        numers[3] = SwapVariable;
        return numers;
    }

     String encrypt(String input){
        int data = Integer.parseInt(input);
        int[] digits = new int[4];
        digits[0] = data/1000;
        digits[1] = (data/ 100)%10;
        digits[2] = (data/10)%10;
        digits[3] = data%10;

        //  System.out.println("digit1 = "+digits[0] +", digit2 = "+ digits[1] +", digit3 = "+ digits[2] + ", digit4 = "+digits[3] +"\n");

        digits[0] =  (digits[0] +7)%10 ;
        digits[1] = (digits[1] +7)%10;
        digits[2] = (digits[2] +7)%10;
        digits[3] = (digits[3] +7)%10;

       /* System.out.println("your new encrypted digits are \n" +
                "digit1 = "+digits[0] +", digit2 = "+ digits[1] +", digit3 = "+ digits[2] + ", digit4 = "+digits[3] +"\n");
        */
        int[] newdigits = swapNumbersPlaces(digits[0], digits[1], digits[2], digits[3]);

        /*System.out.println("your new  switch around encrypted digits are\n digit1 = "+newdigits[0]+", digit2 = "+ newdigits[1]+
                ", digit3 = "+ newdigits[2] + ", digit4 = "+ newdigits[3] +"\n");
        */
        String digit1String =  Integer.toString(newdigits[0]);
        String digit2String =  Integer.toString(newdigits[1]);
        String digit3String =  Integer.toString(newdigits[2]);
        String digit4String =  Integer.toString(newdigits[3]);

        String  FinalStringToReturn =(digit1String+digit2String+digit3String+digit4String);
       /*   System.out.println(input+" was encrypted to "+FinalStringToReturn);
        //testing to see if it worked, and is not need for final submitting so comment it out
       */
        return FinalStringToReturn;

    }



}
