public class Message {
    private String Sender, Recipient;
    private String EMessage;

    public Message(){
        this("unknown","Unknown","No Message entered");
    }

    public Message(String Sender, String Recipient,String EMessage)
    {
        setSender("Unknown");
        setRecipient("Unknown");
        setEMessage("No Message entered");

    }
    public void setSender(String Sender)
    {
        this.Sender=Sender;
    }

    public void setRecipient(String Recipient) {


        this.Recipient = Recipient;
    }



    public void setEMessage(String EMessage)
    {
        this.EMessage=EMessage;
    }



    public String getSender() {
        return Sender;
    }

    public String getRecipient() {
        return Recipient;
    }

    public String getEMessage() {
        return EMessage;
    }



    public String toString(){
        return String.format("From: " + getSender() + "  To:"  + getRecipient() +
            "\n Message " + getEMessage());
    }
}


