import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;


public class TaskItem {
    private static String CorrectSatDate;
    private static final Scanner input = new Scanner(System.in);

    public static String CreateNewItem(){
        String a;
        String b;
        String c;
        String newItem;
        a = title();
        b = description();
        c = dueDate();
        newItem = a +": "+ b + " [" + c+"]";
        return newItem;
    }

    private static String setTitle(){
        String title;
        title = input.nextLine();
        return title;

    }
    private static String title(){
        String taskItemName;
        System.out.println("\nplease enter a title for your task you have created");
       taskItemName = setTitle();
        System.out.println(taskItemName + "\n");
       return taskItemName;
    }


    private  static String setDiscription(){
        String description;
        description = input.nextLine();
        return description;
}

    private  static String description(){
        System.out.println("please enter a description for the task:");
        String descript;
        descript = setDiscription();
        System.out.println(descript + "\n");
        return descript;
    }

   private  static String setDueDate(){
     String DueDaySet;
       System.out.print("please enter a due date: ");
        try {
            DueDaySet = input.nextLine();

            LocalDate date = LocalDate.parse(DueDaySet);

            System.out.println(date + "\n");
            CorrectSatDate = String.valueOf(date);
            return CorrectSatDate;
        }catch (DateTimeParseException e) {
            System.out.println("date is not in correct format\n");
            dueDate();

        }

        return CorrectSatDate;
   }

    private static String dueDate(){
        System.out.println("All new task require a due date(YYYY-MM-DD):");
        String dueDate;
        dueDate =  setDueDate();
       return dueDate;
    }

    public static void createList() throws FileNotFoundException {
        ArrayList<String> tasklist = new ArrayList<>();
        TaskList.taskListOptions(tasklist);
    }
}
