package PresentationLayer;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import BusinessLogicLayer.Client;

public class ProgramMethods {
    
    public void NewClient() {
        List<Client> cList = new ArrayList<>();
        boolean contLoop = true;
        String name;
        String surname;
        String pnumber;
        String email;
        String address;

        while (contLoop) {
            System.out.println("---------------------------------------\n"
                              +"               NEW CLIENT\n"
                              +"---------------------------------------\n"
                              +"PLEASE ENTER YOUR NAME:");
            Scanner sn = new Scanner(System.in);
            name = sn.nextLine();
            System.out.println("");
            System.out.println("ENTER YOUR SURNAME:");
            surname = sn.nextLine();
            System.out.println("");
            System.out.println("ENTER YOUR PHONE NUMBER:");
            pnumber = sn.nextLine();
            System.out.println("");
            System.out.println("ENTER YOUR EMAIL ADDRESS: (example@email.com)");
            email = sn.nextLine();
            System.out.println("");
            System.out.println("ENTER HOME ADDRESS (street, suburb, city, postal code)" );
            address = sn.nextLine();
            System.out.println("");
            System.out.println("---------------------------------------\n"
                              +"              CLIENT INFO\n"
                              +"---------------------------------------\n"
                              +"\n"
                              +"NAME:           "+name+"\n"
                              +"SURNAME:        "+surname+"\n"
                              +"PHONE NUMBER:	"+pnumber+"\n"
                              +"EMAIL ADDRESS:	"+email+"\n"
                              +"HOME ADDRESS:	"+address+"\n"
                              +"\n"
                              +"---------------------------------------\n"
                              +"IS THIS INFORMATION CORRECT?\n"
                              +"1. YES\n"
                              +"2. NO");
            boolean switchloop = true;           
            while (switchloop) {
                int yn = sn.nextInt();
                switch (yn) {
                    case 1:
                        cList.add(new Client(pnumber,name,surname,Integer.parseInt(pnumber),email,address));
                        switchloop = false;
                        contLoop = false;
                        break;
                    case 2:
                        switchloop = false;
                        break;
                    default:
                        System.out.println("THIS INPUT IS INCORRECT PLEASE ENTER RIGHT INPUT:");
                        break;
                }               
            }
            
        }
    }

    public void NewEvent() {
        String pnumber;
        String eventname;
        Date eventdate;
        boolean contloop = true;
        while (contloop) {
            System.out.println("---------------------------------------\n"
                              +"               NEW EVENT\n"
                              +"---------------------------------------\n"
                              +"PLEASE ENTER YOUR PHONE NUMBER:");
            Scanner sn = new Scanner(System.in);
            
        }
    }
}
