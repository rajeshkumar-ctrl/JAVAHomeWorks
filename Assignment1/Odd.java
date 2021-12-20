package JAVA.ToSubmit;


public class Odd {
    public static void main( String [] args)
    {
        if(args.length!=1)
        {
            System.err.println("Give exactly one integer number as an argument!");
        }
        else
        {
            int num = Math.abs(Integer.parseInt(args[0]));
            // when i put -5 it was showing me EVEN, but after putting abs, it gives correct!
            String answer = (num %2 ==1)? "odd" : "even";
            System.out.println(answer);
        }
    }
}
