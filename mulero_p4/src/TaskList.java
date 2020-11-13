import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private ArrayList<tasklist> task = new ArrayList<>();
    // List tasklist = new List();
    public static void tasklistOptions() {
        System.out.println("\n\nPlease pick an option from the list below from the list\n");
        System.out.println("1) See item in current list that you have created\n" +
                "2) Add an item to your task list\n" +
                "3) Remove an item from task list\n" +
                "4) Mark an item as completed from the task list\n" +
                "5) Unmark an item from your task list\n" +
                "6) edit a task item\n" +
                "7) Save the current list\n" +
                "8) leave to main menu");
    }
    public static void AlreadyCreatedList(){
      //  for (String tasklistcreated:tasklist) {

        }

    private class tasklist {
        String Title ;

    }
}
