import java.util.Scanner;

public class TaskItem {
    Scanner input = new Scanner(System.in);
    //  An task item shall contain a title
    //  A title shall be 1 or more characters in length
       private String title(){
           System.out.println("please enter a title for your new task:");
           String Title;
           Title = gettitle();
           System.out.println(Title);
           return Title;
       }
      private String gettitle(){
          String title = input.nextLine();
          return title;
       }

   // An task item shall contain a description
    //  A description shall be 0 or more characters in length
   private String description(){
       System.out.println("please enter a description for your task:");
       String descript;
       descript = getDescription();
       return null;
   }

   private String getDescription(){
          String description = input.nextLine();
          return description;
   }

 //  An task item shall contain a due date
// A due date shall be in the format of YYYY-MM-DD
   private int getDueDate(){
           int month;
           int day;
           int year;
       System.out.println("please enter a due date in the format of YYYY-MM-DD for your task");
   }


}
