import javax.naming.InvalidNameException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContactItem {

    public String FirstName;
    public String LastName;
    public String Email;
    public String phonenumber;
    private static final Scanner input = new Scanner(System.in);



    public ContactItem(String Fstname, String LstName, String Email, String phoneNumber){
        if (isNameValid(Fstname)){
            Fstname = Fstname;
        }else{
            throw new InvalidTitleException("you don't have a First name You lie (-.-)???????");
        }
        if (isNameValid(LstName)){
            LstName = LstName;
        }else{
            throw new InvalidTitleException("why you nio have last name(-.-)??????? Get them there sus!!!!");
        }
        if (isEmailValid(Email)){
            Email = Email;
        }else{
            throw new InvalidTitleException("You lie everyone has an email these days");
        }
        if (isNameValid(LstName)){
            LstName = LstName;
        }else{
            throw new InvalidTitleException("why you nio have last name(-.-)??????? Get them there sus!!!!");
        }



    }

    private  boolean isNameValid(String NameValidation){
        return NameValidation.length()> 0;
    }

    private  boolean isEmailValid(String emailValidation){
        return emailValidation.length()> 0;
    }

    private  boolean isPhonenumberValid(String PhoneNumberValidation){
        return PhoneNumberValidation.length() >= 10;
    }



    public String getFirstName() {
        return FirstName;
    }

    public String setFirstName() {
        FirstName = input.nextLine();

        if(isNameValid(FirstName)){
            System.out.println("");
        }else{
            throw new InvalidNameException("Na man try again you mess up my manz");
        }
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String setLastName() {
        LastName = input.nextLine();

        if(isNameValid(LastName)){
            System.out.println("");
        }else{
            throw new InvalidNameException("Na man try again you mess up my manz");
        }
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String setEmail() {
        Email = input.nextLine();

        if(isEmailValid(Email)){
            System.out.println("");
        }else{
            throw new InvalidNameException("How am i supposed to email you those secret kraby patty recipenow?");
        }
        return Email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String setPhonenumber() {
        phonenumber = input.nextLine();

        if(isPhonenumberValid(phonenumber)){
            System.out.println("");
        }else{
            throw new InvalidTitleException("How am i supposed to call you back to keep you up to date manz");
        }
        return phonenumber;
    }


    public static ContactItem CreateNewItem() {
        String a;
        String b;
        String c;
        String d;

        try{
            a = firstName();
            b = lastName();
            c = emailAdress();
            d = phoneNumber();
            return new ContactItem(a, b, c,d);
        }catch (InvalidNameException e){
            System.out.println("Invalid entry for title \n");
            System.out.println("title must be at least one character long");
            return null;
        }
    }



    private static String firstName(){
        ContactItem C = new ContactItem("a", "b", "c", "123-456-7890");
        System.out.println("please enter a first Name must be at leat 1 character long:");
        C.setFirstName();
        return C.getFirstName();
    }

    private static String lastName(){
        ContactItem C = new ContactItem("a", "b", "c", "123-456-7890");
        System.out.println("please enter a last Name must be at leat 1 character long:");
        C.setLastName();
        return C.getLastName();
    }

    private static String emailAdress(){
        ContactItem C = new ContactItem("a", "b", "c", "123-456-7890");
        System.out.println("please enter your email adress:");
        C.setEmail();
        return C.getEmail();
    }

    private static String phoneNumber(){
        ContactItem C = new ContactItem("a", "b", "c", "123-456-7890");
        System.out.println("please enter a 10 digit phone number in the format of ( 123-456-7890 )");
        C.setPhonenumber();
        return C.getPhonenumber();

    }
    public  static void createList() throws FileNotFoundException {
        ContactList.ContactListMenu();
    }
}
class InvalidnameException extends IllegalArgumentException {
    public InvalidnameException(String msg) {
        super(msg);
    }
}
