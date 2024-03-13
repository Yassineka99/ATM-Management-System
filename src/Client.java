/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yassine
 */
public class Client {
        public String name;
    public String lastname ;
    public String age ;
    public String cin ;
    public String balance ;
    public String cardnum ;
    public String cardpass ;
    public Client(String cardnum , String cardpass)
    {
        this.cardnum=cardnum;
        this.cardpass=cardpass ;
    }
    public Client(String balance)
    {
        this.balance=balance;
    }
    public Client()
    {
    
    }
}
