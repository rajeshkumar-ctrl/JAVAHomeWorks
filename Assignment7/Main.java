//package basics;

public class Main{
  public static void main(String[] args) {
    // Construction of a matrix of size M×N containing zero elements.
    Matrix m = new Matrix(2, 5);
    // {1,2,3,4,5,6,7,8,9,10}
   
    System.out.println("Empty matrix of MxN with zero Elements! ");
    System.out.println(m.toString());


    //Construction of a matrix of size M×N, initialized in a row major order from an array (double[]) of length M⋅N.
    System.out.println("Matrix by row major order of MxN");
    double[] array={0,1,2,3,4,5,6,7,8,9};

    Matrix matrixone = new Matrix(array,2,5);
    System.out.println(matrixone.toString());
     
   
   


    //Construction of an identity matrix of size N×N implemented as a static method.
    int row=5;
    System.out.println("Identity Matrix: ");
    m.getIdentityMatrix(row,row);

    // The transpose of a matrix.
    System.out.println("Transpose: of ");
    System.out.println(matrixone.toString());
    System.out.println("=>");
    System.out.println(Matrix.transpose(matrixone).toString());


   // The sum of two (equally sized) matrices.
   double[] arrayone={0,1,2,3,4,5,6,7,8};

   Matrix mone = new Matrix(arrayone,3,3);
   System.out.println("Matrix mone: ");
   System.out.println(mone.toString());
   Matrix mtwo = new Matrix(arrayone, 3,3);
   System.out.println("Matrix mtwo: ");
   System.out.println(mtwo.toString());
   System.out.println("Sum of Matrix mone and Matrix mtwo: ");
   System.out.println(Matrix.sum(mone, mtwo).toString());
  // The difference of two (equally sized) matrices.
  System.out.println("Difference of Matrix mone and Matrix mtwo: ");
  System.out.println(Matrix.difference(mone, mtwo).toString());
    
  }
}
