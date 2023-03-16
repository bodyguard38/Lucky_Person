package Lucky_User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    ArrayList<User> list = new ArrayList<>();

    //Step 2
    public ArrayList<User> register() {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name  :");
        String name = input.nextLine();

        User user1 = new User(name, LocalDateTime.now());
        list.add(user1);

        return list;

    }
    //Step 3

    public void luckyUser(ArrayList<User> listobj){
        for (User s:listobj) {
            if(s.recordTime.getSecond()<=10){
                System.out.println(s.name+" Congratulations, you're the lucky one "+s.recordTime);
            }else {
                System.out.println(s.name+" you are not a lucky person "+s.recordTime);
            }
        }

    }
    public void list(ArrayList<User> listobj) {
        System.out.println(listobj);
    }
}
