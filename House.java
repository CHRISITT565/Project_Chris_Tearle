public class House extends Person{


    private String Address;
    private Double Price;
    private String Type;

    public Person Owner;


    public House(){this( "no Address Specified", "No Type Secifyed", 0.0 ,new Person());}


    public House(String Address,String Type,Double Price, String Name, int Age , String Number){

        setType(Type);
        setAddress(Address);
        setPrice(Price);
       Owner.setName(Name);
       Owner.setAge(Age);
       Owner.setNumber(Number);



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

    public void setOwner(Person owner) {
        Owner = owner;
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
        return "House at " + getAddress() + " is a " + getType() + " it costs €" + getPrice() + "And is Currently owned by " + getOwner();
    }
}
