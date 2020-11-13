import java.util.Scanner;

public class App {
private static final Scanner choice = new Scanner(System.in);

    public static void getMainMenuChoice(int mainMenuAnswer){
        int optionPickFromMainMenu = mainMenuAnswer;
        boolean exitLoop = false;
        do {
            switch (optionPickFromMainMenu){
                case 1:
                    System.out.println("you have created a new list");
                    exitLoop = true;
                        break;
                case 2:
                    System.out.println("you have choose to look at a your preexisting list");
                    exitLoop = true;
                        break;
                case 3:
                    exitLoop = true;
                    System.out.println("thannk you for using Task Manger v.1.0");
                    System.exit(-1);
                    break;
                default:
                    System.out.println("please enter a valid response of a number from 1-3");
                    optionPickFromMainMenu = choice.nextInt();
                    choice.nextLine();
            }
        }while(exitLoop);

    }

    public static void main(String[] args) {
        System.out.println("---------------main menu------------------\n");
        System.out.println("1) create a new list\n" +
                           "2) view created list\n" +
                           "3) exit program");
        System.out.println("\n------------------------------------------\n");
        System.out.println("please enter a number from 1-3");
        int mainMenuChoice;
        mainMenuChoice = choice.nextInt();
        choice.nextLine();
        getMainMenuChoice(mainMenuChoice);

    }



}
