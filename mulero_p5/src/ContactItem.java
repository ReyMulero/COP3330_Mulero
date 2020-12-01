import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactItem {

    public String FirstName;
    public String LastName;
    public String EmailAdress;
    public String phonenumber;
    private static final Scanner input = new Scanner(System.in);

    public  static void createList() throws FileNotFoundException {
        ContactList.ContactListMenu();
    }

    public ContactItem(String Fstname, String LstName, String Email, String PhoneNumber){
        if (isNameValid(Fstname)){
            FirstName = Fstname;
        }else{
            throw new InvalidNameException("you don't have a First name You lie (-.-)???????");
        }
        if (isNameValid(LstName)){
            LastName = LstName;
        }else{
            throw new InvalidNameException("why you nio have last name(-.-)??????? Get them there sus!!!!");
        }
        if (isEmailValid(Email)){
            EmailAdress = Email;
        }else{
            throw new InvalidNameException("You lie everyone has an email these days");
        }
        if (isPhonenumberValid(PhoneNumber)){
            phonenumber = PhoneNumber;
        }else{
            throw new InvalidTitleException("why you no have last name(-.-)??????? Get them there sus!!!!");
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

    private static String firstName(){
        ContactItem C = new ContactItem("a", "b", "c", "123-456-7890");
        System.out.println("please enter a first Name must be at leat 1 character long:");
        C.setFirstName();
        return C.getFirstName();
    }

    public String getFirstName() {
        return FirstName;
    }

    public String setFirstName() {
        FirstName = input.nextLine();
    try{
        if(isNameValid(FirstName)){
            System.out.println("");
        }else{
            FirstName = null;
        }
    }catch(InvalidNameException e){
        throw new InvalidNameException("Na man try again you mess up my manz");
        }

        return FirstName;
    }



    private static String lastName(){
        ContactItem C = new ContactItem("a", "b", "c", "123-456-7890");
        System.out.println("please enter a last Name must be at leat 1 character long:");
        C.setLastName();
        return C.getLastName();
    }

    public String getLastName() {
        return LastName;
    }

    public String setLastName() {
        LastName = input.nextLine();
        try {
            if (isNameValid(LastName)) {
                System.out.println("");
            } else {
                LastName = null;
            }
        }catch(InvalidNameException e){
                throw new InvalidNameException("Na man try again you mess up my manz");
            }
            return LastName;
        }




    private static String emailAdress(){
        ContactItem C = new ContactItem("a", "b", "c", "123-456-7890");
        System.out.println("please enter your email adress:");
        C.setEmail();
        return C.getEmail();
    }

    public String getEmail() {
        return EmailAdress;
    }

    public String setEmail() {
        EmailAdress = input.nextLine();
        try{
            if(isEmailValid(EmailAdress)){
            System.out.println("");
            }else{
            EmailAdress = null;
            }
        }catch(InvalidNameException e){throw new InvalidNameException("How am i supposed to email you the secret kraby patty recipe now?");}

        return EmailAdress;
    }



    private static String phoneNumber(){
        ContactItem C = new ContactItem("a", "b", "c", "123-456-7890");
        System.out.println("please enter a 10 digit phone number in the format of ( 1234567890 )");
        C.setPhonenumber();
        return C.getPhonenumber();

    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String setPhonenumber() {
        int tempNumberToString;
        String tempPhoneNumber;
        String a,b,c;
        try{
            tempNumberToString = input.nextInt();
            tempPhoneNumber= Integer.toString(tempNumberToString);
            a = tempPhoneNumber.substring(0,3);
            b = tempPhoneNumber.substring(3,6);
            c = tempPhoneNumber.substring(6,10);
            phonenumber = (a+"-"+b+"-"+c);
        }catch(InputMismatchException e){
            System.out.println("you have enter an invalid response for your phone number");
        }

        if(isPhonenumberValid(phonenumber)){
            System.out.println("");
        }else{
            phonenumber = null;
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
            if((a != null || b != null || c != null || d != null)){
                return new ContactItem(a,b,c,d);
            }
            else{
                System.out.println("contact list item not created");
            }
        }catch (InvalidNameException e){
//            System.out.println("Invalid entry for title \n");
//            System.out.println("title must be at least one character long");

        } return null;
    }
}
class InvalidNameException extends IllegalArgumentException {
    public InvalidNameException(String msg) {
        super(msg);
    }
}
