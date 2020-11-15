import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {


    private static final Scanner in = new Scanner(System.in);

    private static ArrayList<String> tasklist = new ArrayList<>();

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
                System.out.println("\n------------------------------------");
                TaskToDo(optionpicked);

            }while (optionpicked != 8);

        }

     private static void TaskToDo(int menuItemPicked){

        switch (menuItemPicked){

            case 1:
                System.out.println("current item in the list");
                for (String data:tasklist) {
                    System.out.println(data);
                }
                System.out.println("--------------------------------------------");
                    

                // have the user see what task are in current list
                break;
            case 2:
             //   System.out.println(TaskItem.CreateNewItem());
               tasklist.add(TaskItem.CreateNewItem());
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

