package Lucky_User;

import java.util.ArrayList;
import java.util.Scanner;

public class EntrancePanel {
    public void entrance() throws InterruptedException {

        Scanner input = new Scanner(System.in);
        Registration newreg= new Registration();

        ArrayList<User> person= new ArrayList<>();

        boolean getOut= true;

        while (getOut){
            System.out.println("Please enter your choice : \n1->User registration\n2->Lucky person\n3->Listing\n4->Exit");
            switch (input.nextLine()){
                case "1":
                    person= newreg.register();
                    break;
                case "2":
                    newreg.luckyUser(person);
                    break;
                case "3":
                    newreg.list(person);
                    break;
                case "4":
                    getOut= false;
                    break;
                default:
                    System.out.println("You entered wrong please try again");
                    Thread.sleep(2000);
                    break;
            }

        }



    }
}
