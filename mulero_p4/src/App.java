import java.util.InputMismatchException;
import java.util.Scanner;

public class App {



    public static void getMainMenuChoice(){

        int optionPickFromMainMenu;
        Scanner input = new Scanner(System.in);
        boolean exitLoop = false;
        try{

            optionPickFromMainMenu = input.nextInt();


            do {
            switch (optionPickFromMainMenu) {
                case 1:
                    System.out.println("you have created a new list\n\n");
                    exitLoop = true;
                   TaskItem.createList();
                    // TaskItem.dueDate();
                    //TaskItem.description();
                    //TaskItem.title();
                    break;
                case 2:
                    System.out.println("you have choose to look at a your previous created list");
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
        }catch (InputMismatchException e){
            System.out.println("you enter the illegal value");
            //e.printStackTrace();
           mainMenu();
        }

        }


    public static void mainMenu(){
        System.out.println("---------------main menu------------------\n");
        System.out.println("1) create a new list\n" +
                           "2) view created list\n" +
                           "3) exit program");
        System.out.println("\n------------------------------------------\n");
        System.out.println("please enter a number from 1-3");
        getMainMenuChoice();
    }

    public static void main(String[] args) {
        App app = new App();
        app.mainMenu();




    }



}
