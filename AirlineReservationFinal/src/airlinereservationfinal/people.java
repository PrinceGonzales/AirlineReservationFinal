/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationfinal;

/**
 *
 * 
 */
public class people {

     private String name,address,email,phonenumber,tarrifs,schedule,ticketcode,Aclass;
    private int age,column,row;
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phonenumber
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * @param phonenumber the phonenumber to set
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the tarrifs
     */
    public String getTarrifs() {
        return tarrifs;
    }

    /**
     * @param tarrifs the tarrifs to set
     */
    public void setTarrifs(String tarrifs) {
        this.tarrifs = tarrifs;
    }

    /**
     * @return the schedule
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * @param schedule the schedule to set
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * @return the ticketcode
     */
    public String getTicketcode() {
        return ticketcode;
    }

    /**
     * @param ticketcode the ticketcode to set
     */
    public void setTicketcode(String ticketcode) {
        this.ticketcode = ticketcode;
    }

    /**
     * @return the Aclass
     */
    public String getAclass() {
        return Aclass;
    }

    /**
     * @param Aclass the Aclass to set
     */
    public void setAclass(String Aclass) {
        this.Aclass = Aclass;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the column
     */
    public int getColumn() {
        return column;
    }

    /**
     * @param column the column to set
     */
    public void setColumn(int column) {
        this.column = column;
    }

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

   
    public people(String name,int age,String address,String phonenumber,String email,String tarrifs,String schedule,String ticketcode,int row,int column,String Aclass){
        
        this.name = name;  // a
        this.age = age; // b
        this.address = address; // c
        this.phonenumber = phonenumber; // d
        this.email = email; // e 
        this.tarrifs = tarrifs;// f
        this.schedule = schedule; // g 
        this.ticketcode = ticketcode; // h 
        this.column = column;// i 
        this.row = row;// j
        this.Aclass = Aclass; //k
    }
       
    public String display(){
        
        String display;
        
        display = "["+"Name: "+getName()+"]"+"["+"Age: "+getAge()+"]"+"["+"Address: "+getAddress()+"]"+"["+"Phone Number: "+getPhonenumber()+"]\n"
                +"["+"Email: "+getEmail()+"]"+"["+"Column: "+getColumn()+"]"+"["+"Row: "+getRow()+"]"+"["+"Flight Schedule: "+getSchedule()+"]\n"
                +"["+"Tax: "+getTarrifs()+"]"+"["+"Ticket Code: "+getTicketcode()+"]"+"["+"Class: "+getAclass()+"]"+"\n\n";
        
        return display;
                    
    }

    
}
