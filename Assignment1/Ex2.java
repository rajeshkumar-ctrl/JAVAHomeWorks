package JAVA.ToSubmit;

public class Ex2 {
    public static void main(String[] args) {
        // [1..9]
        int END= Integer.parseInt(args[0]);
        int SUM=0;
        int k;
        int counter=0;
        //System.out.println(END);
        for ( k=1;k<=END;k++) // listing numbers inform to array to check each number from 1 to our argument.!
        {
            for(int i=1;i<k;i++)
            {
                if(k%i==0)
                {
                    SUM=SUM+i;
                  //just to check the divisors of the perfect number // System.out.println(i);
                }
            }

            if(SUM==k)
            {
            counter++;
            }
        
            SUM = 0;
        }
        
        System.out.println("Perfect Numbers are : " + counter);
    }
    
}
