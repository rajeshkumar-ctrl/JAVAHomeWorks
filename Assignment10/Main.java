// There are two types of guests: Adult and Minor, both inherit Guest
public class Guest {
    private String name;
    private int age;
    public Guest(String innit_name, int innit_age)
    {
        this.name = innit_name;
        this.age = innit_age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
 class Minor extends Guest{
    public Minor(String innit_name, int innit_age){
        super(innit_name, innit_age);
    }
}
class Adult extends Guest{
    public Adult(String innit_name, int innit_age){
        super(innit_name, innit_age);
    }
}
class Beverage{
    private String name;
    private int legalAge;
    // Create a constructor that receives these values and sets them, 
    // throw an IllegalArgumentException if either field is incorrect. 
    public Beverage(String innit_name, int innit_legalAge)
    {
        if(innit_name == ""  || innit_legalAge < 0)
        {
            throw new IllegalArgumentException();
        } 
        this.name = innit_name;
        this.legalAge = innit_legalAge;
    }
    public String getName()
    {   return this.name;
    }
    public int getLegalAge(){
        return this.legalAge;
    }
}
class Bartender {
    public boolean order(Beverage b, Adult a)
    {
        return true;
        // halal ha ye to xD
    }
    public boolean order(Beverage b, Minor m)
    {
        if(b.getLegalAge() == 18) { return false; }
        else { return true; }
    }
    }
 class Main 
    {
        static void toStringOrder(Bartender Joe, Adult a, Beverage b)
    {
        if(Joe.order(b, a))
        {
        System.out.println("The bartender can give " + b.getName() + " to " + a.getName());
        }
        else
        {
        System.out.println("The bartender can NOT give " + b.getName() + " to " + a.getName());
        }
    }
    static void toStringOrder(Bartender Joe, Minor m, Beverage b)
    {
        if(Joe.order(b, m))
        {
        System.out.println("The bartender can give " + b.getName() + " to " + m.getName());
        }
        else
        {
        System.out.println("The bartender can NOT give " + b.getName() + " to " + m.getName());
        }
    }
          public static void main(String[] args) 
    {
        // tests
        Beverage cola = new Beverage("cola", 0);
        Beverage vine = new Beverage("vine", 18);
        Adult dad = new Adult("Rajesh Kumar", 35);
        Minor kid = new Minor("Ahmed ", 10); 
        Bartender Joe = new Bartender();
        toStringOrder(Joe, dad, cola);
        toStringOrder(Joe, kid, cola);
        toStringOrder(Joe, dad, vine);
        toStringOrder(Joe, kid, vine); 
    }
}
// it takes three days to understand this question xD
