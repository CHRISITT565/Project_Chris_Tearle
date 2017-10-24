import javax.naming.NamingEnumeration;

public class House  {


    private String Address;
    private Double Price;
    private String Type;

    public Person Owner;


    public House(){this( "no Address Specified", "No Type Secifyed", 0.0 ,"No Name",0,"no Contact given");}


    public House(String Address,String Type,Double Price, String Name, int Age , String Number){

        setType(Type);
        setAddress(Address);
        setPrice(Price);
        Owner = new Person(Name,Age,Number);




    }

    public void setType(String Type)
    {
        this.Type=Type;
    }

    public void setAddress(String Address)
    {
        this.Address=Address;
    }

    public  void setPrice(Double Price){
        this.Price= Price;
    }

    public void setOwner(String Name, int Age , String Number) {
        Owner .setName(Name);
        Owner.setAge(Age);
        Owner.setNumber(Number);
    }

    public String getAddress() {
        return Address;
    }

    public String getType() {
        return Type;
    }

    public Double getPrice() {
        return Price;
    }

    public Person getOwner() {
        return Owner;
    }

    @Override
    public String toString() {
        return "House at " + getAddress() + " is a " + getType() + " it costs €" + getPrice() + "\nAnd is Currently owned by " + getOwner();
    }
}
