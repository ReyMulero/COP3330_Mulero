import java.io.FileNotFoundException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class TaskItem {
    public  String CorrectSetDate;
    public  String Title;
    public String Description;
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

//    @Override
//    public String toString() {
//        return (CorrectSetDate+ " "+Title+": "+ Description);
//    }

    public boolean getcompletedTask(){
        return this.completedTask;
    }
    public void setcomplpletedTask(boolean complete){
        this.completedTask = complete;
    }

    private  boolean isTitleValid(String titlevalidation){
        return titlevalidation.length()> 0;
    }

    private  boolean isFuckingDateValid(String FuckingDateValidation){
        try {
            LocalDate date = LocalDate.parse(FuckingDateValidation);

            //System.out.println(date + "\n");
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

        try{
            a = title();
            b = description();
            c = dueDate();
            return new TaskItem(a, b, c,false);
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

    private  String setTitle(){
        Title = input.nextLine();

        if(isTitleValid(Title)){
            System.out.println("");
        }else{
            throw new InvalidTitleException("Na man try again you mess up my manz");
        }
        return Title;
    }
    private  static String title(){
        //String taskItemName;
        TaskItem  t = new TaskItem("a", "", "2020-11-11", false);
        System.out.println("\nplease enter a title for your task you wish to created"
                + "\n---------------------------------------");
        t.setTitle();
        System.out.println(t.getTitle() + "\n");
        return t.getTitle();
    }


    public String getDescription() {
        return Description;
    }

    private  String setDiscription()  {

        Description = input.nextLine();
        return Description;
    }


    private static  String description(){
        TaskItem  t = new TaskItem("a", "", "2020-11-11", false);
        System.out.println("please enter a description for the task:");
        //String descript;
        t.setDiscription();
        System.out.println(t.getDescription()+ "\n");
        return t.getDescription();
    }


    public String getDueDate(){
        return CorrectSetDate;
    }

    public  String setDueDate() {
        String DueDaySet;
        System.out.print("please enter a due date: ");
        try{
        DueDaySet = input.nextLine();
        if (isFuckingDateValid(DueDaySet)){
            return DueDaySet;
        }else{
            System.out.println("task item not created");
           throw new DateTimeException("NO LINDA!!!!!!!!!!!!!!!");
          }
        }catch(DateTimeException e){
            System.out.println("tasklist item not created");
            TaskList.taskListMenu();
            throw new DateTimeException("NO LINDA!!!!!!!!!!!!!!!");
        }
    }

    private static String dueDate()  {
        System.out.println("All new task require a due date(YYYY-MM-DD):");
        TaskItem  t = new TaskItem("a", "", "2020-11-11", false);
        //String dueDate;
        t.setDueDate();
        return t.getDueDate();
    }

    public  static void createList() throws FileNotFoundException {
        TaskList.taskListMenu();
    }


}
class InvalidTitleException extends IllegalArgumentException {
    public InvalidTitleException(String msg) {
        super(msg);
    }
}