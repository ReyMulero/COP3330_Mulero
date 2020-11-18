import java.io.FileNotFoundException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;



public class TaskItem {
    public static String CorrectSetDate;
    public static String Title;
    public static String Description;
    public static boolean completedTask;
    private static final Scanner input = new Scanner(System.in);



    public TaskItem(String title, String description,String date,Boolean completedTask){
        if (isTitleValid(title)){
            Title = title;
        }else{
            throw new InvalidTitleException("shit this is haorible");
        }
        Description = description;

        if (isFuckingDateValid(date)){
            CorrectSetDate = date;
        }else{
            throw new DateTimeException("GOD DAMIT KARL Baskin!!!!!!!!");
        }

        this.completedTask = completedTask;
    }

    public boolean getcompletedTask(){
        return this.completedTask;
    }
    public void setcomplpletedTask(boolean complete){
        this.completedTask = complete;
    }

    private static boolean isTitleValid(String titlevalidation){
       return titlevalidation.length()> 0;
   }

   private static boolean isFuckingDateValid(String FuckingDateValidation){
       try {
           LocalDate date = LocalDate.parse(FuckingDateValidation);

           System.out.println(date + "\n");
           CorrectSetDate = String.valueOf(date);
           return true;
       }catch (DateTimeParseException e) {
           System.out.println("date is not in correct format\n");
           System.out.println("Tasklist not created");
          // TaskList.taskListMenu();
           return false;
       }catch (DateTimeException e){
           System.out.println("invalid input\n");
           System.out.println("Tasklist not created");
           //TaskList.taskListMenu();
           return false;
       }
   }

    public static TaskItem CreateNewItem() {
        String a;
        String b;
        String c;
        TaskItem newItem;
        try{
            a = title();
            b = description();
            c = dueDate();
           return newItem = new TaskItem(a, b, c,false);
        }catch (InvalidTitleException e){
            System.out.println("Invalid entry for title \n");
            System.out.println("title must be at least one character long");
            System.out.println("Task list not created \n");
            return null;
        }

    }

     public String getTitle(){
        return Title;
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


    public String getDescription() {
        return Description;
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

    public String getDueDate(){
        return CorrectSetDate;
    }


    public static String setDueDate() {
        String DueDaySet;
        System.out.print("please enter a due date: ");
        DueDaySet = input.nextLine();
        if (isFuckingDateValid(DueDaySet)){
            return DueDaySet;
        }else{
            throw new DateTimeException("NO LINDA!!!!!!!!!!!!!!!");
        }

         //return CorrectSatDate;
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
class InvalidTitleException extends IllegalArgumentException {
    public InvalidTitleException(String msg) {
        super(msg);
    }
}