import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskApp {

    public static void getMainMenuChoice(){
        Scanner input = new Scanner(System.in);
        menuOptionPicked(input);
    }

    private static void menuOptionPicked(Scanner input) {
        int optionPickFromMainMenu;
        boolean exitLoop = false;
        try{
            optionPickFromMainMenu = input.nextInt();
            input.nextLine();
            do {
                switch (optionPickFromMainMenu) {
                    case 1:
                        System.out.println("you have created a new list\n\n");
                        exitLoop = true;
                        TaskItem.createList();
                        break;
                    case 2:
                        System.out.println("you have choose to look at a your previous created list");
                        TaskList.loadList();
                        exitLoop = true;
                        break;
                    case 3:
                        exitLoop = true;
                        System.out.println("Thank you for using Task Manger v.1.0");
                        System.exit(-1);
                        break;
                    default:
                        System.out.println("please enter a valid response of a number from 1-3");
                        optionPickFromMainMenu = input.nextInt();
                        input.nextLine();
                }
            } while (!exitLoop);
        }catch (InputMismatchException | FileNotFoundException e){
            System.out.println("you enter the illegal value");
            mainMenu();
        }
    }

    public static void mainMenu(){
        System.out.println("---------------Task List main menu------------------\n");
        System.out.println("1) create a new list\n" +
                "2) load a created list\n" +
                "3) exit program");
        System.out.println("\n------------------------------------------\n");
        System.out.println("please enter a number from 1-3");
        getMainMenuChoice();
    }

    public static void TaskApp() {
        TaskApp app = new TaskApp();
        app.mainMenu();
    }
}
