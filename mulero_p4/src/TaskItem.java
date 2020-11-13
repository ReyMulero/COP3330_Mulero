import java.util.Scanner;

public class TaskItem {
    private static final Scanner input = new Scanner(System.in);

    private static String setTitle(){
        String title;
        title = input.nextLine();
        return title;

    }
    public static String title(){
        String taskItemName;
        System.out.println("please enter a title for your task you have created");
       taskItemName = setTitle();
       return taskItemName;
    }
    // An task item shall contain a title
    //a title shall be 1 or more characters in length

    private  static String setDiscription(){
        String description;
        description = input.nextLine();
        return description;
}

    public  static String description(){
        System.out.println("please enter a description for the task:");
        String descript;
        descript = setDiscription();
        return descript;
    }
    //An task item shall contain a description
    //A description shall be 0 or more characters in length
   private  static String setDueDate(){
     //   int day;
       // int month;
        //int year;
       String DueDaySet;
       System.out.println("please enter a due date in the format of YYYY-MM-DD" +
               "please enter the dates with a space dashes are not needed");
     //  year = input.nextInt();
       //month =input.nextInt();
       //day = input.nextInt();

     DueDaySet = input.nextLine();

     //  DueDaySet = year + "-" + month+ "-" + day;
       System.out.println(DueDaySet);
       return DueDaySet;
   }


    public static String dueDate(){
        System.out.println("All new task require a due date\n" +
                "due date should be in the form of YYYYY-MM-DD: ");
        String dueDate;
        dueDate =  setDueDate();
       return dueDate;
    }
    //An task item shall contain a due date
    //A due date shall be in the format of YYYY-MM-DD

}
