public class Animal {
    private String Type;
    private String []  continents;
    private float weight;
    private int age;


    public Animal () {this(  "No Type Specified ",null , 0.0f,  0);}

    public Animal(String Type,String [] continents, float weight,int age)
    {
        setType(Type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
    }

    public void setType(String Type)
    {
        this.Type=Type;
    }

    public void setContinents(String [] Continents) {


        this.continents = Continents;
    }




    public void setAge(int Age)
    {
        this.age=Age;
    }

    public void setWeight(float Weight)
    {
        this.weight=Weight;
    }

    public String getType() {
        return Type;
    }

    public String [] getContinents() {
       return continents;
   }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }


    public String toString(){

        String Message = " ";
        if(continents!=null) {


            for (int x = 0; x < continents.length; x++) {
                Message += continents[x].toString();
            }

        }

        return String.format("Type " + getType() +
                " Homes  " + Message + "  age " + getAge() +  " Weight " +getWeight() + "\n");
    }
}
