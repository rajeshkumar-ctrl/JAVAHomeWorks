class RectangleMain {
    public static void main(String[] args) 
    {
        
    if( args.length < 8 )
    {
            System.out.println("Incorrect Number of Arguments! Put exactly 8 arguments whih are 4-4 vertices of two rectangle!");
            return;
        }

        Rectangle r1 = new Rectangle();
        // r1 and r2 as rectangle!

        r1.x = Double.parseDouble(args[0]);
        r1.y = Double.parseDouble(args[1]);
        r1.Width = Double.parseDouble(args[2]);
        r1.Height = Double.parseDouble(args[3]);

        // so now we will make bottom left and top right of this rectaagle here naming r1!
        Point bottomLeft_r1 = r1.BOTTOM_RIGHT();
        Point topRight_r1 = r1.TOP_RIGHT();

        Rectangle r2 = new Rectangle();
        r2.x = Double.parseDouble(args[4]);
        r2.y = Double.parseDouble(args[5]);
        r2.Width = Double.parseDouble(args[6]);
        r2.Height = Double.parseDouble(args[7]);

        Point bottomLeft_r2 = r2.bOTTOM_LEFT();
        Point topRight_r2 = r2.TOP_RIGHT();

        
        //
        //well i avoided the if and else statment here and used  ternary or conditional operator from first lab xDD

        bottomLeft_r1.x = bottomLeft_r1.x>= bottomLeft_r2.x ? bottomLeft_r2.x: bottomLeft_r1.x;
        bottomLeft_r1.y = bottomLeft_r1.y > bottomLeft_r2.y ? bottomLeft_r2.y : bottomLeft_r1.y;
        topRight_r1.x = topRight_r1.x < topRight_r2.x ? topRight_r2.x : topRight_r1.x;
        topRight_r1.y = topRight_r1.y < topRight_r2.y ? topRight_r2.y : topRight_r1.y;

        // thats part B of question and used Double.max, Double.min built-in functions!

        //double number = Double.max(1,3);
        //System.out.println(number); => 3.0

    double finalBottomleft_x = Double.min(bottomLeft_r1.x, bottomLeft_r2.x);
    double finalBottomleft_y = Double.min(bottomLeft_r1.y, bottomLeft_r2.y);
    double finalTopright_x = Double.max(topRight_r1.x, topRight_r2.x);
    double finalTopright_y = Double.max(topRight_r1.y, topRight_r2.y);

    System.out.println("Bounding rectangle:"+ finalBottomleft_x+" : "+ finalBottomleft_y+"  --  "+ finalTopright_x+ " : " +finalTopright_y);



        

        /*


        
/// this is goonna be good but not sure of code...

        
        // same goes for here

        /// enclosing reactangle!
        
*/




    }

}
