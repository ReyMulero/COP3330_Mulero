import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class TaskList {
    private static final Scanner in = new Scanner(System.in);

    private static ArrayList<String> tasklist = new ArrayList<>();

    public static void loadList() throws FileNotFoundException {
        ArrayList<String> listFromTxt;
        System.out.print("enter the file name you wish to get: ");
        listFromTxt = GrabFile();
        tasklist = listFromTxt;
        taskListMenu();
    }

    private static ArrayList<String> GrabFile() throws FileNotFoundException {
        String fileName;
        fileName = in.nextLine();
        ArrayList<String> tempListlocation = new ArrayList<String>();
        try{
            int i = 0;
            File file = new File(fileName);
            Scanner readFile = new Scanner(file);
            while(readFile.hasNextLine()){
                tempListlocation.add(readFile.nextLine());
                i++;
            }
        }catch (FileNotFoundException e){
            System.out.println("-------------\n" +
                    "file not found please enter a valid file name \n" +
                    "------------------\n");
            //e.printStackTrace();
            loadList();
        }return tempListlocation;

    }

    public static void taskListOptions(ArrayList<String> tasklist) throws FileNotFoundException {
        taskListMenu();

    }

    private static void taskListMenu() throws FileNotFoundException {
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
                viewTaskList();
                break;
            case 2:
                addItemToList();
                break;

            case 3:
                RemoveItmeFromList();

                break;

            case 4:
                editItemList();
                break;

            case 5:
                markItemAsComplete();
                break;

            case 6:
                RemoveCompletionMarkFRomCompletedItem();
                break;

            case 7:
                writeToFile(tasklist);

                break;


            default:
                System.out.println("you have decide to go back to the main menu\n\n");
                tasklist.clear();
                App.mainMenu();

        }
    }

    private static void RemoveCompletionMarkFRomCompletedItem() {
        int unmarkFromCompleted;
        int i = 0;
        for (String data:tasklist) {

            if (data.startsWith("**")){
                System.out.println(i +") "+data);

            }
            i++;
        }

        System.out.println("please choose an item from your list of item by list number to unmark from completed item");
        System.out.println("--------------------------------");
        unmarkFromCompleted= in.nextInt();
        in.nextLine();
        tasklist.set(unmarkFromCompleted, tasklist.get(unmarkFromCompleted).substring(5));
    }

    private static void markItemAsComplete() {
        int markAsCompleted;
        int i = 0;
        String completionMark = "*****";

        System.out.println("-------uncompleted task-----------");
        for (String data:tasklist) {

            if (!data.startsWith("**")){
                System.out.println(i +") "+ data);
                i++;
            }

        }
        System.out.println("--------------------------------------------");

        System.out.println("please choose an item from your list of item by list number to mark as completed");
        markAsCompleted = in.nextInt();
        in.nextLine();
        tasklist.set(markAsCompleted,completionMark + tasklist.get(markAsCompleted));
    }

    private static void editItemList() {
        int changeListLocation;
        int i = 0;
        String newListItemSet;
        DisplayList(i);
        System.out.println("pleas enter the list location you would like to change");
        System.out.println("----------------------------\n");
        changeListLocation = in.nextInt();
        in.nextLine();
        newListItemSet = TaskItem.CreateNewItem();
        tasklist.set(changeListLocation,newListItemSet);
    }

    private static void RemoveItmeFromList() {
        int itemToRemove;
        int i = 0;
        DisplayList(i);
        System.out.print("please enter the number that for the slot that you wish to remove from the list: \n");
        itemToRemove = in.nextInt();
        tasklist.remove(itemToRemove);
        System.out.println("---------------------------");
    }

    private static void addItemToList() {
        tasklist.add( TaskItem.CreateNewItem());
    }

    private static void viewTaskList() {
        int i = 0;
        System.out.println("current item in the list\n");
        DisplayList(i);
        System.out.println("\n--------------------------------------------");
    }

    private static void DisplayList(int i) {
        for (String data:tasklist) {
            System.out.println(i +") " + data);
            i++;

        }
    }

    private static void writeToFile(ArrayList<String> tasklist){
        String fileName;
        System.out.print("enter a file name:");
        fileName = in.nextLine();
        try( Formatter output = new Formatter(fileName)) {
            for (String data : TaskList.tasklist) {
                output.format("%s%n", data);
            }
            System.out.println("file"+fileName + "hase been saved");
        }catch(FileNotFoundException e){
            System.out.println("no file was found");
        }
    }

}