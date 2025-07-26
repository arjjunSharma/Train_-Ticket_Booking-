package ticket.booking.entities;

import java.util.List;

public class User {
   private String name;
    private String password;
    private String hashedPassword;
    private List<Ticket> ticketsBooked;
    private String userId;
    //constructor of user class
    public User(String name,String password, String hashedPassword,String userId,List<Ticket> ticketsBooked){
       this.name= name;
       this.password= password;
       this.hashedPassword= hashedPassword;
       this.userId = userId;
       this.ticketsBooked = ticketsBooked;
   }
    public User( )
    {
    }

    public String getName() {
        return name;
    }

    public String getPassword(){
        return password;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }
    // Constructors, getters, and setters
}
