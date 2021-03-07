package PresentationLayer;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import BusinessLogicLayer.Bookings;
import BusinessLogicLayer.Client;
import BusinessLogicLayer.Food;

public class ProgramMethods {
    

    public void NewClient() {
        List<Client> cList = new ArrayList<>();
        boolean contLoop = true;
        String name;
        String surname;
        int pnumber;
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
            pnumber = sn.nextInt();
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
                        cList.add(new Client(String.valueOf(pnumber),name,surname,pnumber,email,address));
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
        List<Bookings> booklist = new ArrayList<>();
        List<Client> clientlist = new ArrayList<>();
        String pnumber;
        String eventname;
        LocalDate eventdate;
        LocalTime eventtime;
        int pamount;
        String eventtype;
        String venuename;
        String venueaddress;
        int venuepnumber;
        int decorchoice;
        boolean decorations = false;
        String theme;
        String decordetails;
        boolean contloop = true;
        while (contloop) {
            System.out.println("---------------------------------------\n"
                              +"               NEW EVENT\n"
                              +"---------------------------------------");
            System.out.println("PLEASE ENTER YOUR PHONE NUMBER:");
            Scanner sn = new Scanner(System.in);
            pnumber =  sn.nextLine();
            for (Client client : clientlist) {
                if (client.getClientid() == pnumber) {
                    
                }
            }
            System.out.println("");
            System.out.println("ENTER THE EVENTS NAME:");
            eventname = sn.nextLine();
            System.out.println("");
            System.out.println("ENTER THE DATE OF THIS EVENT:");
            eventdate = LocalDate.parse(sn.nextLine());
            System.out.println("");
            System.out.println("ENTER THE TIME OF THIS EVENT:");
            eventtime = LocalTime.parse(sn.nextLine());
            System.out.println("");
            System.out.println("ENTER THE AMOUNT OF PEOPLE:");
            pamount = sn.nextInt();
            System.out.println("");
            System.out.println("WHAT TYPE OF EVENT IS THIS?:");
            eventtype = sn.nextLine();
            System.out.println("");
            System.out.println("WHAT IS THE VENUE'S NAME?:");
            venuename = sn.nextLine();
            System.out.println("");
            System.out.println("ENTER THE VENUE'S PHONE NUMBER");
            venuepnumber = sn.nextInt();
            System.out.println("");
            boolean decorloop = true;
            while (decorloop) {
                System.out.println("DO YOU WANT DECORATIONS?: (COST: R2000)\n"
                                  +"1. YES\n"
                                  +"2. NO\n");
                decorchoice = sn.nextInt();
                System.out.println("");
                switch (decorchoice) {
                    case 1:
                        decorations = true;
                        
                        System.out.println("WHAT THEME DO YOU WANT?:");
                        theme = sn.nextLine();
                        System.out.println("");
                        System.out.println("PLEASE ENTER DETAILS OF WHAT YOU WANT TO DECORATE:");
                        decordetails = sn.nextLine();
                        System.out.println("");
                        decorloop = false;
                        break;
                    case 2:
                        decorations = false;
                        decorloop = false;
                        break;
                    default:
                        System.out.println("PLEASE ENTER THE RIGHT INPUT");
                        System.out.println("");
                        break;
                }
            }
            String menutitle;
            String mealchoice;
            int menuitem;
            int persons;
            int allergiesorRequests;
            String allergiesDetails;
            String allergysummary;
            double mealPrice;
            List<Food> foodlist = new ArrayList<>();
            System.out.println("---------------------------------------\n"
                              +"                FOOD\n"
                              +"---------------------------------------");
            boolean menuloop = true;
            while (menuloop) {
                int menunum = 0;
                menutitle = foodlist.get(menunum).getMealType();
                System.out.println(menutitle.toUpperCase());
                boolean choiceloop = true;
                while (choiceloop) {
                    System.out.println("-----------------------------------");
                    for (Food food : foodlist) {
                        if (food.getMealType() == menutitle) {
                            int i = 1;
                            System.out.println(i+". "+food.getMealChoice()+"        R"+food.getMealPrice());
                            i++;
                        }                    
                    }
                    System.out.println("0. NONE\n"
                                  +"-----------------------------------");
                    menuitem = sn.nextInt();
                    for (Food food : foodlist) {
                        if (food.getMealType() == menutitle) {
                            menuitem--;
                            mealchoice = foodlist.get(menunum).getMealChoice();
                            choiceloop = false;
                        }                    
                    }
                    System.out.println("");
                }
                
                System.out.println("HOW MANY PERSONS?");
                persons = sn.nextInt();
                System.out.println("");
                boolean allergyloop = true;
                while (allergyloop) {
                    System.out.println("ANY ALLERGENS OR OTHER REQUESTS?:\n"
                                      +"1. YES\n"
                                      +"2. NO");
                    allergiesorRequests = sn.nextInt();
                    System.out.println("");
                    switch (allergiesorRequests) {
                        case 1:
                            System.out.println("PLEASE ENTER THE ALLERGY OR REQUEST");
                            allergiesDetails = sn.nextLine();
                            allergysummary = "ALLERGIES OR REQUESTS: "+allergiesDetails;
                            System.out.println("");
                            allergyloop = false;
                            break;
                        case 2:
                            allergyloop = false;
                            allergysummary = "ALLERGIES OR REQUESTS: NONE";
                            System.out.println("");
                            break;
                        default:
                            System.out.println("PLEASE ENTER THE RIGHT INPUT");
                            break;
                    }
                }
                
                System.out.println("--------------------------------------\n"
                                  +"YOU CHOSE THE "+mealchoice+" FOR "+persons+" PERSON/S\n"
                                  +allergysummary+" \n"
                                  +"MEAL PRICE: "+
                                  +"--------------------------------------"); 
                System.out.println("");        
            }
            
        }
    }
}
