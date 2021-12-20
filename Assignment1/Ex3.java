package JAVA.ToSubmit;

public class Ex3 {
    public static void main(String[] args) {
        long result=0;
        long FirsNum=Long.parseLong(args[0]);
        long SecondNUM=Long.parseLong(args[1]);
        if(args.length==0)
        {
         System.err.println("Invalid INPUT");
         System.exit(0);   
        }
        else
        {
            for(int i=1;i<=FirsNum && i<=SecondNUM;i++)
        {
            if (FirsNum%i==0 && SecondNUM%i==0)
            {
                result=i;

            }
        }

        System.out.println("GCD of Your Numbers is:" +result);

        }
        
    }
}
    
