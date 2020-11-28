import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskList {
    private  static String completionMark = "*****";
    private static final Scanner in = new Scanner(System.in);

    public static ArrayList<TaskItem> tasklist = new ArrayList<>();

    public static void loadList()  {
        ArrayList<TaskItem> listFromTxt;
        System.out.print("enter the file name you wish to get: ");
        listFromTxt = GrabFile();
        tasklist = listFromTxt;
        taskListMenu();
    }

    private static ArrayList<TaskItem> GrabFile()  {
        String fileName;
        fileName = in.nextLine();
        ArrayList<TaskItem> tempListlocation = new ArrayList<>();
        try{
            File file = new File(fileName);
            Scanner readFile = new Scanner(file);
            String data[];
            TaskItem temp;
            while(readFile.hasNextLine()){
                data = readFile.nextLine().split(",",4);
                temp = new TaskItem(data[0],data[1],data[2],Boolean.parseBoolean(data[3]));
                tempListlocation.add(temp);
            }
        }catch (FileNotFoundException e){
            System.out.println("-------------\n" +
                    "file not found please enter a valid file name \n" +
                    "------------------\n");
            //e.printStackTrace();
            loadList();
        }
        return tempListlocation;//catch (DateTimeException)
    }

    public static void taskListMenu()  {
        int optionpicked;
        try {
            do {
                System.out.println("---------task list option menu----------");
                System.out.println("1) view current list\n" +
                        "2) add an item\n" +
                        "3) remove a task item\n" +
                        "4) edit a task item\n" +
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

            } while (optionpicked != 8);
        }catch (InputMismatchException e){
            System.out.println("you enter an invalid response please enter a number from 1-8");
            in.next();
            taskListMenu();
        }

    }

    private static void TaskToDo(int menuItemPicked)  {

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
                writeToFile();

                break;

            default:

                System.out.println("you have decide to go back to the main menu\n\n");
                tasklist.clear();
                TaskApp.mainMenu();

        }
    }

    private static void RemoveCompletionMarkFRomCompletedItem() {
        int markAsCompleted;
        int i = 0;
        String completionMark = "*****";

        System.out.println("-------completed task-----------");
        for (TaskItem data:tasklist) {

            if (data.getcompletedTask()){
                System.out.printf("%d) [%s] %s:  %s\n", i, data.getDueDate(), data.getTitle(), data.getDescription());
                i++;
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("please choose an item from your list of item by list number to unmark  from completed");
        markAsCompleted = in.nextInt();
        in.nextLine();
        TaskItem data = tasklist.get(markAsCompleted);
        if (data.getcompletedTask()){
            data.setcomplpletedTask(false);
        }

    }

    private static void markItemAsComplete() {
        int markAsCompleted;
        int i = 0;


        System.out.println("-------uncompleted task-----------");
        for (TaskItem data:tasklist) {

            if (!data.getcompletedTask()){
                System.out.printf("%d) [%s] %s:  %s\n", i, data.getDueDate(), data.getTitle(), data.getDescription());
                i++;
            }
        }

        System.out.println("--------------------------------------------");
        System.out.println("please choose an item from your list of item by list number to mark as completed");
        markAsCompleted = in.nextInt();
        in.nextLine();
        System.out.println(tasklist.get(markAsCompleted));
       boolean changeBooleonToTrue = true;
        tasklist.get(markAsCompleted).setcomplpletedTask(changeBooleonToTrue);
       // if (data.getcompletedTask() != false){
      //      data.setcomplpletedTask(true);
       // }


    }

    private  static void editItemList()  {
        int changeListLocation;
        int i = 0;
        TaskItem newListItemSet;
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

    public static void addItemToList()  {
        TaskItem data = TaskItem.CreateNewItem();
        if (data != null) {
            tasklist.add(data);
        }
        //tasklist.add(TaskItem.CreateNewItem());
    }

    private static void viewTaskList() {
        int i = 0;
        System.out.println("current item in the list\n");
        DisplayList(i);
        System.out.println("\n--------------------------------------------");
    }

    private static void DisplayList(int i) {
        for (TaskItem data:tasklist) {

            if(data.getcompletedTask() == true){
                System.out.printf("%d) %S [%s] %s: %s\n", i,completionMark,data.getDueDate(), data.getTitle(), data.getDescription());
                i++;
            }
            else{
                System.out.printf("%d) [%s] %s: %s\n", i,data.getDueDate(), data.getTitle(), data.getDescription());
                i++;
            }

        }

    }

    private static void writeToFile(){
        String fileName;
        System.out.print("enter a file name:");
        fileName = in.nextLine();
        try( Formatter output = new Formatter(fileName)) {
            for (TaskItem data : TaskList.tasklist) {
                output.format("%s,%s,%s,%s%n", data.getTitle(),data.getDescription(),data.getDueDate(),data.getcompletedTask());
            }
            System.out.println("file"+fileName + "hase been saved");
        }catch(FileNotFoundException e){
            System.out.println("no file was found");
        }
    }

}