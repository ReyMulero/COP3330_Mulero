import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class InvalidTitleException extends IllegalArgumentException {
    public InvalidTitleException(String msg) {
        super(msg);
    }
}

public class TaskItem {
    private static String CorrectSatDate;
    private static final Scanner input = new Scanner(System.in);
    private static String Title = null;
    private static String Description = null;


    private static boolean isTitleValid(String titlevalidation){
       return Title.length()> 0;
   }

    public static String CreateNewItem() {
        String a;
        String b;
        String c;
        String newItem = null;
        try{
            a = title();
            b = description();
            c = dueDate();
            newItem = a +": "+ b + " [" + c+"]";
        }catch (InvalidTitleException e){
            System.out.println("Invalid entry for title \n");
            System.out.println("title must be at least one character long");
            System.out.println("Task list not created \n");
        }
        return newItem;
    }

    private static String setTitle(){
        Title = input.nextLine();

        if(isTitleValid(Title)){
            System.out.println("");
        }else{
           throw new InvalidTitleException("Na man try again you mess up my manz");
        }
        return Title;
    }
    private static String title(){
        String taskItemName;
        System.out.println("\nplease enter a title for your task you wish to created"
        + "\n---------------------------------------");
        taskItemName = setTitle();
        System.out.println(taskItemName + "\n");
        return taskItemName;
    }


    private  static String setDiscription()  {

        Description = input.nextLine();
        return Description;
    }

    private  static String description(){
        System.out.println("please enter a description for the task:");
        String descript;
        descript = setDiscription();
        System.out.println(descript + "\n");
        return descript;
    }

    private  static String setDueDate() {
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
            System.out.println("Tasklist not created");
            TaskList.taskListMenu();
        }catch (NullPointerException e){
            System.out.println("invalid input\n");
            System.out.println("Tasklist not created");
            TaskList.taskListMenu();
        }
        return CorrectSatDate;
    }

    private static String dueDate()  {
        System.out.println("All new task require a due date(YYYY-MM-DD):");
        String dueDate;
        dueDate =  setDueDate();
        return dueDate;
    }

    public static void createList() throws FileNotFoundException {
        TaskList.taskListMenu();
    }

}
