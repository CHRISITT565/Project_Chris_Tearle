public class BankAccount {

    private String name;
    private int accNum;



    public BankAccount()
    {
       this("No Name Given", 0);
    }

    public BankAccount(String name,int accNum)
    {
        setName(name);
        setAccNum(accNum);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public String getName() {
        return name;
    }

    public int getAccNum() {
        return accNum;
    }


    public String toString() {
        return super.toString();
    }
}
