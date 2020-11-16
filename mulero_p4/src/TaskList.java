import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class TaskList {

    private static int arrayNumber;
    private static final Scanner in = new Scanner(System.in);

    private static ArrayList<String> tasklist = new ArrayList<>();


    public static void taskListOptions() throws FileNotFoundException {
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

     private static void TaskToDo(int menuItemPicked) throws FileNotFoundException {

        switch (menuItemPicked){

            case 1:
                System.out.println("current item in the list\n");
                for (String data:tasklist) {
                    System.out.println(data);
                }
                System.out.println("\n--------------------------------------------");
                    


                break;
            case 2:
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

                break;

            case 4:
                int changeListLocation;
                String newListItemSet;
                System.out.println("pleas enter the list location you would like to change");
                changeListLocation = in.nextInt();
                in.nextLine();
               newListItemSet = TaskItem.CreateNewItem();
                    tasklist.set(changeListLocation,changeListLocation + ")" + newListItemSet);

                break;

            case 5:
                int markAsCompleted;
                String completionMark = "*****";

                System.out.println("-------uncompleted task-----------");
                for (String data:tasklist) {

                    if (!data.startsWith("**")){
                        System.out.println(data);
                    }

                }
                System.out.println("--------------------------------------------");

                System.out.println("please choose an item from your list of item by list number to mark as completed");
                markAsCompleted = in.nextInt();
                in.nextLine();
                tasklist.set(markAsCompleted,completionMark + tasklist.get(markAsCompleted));

                break;

            case 6:
                int unmarkFromCompleted;
                for (String data:tasklist) {

                    if (data.startsWith("**")){
                        System.out.println(data);
                    }

                }
                System.out.println("--------------------------------");
                System.out.println("please choose an item from your list of item by list number to unmark from completed item");
                unmarkFromCompleted= in.nextInt();
                in.nextLine();
                tasklist.set(unmarkFromCompleted, tasklist.get(unmarkFromCompleted).substring(5));


                break;

            case 7:
                writeToFile(tasklist);

                //have the user save the current task list to a text file
                break;


            default:
                System.out.println("you have decide to go back to the main menu\n\n");
                App.mainMenu();

        }
     }

    private static void writeToFile(ArrayList<String> tasklist){
        try( Formatter output = new Formatter("listitems.txt")) {
            for (String data : TaskList.tasklist) {
                output.format("%s%n", data);
            }
        }catch(FileNotFoundException e){
            System.out.println("no file was found");
        }
    }

}

