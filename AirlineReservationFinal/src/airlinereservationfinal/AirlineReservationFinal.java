/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*

School : Holy Cross of Davao College BSIT Department

    CC104 Project for Finals
  
        Jason Estrella, BSIT 2nd Year 
        Patrick Tapia, BSIT 2nd Year 
        Prince Gonzales, BSIT 2nd Year 

    CC104 MTWThF 1:00 - 2:00 PM

*/
package airlinereservationfinal;

import java.util.Scanner;

/**
 *
 * @author PGrafix
 */
public class AirlineReservationFinal {

    static dlistcll<people> people = new dlistcll<>();
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
       start();              
    }
  
    public static void start(){
        
        if (!people.isEmpty()){
            if (people.size() == 120){
                System.out.print("The Airplane Reservation is Already Full!..... \n");
                System.out.print("Goodbye! .....");
            }
        }
        
        System.out.print("Welcome to ------ Airline Reservation Management System\n"+"\n");
        System.out.print("Press any key to continue . . . \n");
        scan.nextLine();
        System.out.print("\n\n\n\n\n");
        System.out.print("\n\n\n\n\n");

        boolean law = true;
        
        do{
        try{
        while (law){
            
            System.out.print("Insert Reservations: [1] \n");
            System.out.print("Remove Reservations: [2] \n");
            System.out.print("Display the list of Reservations: [3] \n");
            System.out.print("Exit: [4] \n");
            
            int aw = Integer.parseInt(scan.nextLine());
            
            System.out.print("\n\n\n\n\n");
            
            switch (aw) {
                case 1: 
                    insert();
                    law = false;
                    break;
                case 2:
                    if (people.isEmpty()){
                        System.out.print("There is nothing to be remove in list of reservation.\n\n\n\n\n");
                        System.out.print("Press any key to continue.....");
                        scan.nextLine();
                        start();}
                    remove();
                    law = false;
                    break;  
                case 3:
                     if (people.isEmpty()){
                        System.out.print("There is nothing to be diplayed in the list of reservation.\n\n\n\n\n");
                        System.out.print("Press any key to continue.....");
                        scan.nextLine();
                        start();}
                    display();
                    law = false;
                    break;  
                case 4:
                    System.out.print("Goodbye!");
                    System.out.print("\n\n\n\n\n");
                    System.out.print("Press any key to continue . . . \n");
                    scan.nextLine();
                    System.exit(0);
                    law = false;
                    break;  
                default:
                    System.out.print("Invalid Choice\n\n");
                    law = true;
                    break;
               }
            }
        break;
        } catch (NumberFormatException x){
            System.out.print("Your input is invalid.");
            System.out.print("\n\n\n\n\n");
        }
      } while(true);
        
        
    }
    
    public static void insert(){
        
         System.out.print("Insertion of Reservations in the list.\n"+"\n");
         System.out.print("Press any key to continue . . . \n");
         scan.nextLine();
         System.out.print("\n\n\n\n\n");
        
    String a,c,d,e,f,g,h,k;
    int b,i = 0 ,j = 0;
         
    System.out.print("Name: ");
    a = scan.nextLine();
    System.out.print("\n\n\n\n\n");
    
    do{ 
    System.out.print("Age of "+a+": ");
    try {
    b = Integer.parseInt(scan.nextLine());
    System.out.print("\n\n\n\n\n");
    break;
    } catch (NumberFormatException x) { 
        System.out.print("Your input is invalid.");
        System.out.print("\n\n\n\n\n");
    }     
    }while (true);
    
    System.out.print("Address: "); 
    c = scan.nextLine();
    System.out.print("\n\n\n\n\n");
    
    System.out.print("Phone Number: ");
    d = scan.nextLine();
    System.out.print("\n\n\n\n\n");
    
    System.out.print("Email: ");
    e = scan.nextLine(); 
    System.out.print("\n\n\n\n\n");
    
    System.out.print("Tax: ");
    f = scan.nextLine(); 
    System.out.print("\n\n\n\n\n");
    
    System.out.print("Schedule: ");
    g = scan.nextLine();
    System.out.print("\n\n\n\n\n");
    
    System.out.print("Ticket Code: ");
    h = scan.nextLine();
    System.out.print("\n\n\n\n\n");
    
    //--------------------------------------------------------------------------
    
    boolean law = true;
    
    while (law){
    
        displayseats();
        
    do{      
    System.out.print("Column: ");
    try {
    i = Integer.parseInt(scan.nextLine());
    System.out.print("\n\n\n\n\n");
    break;
    } catch (NumberFormatException x) { 
        System.out.print("Your input is invalid.");
        System.out.print("\n\n\n\n\n");
    }     
    }while (true);
    
        if (i <= 8 && i != 0){   
         law = false;
        }
        else{
         System.out.print("There are only 8 Columns of seats... \n");
         System.out.print("Pick another column... \n");
         System.out.print("\n\n");
        }
    }
    
    //--------------------------------------------------------------------------
    
     
    boolean kaw = true;
    
    while (kaw){
       
        displayseats();
        
    do{ 
    System.out.print("Row: ");
    try {
    j = Integer.parseInt(scan.nextLine());
    System.out.print("\n\n\n\n\n");
    break;
    } catch (NumberFormatException x) { 
        System.out.print("Your input is invalid.");
        System.out.print("\n\n\n\n\n");
    } 
    
    }while (true);
    
      if (j <= 15 && j != 0){   
         kaw = false;
        }
        else{
         System.out.print("There are only 15 Rows of Seats  \n");
         System.out.print("Pick another Row... \n");
         System.out.print("\n\n");
        }
    }
    
     
    //--------------------------------------------------------------------------   
     
    if (!people.isEmpty()){   
        
     for (int po = 0; po <= people.size(); po++){
     
            people.rotateA();
         
            if ( j == people.head().getRow() && i == people.head().getColumn() ){
                System.out.print("This place is already occupied! \n");
                System.out.print("Check for another seat! \n");
                System.out.print("\n\n\n\n\n");
                insert();
            }
            
        }  
    }
    
    //--------------------------------------------------------------------------
    
    do {
    
    System.out.print("Class (First Class [F] / Business Class [B] / Economy Class [E]): ");
    k = scan.nextLine();
    System.out.print("\n\n\n\n\n");
    
    if (!"F".equals(k) && !"B".equals(k) && !"E".equals(k) ){
        System.out.print("Your input is invalid!!...\n\n\n");
    }
    
    } while (!"F".equals(k) && !"B".equals(k) && !"E".equals(k) );
    
    people.addfirst(new people(a,b,c,d,e,f,g,h,j,i,k));
    
    displayseats();
  
//----------------------------------------------------------------------------------------------------------------------    
    
     int qe = 0;

        for(int ie=people.size();ie!=0;ie--){
            qe++;
            if (ie == people.size()){
                System.out.print("-----------------------------------------------------------------------------------------------------------------------\n");
            }
            System.out.print("\nNo."+qe+":"+"\n"+people.head().display());
            people.rotateA();
            if (ie == 1){
                System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
            }
        }
        
        System.out.print("Press any key to continue . . . \n");
        scan.nextLine();
        System.out.print("\n\n\n\n\n");
       
        boolean waw = true;  
        
        do{
           try{
        while (waw){
        
        System.out.print("Do you want to add more reservations? Yes[Y] || No[N] ");
        String choice = scan.nextLine();
        System.out.print("\n\n\n\n\n");
  
            switch (choice) {
            case "Y":
            case "y":
                insert();
                waw = false;
                break;
            case "N":
            case "n":
                displayseats();
            int q1 = 0;
        for(int iw=people.size();iw!=0;iw--){
            q1++;
            if (iw == people.size()){
                System.out.print("-----------------------------------------------------------------------------------------------------------------------\n");
            }
            System.out.print("No."+q1+": \n\n"+people.head().display());
            people.rotateA();
            if (iw == 1){
                System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
            }
        }
                scan.nextLine();
                start();
                waw = false;
                break;
                default:
                System.out.print("Your input is Invalid! \n");
                System.out.print("\n\n\n\n\n");
                System.out.print("\n\n\n\n\n");
                waw = true;
                break;
                
            }
        }  
        break;
           } catch(NumberFormatException x){
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
           }
        } while(true);
        
    
    
    }
    
    public static void remove(){
        
         System.out.print("Removing of Reservations in the List.\n"+"\n");
         System.out.print("NOTE: you can only remove the one who called HEAD.\n"+"\n");
         System.out.print("Press any key to continue . . . \n");
         scan.nextLine();
         System.out.print("\n\n\n\n\n");
          
         boolean awa = true;
         
         do {
         try{
         while (awa){
             
             System.out.print("Do you want to remove this? Yes[Y] or No[N] or Go back to the Menu [G] \n"+"Current Head:\n"+people.head().display());
                String choice = scan.nextLine();
                System.out.print("\n\n\n\n\n");
             
             switch (choice) {
                 case "Y":
                 case "y":
                     people.removefirst();
                     System.out.print("Do you want to remove more? Yes[Y] or No[N] \n ");
                     String c = scan.nextLine();
                     System.out.print("\n\n\n\n\n");
                     switch (c) {
                         case "Y":
                         case "y":
                             if (people.isEmpty()){
                                 System.out.print("There is nothing to be remove in the List of Reservations.\n");
                                 start(); }
                             awa = true;
                             break;
                         case "N":
                         case "n":
                             awa = false;
                             int q1 = 0;
                             System.out.print("Current Reservations: \n\n");
                             for(int i=people.size();i!=0;i--){
                                 q1++;
                                 if (i == people.size()){
                                     System.out.print("-----------------------------------------------------------------------------------------------------------------------\n");
                                 }
                                 System.out.print("\nNo."+q1+":"+people.head().display());
                                 people.rotateA();
                                 if (i == 1){
                                     System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
                                 }
                             }
                             start();
                             break;
                         default:
                             System.out.print("Error: Invalid input! \n");
                             awa = true;}
                 case "N":
                 case "n":
                     System.out.print("Next [1] & Prev [2] or Go Back [3]");
                     boolean maw = true;
                     while (maw){
                     String ch = scan.nextLine();
                                      
                         switch (ch) {
                             case "1":
                                 people.rotateA();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             case "2":
                                 people.rotateB();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             case "3":
                                 remove();
                                 System.out.print("\n\n\n\n\n");
                                 maw = false;
                                 break;
                             default:
                                 System.out.print("Your input is invalid \n");
                                 maw = true;
                                 break;
                         }
                     }
                     break;
                 case "G":
                 case "g":
                     start();
                     awa = false;
                     break;
                 default:
                     System.out.print("Your input is invalid \n");
                     awa = true;
                     break;
             }
    }  
         break;
         }catch (NumberFormatException x){
             System.out.print("Your input is invalid.");
             System.out.print("\n\n\n\n\n");
         }
         } while(true);
    }
    
    public static void display(){
        
        if (people.isEmpty()){
            System.out.print("There is nothing to be displayed! The List of Reservation is empty!\n\n\n\n\n");
            start();
        }
        
        System.out.print("\n\n\n\n\n");
        System.out.print("\n\n\n\n\n");
        
        displayseats();
        
        System.out.print("Reservation's List\n");
        
        int q = 0;

        for(int i=people.size();i!=0;i--){
            q++;
            if (i == people.size()){
                System.out.print("-----------------------------------------------------------------------------------------------------------------------\n");
            }
            System.out.print("No."+q+":"+people.head().display());
            people.rotateA();
            if (i == 1){
                System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
            }
        }
        
         System.out.print("Press any key to continue . . . \n");
         scan.nextLine();
         System.out.print("\n\n\n\n\n");
         System.out.print("\n\n\n\n\n");
         
         start();
         
    }
    
    public static void displayseats(){
                   
        String waw [][];      
        waw = new String [16][9];
        int row = 1;
        String p = "";
        
        System.out.print("  AIRLINE DISPLAY SEAT DISPLAY\n\n                 Columns\n");
            
        for (int i = 1; i < 16; i++) {  
            
           for (int j = 1;j< 9;j++){   
                              
               waw[i][j]= " = ";
               
               for (int maw =0 ; maw < people.size();maw++){
               
               if (j == people.head().getColumn() && i == people.head().getRow()){
                   waw[i][j]= " X ";
               } 
                 people.rotateA();
               }
               
                if(j==1){

                        if(row <= 9)
                        p+="Row:"+row+"     ";

                        else
                        p+="Row:"+row+"    ";                                   
                    }         
                 p+=waw[i][j]; 
             }  
           
           p+="\n";  
           row++;         
     }   
        
   System.out.print(p);
 
   System.out.print("\n");
   
    }
    
}
