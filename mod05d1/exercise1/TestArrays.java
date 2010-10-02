public class TestArrays {
  public static void main(String[] args) {
   int[] array1={2,3,5,7,11,13,17,19};
   int[] array2;
   int[][] matrix = new int[5][];
   int i=0;
   printArray(array1);
   array2=array1;
   for(i=0; i<array1.length;i+=2)
	   array2[i]=i;
   printArray(array1);
   System.out.println();
   
   for(i=0; i<matrix.length;i++)
   {
	   matrix[i]=new int[i];
	   for(int j=0; j<matrix[i].length;j++)
	   {
		   matrix[i][j]=i*j;
	   }
   }
   for(i=0;i<matrix.length;i++)
   {
	   System.out.print("Matrix["+i+"] is ");
	   printArray(matrix[i]);
	   System.out.println();
   }
}
  public static void printArray(int[] array) {
    System.out.print('<');
    for ( int i = 0; i < array.length; i++ ) {
      // print an element
      System.out.print(array[i]);
      // print a comma delimiter if not the last element
      if ( (i + 1) < array.length ) {
	System.out.print(", ");
      }
    }
    System.out.print('>');
  }
}
