public class TestArrays {
  public static void main(String[] args) {
    // Step 1 & 2: declare/initialize array variables
    int[]  array1 = { 2, 3, 5, 7, 11, 13, 17, 19 };
    int[]  array2;

    // Step 3: display array1 with initial values
    System.out.print("array1 is ");
    printArray(array1);
    System.out.println();

    // Step 4: make array2 refer to array1
    array2 = array1;
    // modify array2
    array2[0] = 0;
    array2[2] = 2;
    array2[4] = 4;
    array2[6] = 6;
    // print array 1
    System.out.print("array1 is ");
    printArray(array1);
    System.out.println();

    // Step 5: declare a multi-dimensional array of ints
    int[][] matrix = new int[5][];

    // Step 6: populate the matrix in a triangular formation
    for ( int i = 0; i < matrix.length; i++ ) {
      matrix[i] = new int[i];
      for ( int j = 0; j < i; j++ ) {
	matrix[i][j] = i * j;
      }
    }

    // Step 7: print the matrix
    for ( int i = 0; i < matrix.length; i++ ) {
      System.out.print("matrix[" + i + "] is ");
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
