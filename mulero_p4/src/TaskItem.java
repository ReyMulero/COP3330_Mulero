import java.util.Scanner;


public class TaskItem {
    private static final Scanner input = new Scanner(System.in);
    // next step is to turn this into a singe function that when called
    // reach out to all the function for title date and description
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
        System.out.println("\n please enter a title for your task you have created");
       taskItemName = setTitle();
        System.out.println(taskItemName + "\n");
       return taskItemName;
    }
    // An task item shall contain a title
    //a title shall be 1 or more characters in length

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
    //An task item shall contain a description
    //A description shall be 0 or more characters in length
   private  static String setDueDate(){
        //   int day;
       // int month;
        //int year;
       String DueDaySet;
       System.out.println("please enter a due date: ");
         //  year = input.nextInt();
       //month =input.nextInt();
       //day = input.nextInt();

     DueDaySet = input.nextLine();

     //  DueDaySet = year + "-" + month+ "-" + day;
       System.out.println(DueDaySet + "\n");
       return DueDaySet;
   }

    private static String dueDate(){
        System.out.println("All new task require a due date(YYYY-MM-DD):");
        String dueDate;
        dueDate =  setDueDate();
       return dueDate;
    }
    //An task item shall contain a due date
    //A due date shall be in the format of YYYY-MM-DD

    public static void createList(){
        TaskList.taskListOptions();
    }
}
