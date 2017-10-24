public class Person {

    private String Name;

    private int age;

    private String Number;

    public Person(){this("no Name",0,"No NUmber Given");}

    public Person(String Name,int Age,String Number)
    {
        setName(Name);
        setAge(Age);
        setNumber(Number);
    }


    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public String getNumber() {
        return Number;
    }

    @Override
    public String toString() {
        return "Name " + getName() + " Age " + getAge() + " Contact " + getNumber();
    }
}
