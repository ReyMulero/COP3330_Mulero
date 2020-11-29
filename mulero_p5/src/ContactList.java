import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

    public class ContactList {
        private static final Scanner in = new Scanner(System.in);

        public static ArrayList<ContactItem> contactList = new ArrayList<>();

        public static void loadList()  {
            ArrayList<ContactItem> listFromTxt;
            System.out.print("enter the file name you wish to get: ");
            listFromTxt = GrabFile();
            contactList = listFromTxt;
            ContactListMenu();
        }

        private static ArrayList<ContactItem> GrabFile()  {
            String fileName;
            fileName = in.nextLine();
            ArrayList<ContactItem> tempListlocation = new ArrayList<>();
            try{
                File file = new File(fileName);
                Scanner readFile = new Scanner(file);
                String data[];
                ContactItem temp;
                while(readFile.hasNextLine()){
                    data = readFile.nextLine().split(",",4);
                    temp = new ContactItem(data[0],data[1],data[2],data[3]);
                    tempListlocation.add(temp);
                }
            }catch (FileNotFoundException e){
                System.out.println("-------------\n" +
                        "file not found please enter a valid file name \n" +
                        "------------------\n");
                //e.printStackTrace();
                loadList();
            }
            return tempListlocation;//catch (DateTimeException)
        }

        public static void ContactListMenu()  {
            int optionpicked;
            try {
                do {
                    System.out.println("---------task list option menu----------");
                    System.out.println("1) view current list\n" +
                            "2) add an item\n" +
                            "3) remove a task item\n" +
                            "4) edit a task item\n" +
                            "5) save the current list\n" +
                            "6) quit to the main menu");
                    System.out.println("----------------------------------------\n");
                    System.out.println("please select an option from this menu");
                    optionpicked = in.nextInt();
                    in.nextLine();
                    System.out.println("\n------------------------------------");
                    TaskToDo(optionpicked);

                } while (optionpicked != 8);
            }catch (InputMismatchException e){
                System.out.println("you enter an invalid response please enter a number from 1-8");
                in.next();
                ContactListMenu();
            }

        }

        private static void TaskToDo(int menuItemPicked)  {

            switch (menuItemPicked){

                case 1:
                    viewContactList();
                    break;
                case 2:
                    addItemToList();
                    break;

                case 3:
                    RemoveItmeFromList();

                    break;

                case 4:
                    editItemList();
                    break;


                case 5:
                    writeToFile();
                    break;

                default:
                    System.out.println("you have decide to go back to the main menu\n\n");
                    contactList.clear();
                    TaskApp.mainMenu();

            }
        }


        private  static void editItemList()  {
            int changeListLocation;
            int i = 0;
            ContactItem newListItemSet;
            DisplayList(i);
            System.out.println("pleas enter the list location you would like to change");
            System.out.println("----------------------------\n");
            changeListLocation = in.nextInt();
            in.nextLine();
            newListItemSet = ContactItem.CreateNewItem();
            contactList.set(changeListLocation,newListItemSet);
        }

        private static void RemoveItmeFromList() {
            int itemToRemove;
            int i = 0;
            DisplayList(i);
            System.out.print("please enter the number that for the slot that you wish to remove from the list: \n");
            itemToRemove = in.nextInt();
            contactList.remove(itemToRemove);
            System.out.println("---------------------------");
        }

        public static void addItemToList()  {
            ContactItem data = ContactItem.CreateNewItem();
            if (data != null) {
                contactList.add(data);
            }
            //ContactList.add(ContactItem.CreateNewItem());
        }

        private static void viewContactList() {
            int i = 0;
            System.out.println("current item in the list\n");
            DisplayList(i);
            System.out.println("\n--------------------------------------------");
        }

        private static void DisplayList(int i) {
            for (ContactItem data : contactList) {
                System.out.printf("%d) %s %s :%s (%s)\n", i ,data.getFirstName(),data.getLastName(),data.getEmail(),data.getPhonenumber());
            }
        }

        private static void writeToFile(){
            String fileName;
            System.out.print("enter a file name:");
            fileName = in.nextLine();
            try( Formatter output = new Formatter(fileName)) {
                for (ContactItem data : ContactList.contactList) {
                    output.format("%s,%s %s :%s%n", data.getFirstName(),data.getLastName(),data.getEmail(),data.getPhonenumber());
                }
                System.out.println("file"+fileName + "hase been saved");
            }catch(FileNotFoundException e){
                System.out.println("no file was found");
            }
        }

    }

