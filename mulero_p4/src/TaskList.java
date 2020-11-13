import java.util.List;
import java.util.Scanner;

public class TaskList {
    private static final Scanner in = new Scanner(System.in);

    public static void CreateTasklist(){
        List<tasklist> TaskList = new List<tasklist>();

    }

    public static void taskListOptions(){
            int optionpicked;
            do {
                System.out.println("---------task list option menu----------");
                System.out.println("1) view current list\n" +
                                   "2) add an item\n" +
                                   "3) remove a task item\n" +
                                   "4) edit a task item\n"+
                                   "5) mark item as completed\n" +
                                   "6) unmark item from completed\n" +
                                   "7) save the current list\n" +
                                   "8) quit to the main menu");
                System.out.println("----------------------------------------\n");
                System.out.println("please select an option from this menu");
                optionpicked = in.nextInt();
                in.nextLine();
                TaskToDo(optionpicked);

            }while (optionpicked != 8);

        }

     private static void TaskToDo(int menuItemPicked){

        switch (menuItemPicked){
            case 1:
                // have the user see what task are in current list
                break;
            case 2:
                //have a user create a new item to add to the task list
                break;

            case 3:
                // have the user remove an item from the task list
                break;

            case 4:
                // have the user edit an item uin the task list
                break;

            case 5:
                //have the user choose to mark an item as completed in the task list
                break;

            case 6:
                // have the user unmark a item from there completed task list
                break;

            case 7:
                //have the user save the current task list to a text file
                break;


            default:
                System.out.println("you have decide to go back to the main menu\n\n");
                App.mainMenu();

        }
     }


    }

