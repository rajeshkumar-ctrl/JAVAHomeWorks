package JAVA.ToSubmit;

public class Ex1 {
    public static void main(String[] args) {
        int Num= Integer.parseInt(args[0]);
        int Sum=0;
        if(Num<6)
        {
            System.err.println("Sorry its not Perfect Number!");
            System.exit(0);
        }
        
        else
        {
            for(int i=1;i<Num;i++)
            {
                if(Num%i==0)
                {
                    Sum+=i; //Sum=Sum+i;
                  //just to check the divisors of the perfect number // System.out.println(i);
                }   
            }
        }
        if(Sum==Num)
        {
            System.out.println("Yes That is Perfect!");
        }
        else
        {
            System.out.println("Sorry its not Perfect Number!");
        }
    
}
}
