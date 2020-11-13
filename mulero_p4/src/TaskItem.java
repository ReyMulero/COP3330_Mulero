import java.util.Scanner;

public class TaskItem {
    Scanner input = new Scanner(System.in);
    private String getTitle(){
        String title;
        title = input.nextLine();
        return title;

    }
    private String title(){
        String taskItemName;
        System.out.println("please enter a title for your task you have created");
       taskItemName = getTitle();
       return taskItemName;
    }
    // An task item shall contain a title
    //a title shall be 1 or more characters in length


    //An task item shall contain a description
    //A description shall be 0 or more characters in length
    //An task item shall contain a due date
    //A due date shall be in the format of YYYY-MM-DD

}
