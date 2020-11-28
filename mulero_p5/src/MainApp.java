import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    private static void MainMenuScannerInitalizer() {
        Scanner in = new Scanner(System.in);
        menuoptionPicked(in);
    }


    public static void menuoptionPicked(Scanner in){
        int mainMenuOptionPicked;
        boolean exitLoop = false;
        try {
            mainMenuOptionPicked = in.nextInt();
            in.nextLine();
            do {
                switch (mainMenuOptionPicked) {
                    case 1:
                        exitLoop = true;
                        TaskApp.TaskApp();
                        break;
                    case 2:
                        ContactApp.App();
                        exitLoop = true;
                        break;
                    case 3:
                        System.out.println("thank you for using Work Flow Manger\n" +
                                "have a good day");
                        exitLoop = true;
                        System.exit(-1);
                        break;
                    default:
                        System.out.println("please enter a valid response of a number from 1-3");
                        mainMenuOptionPicked = in.nextInt();
                        in.nextLine();
                }
            }while(!exitLoop);
        }catch(InputMismatchException e){
            System.out.println("you have enter an invalid option please enter a number from 1-3");
            System.out.println("please pick a value option from the menu below");
            System.out.println("------------------------------------------------------------");
            mianMenuSelctionScreen();
        }
    }

    public static void mianMenuSelctionScreen(){
        System.out.println("1) Task List menu\n" +
                           "2) Contact List menu\n" +
                           "3) Exit");
        System.out.println("----------------------------" +
                       "--------------------------------");
        MainMenuScannerInitalizer();
    }




    public static void main(String[] args) {
        System.out.println("----------------Welcome to Work Flow Manger----------------\n");
        System.out.println("please choose an option from are menu below\n" +
                           "to start you on your journey to more efficiency\n" +
                           "\n------------------------------------------------------------");
        mianMenuSelctionScreen();
    }
}
