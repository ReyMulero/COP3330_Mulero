public class Decrypter {

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

String decryption(String input){
        int data =Integer.parseInt(input);
        //  System.out.println(data);
        int[] digit = new int[4];
        digit[0] = data/1000;
        digit[1] = (data/100)%10;
        digit[2] = (data/10)%10;
        digit[3] = data%10;

        // System.out.println("digit1 = "+digit[0] +", digit2 = "+ digit[1] +", digit3 = "+ digit[2] + ", digit4 = "+digit[3] +"\n");
         digit[0] = (digit[0] +3)%10;//digit[0] = ((digit[0] -7)+10)%10 = -7 so add 10 to get 3 so change it to +3 instead of -7+10 then %10
        digit[1] = (digit[1] +3)%10;//digit[0] = ((digit[0] -7)+10)%10 = -6 so add 10 to get 4 so change it to +3 instead of -7+10 then %10
        digit[2] = (digit[2] +3)%10;//digit[0] = ((digit[0] -7)+10)%10 = 1 so add 10 to get 11 so change it to +3 instead of -7+10 then %10
        digit[3] = (digit[3] +3)%10;//digit[0] = ((digit[0] -7)+10)%10 = 2 so add 10 to get 12 so change it to +3 instead of -7+10 then % 10

        int[] newdigits = swapNumbersPlaces(digit[0], digit[1], digit[2], digit[3]);


        String digit1String =  Integer.toString(newdigits[0]);
        String digit2String =  Integer.toString(newdigits[1]);
        String digit3String =  Integer.toString(newdigits[2]);
        String digit4String =  Integer.toString(newdigits[3]);


        /* System.out.println("your new decrypted digits are\n" +
                " digit1 = "+digit[0] +", digit2 = "+ digit[1] +", digit3 = "+ digit[2] + ", digit4 = "+digit[3]+ "\n");
         */String  FinalStringToReturn =(digit1String+digit2String+digit3String+digit4String);
        System.out.println(input+" was encrypted to "+FinalStringToReturn); //testing to see if it worked
        return FinalStringToReturn;

    }


}
