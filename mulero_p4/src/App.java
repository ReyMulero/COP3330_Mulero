import java.util.Scanner;

public class App {
    App app = new App();
    private static final Scanner mainMenuChoice = new Scanner(System.in);
    private static void getMainMenuChoice(int choice){
        boolean exitLoop = false;
        do {
            switch (choice) {
                case 1:
                    TaskList.tasklistOptions();
                    System.out.println("\nyou have created a new task list\n");
                    exitLoop = true;
                    break;
                case 2:
                    TaskList.AlreadyCreatedList();
                    System.out.println("here is a list of your current task list\n");
                    exitLoop = true;
                    break;
                case 3:
                    System.out.println("Thank for using Task Manger v.1.0 and have a nice day");
                    System.exit(-1);

                default:
                    System.out.println("You did not enter a valid choice pleas enter a number from 1-3");
                    choice = mainMenuChoice.nextInt();
                    mainMenuChoice.nextLine();
            }
        }while(exitLoop == false);
    }


    public static void main(String[] args) {
        /*
        A task list shall contain 0 or more task items
        An task item shall contain a title
        A title shall be 1 or more characters in length
        An task item shall contain a description
        A description shall be 0 or more characters in length
        An task item shall contain a due date
        A due date shall be in the format of YYYY-MM-DD
        A user shall be able to create a new task list
        A user shall be able to load an existing task list

        A user shall be able to view the current task list
        A user shall be able to save the current task list
        A user shall be able to add an item to the current task list
        A user shall be able to edit an item in the current task list
        A user shall be able to remove an item from the current task list
        A user shall be able to mark an item in the current task list as completed
        A user shall be able to unmark an item in the current task list as completed
       */

        System.out.println("---------------------Main Menu---------------------------");
        System.out.println("Welcome to Task Manger v.1.0 what would you like to do\n");
        System.out.println("1) create a new list\n"+
                           "2) work on an existing list\n" +
                           "3) exit the program\n");
        System.out.println("--------------------------------------------------------");

        int choice;
        choice = mainMenuChoice.nextInt();
        mainMenuChoice.nextLine();
        getMainMenuChoice(choice);

    }
}
