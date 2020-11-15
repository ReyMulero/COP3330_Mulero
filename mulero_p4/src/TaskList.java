import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {

    private static int arrayNumber;
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

               tasklist.add( arrayNumber +") "+TaskItem.CreateNewItem());
               arrayNumber++;
                break;

            case 3:
                int itemToRemove;
                System.out.println("-----------------------------");
                System.out.println("please enter the number that for the slot that you wish to remove from the list ");
                itemToRemove = in.nextInt();
                tasklist.remove(itemToRemove);
                System.out.println("---------------------------");
                // have the user remove an item from the task list
                break;

            case 4:
                int changeListLocation;
                String newListItemSet;
                System.out.println("pleas enter the list location you would like to change");
                changeListLocation = in.nextInt();
                in.nextLine();
               newListItemSet = TaskItem.CreateNewItem();
                    tasklist.set(changeListLocation,newListItemSet);
                // have the user edit an item in the task list
                break;

            case 5:
                int markAsCompleted;
                String completionMark = "*****";

                System.out.println("-------uncompleted task-----------");
                for (String data:tasklist) {
                    int i = 0;
                    if (!tasklist.get(i).startsWith("**")){
                        System.out.println(data);
                    }
                    i++;
                    continue;
                }
                System.out.println("--------------------------------------------");

                System.out.println("please choose an item from your list of item by list number to mark as completed");
                markAsCompleted = in.nextInt();
                in.nextLine();
                tasklist.set(markAsCompleted,completionMark + tasklist.get(markAsCompleted));


                //have the user choose to mark an item as completed in the task list
                break;

            case 6:
                int unmarkFromCompleted;
                for (String data:tasklist) {
                    int i = 0;
                    if (tasklist.get(i).startsWith("**")){
                        System.out.println(data);
                    }
                    i++;
                }
                System.out.println("--------------------------------");
                System.out.println("please choose an item from your list of item by list number to unmark from completed item");
                unmarkFromCompleted= in.nextInt();
                in.nextLine();
               
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

