public class Matcher1 {
  public static void main(String[] args) {
    int        i, j;
    boolean    found = false;
    String name;
    String sentence;

    name = "Jane";
    sentence = "Tommorow, Jane will take Bill to the concert.";
    for ( i = 0; (i < sentence.length()) && !found; i++ ) {
      j = 0;
      found = false;
      while ( ! found ) {
	if ( j >= name.length() ) {
	  break;
	} else if ( (i + j) >= sentence.length() ) {
	  break;
	} else if ( name.charAt(j) != sentence.charAt(i + j) ) {
	  break;
	} else {
	  j++;
	  if ( j == name.length() ) {
	    found = true;
	  }
	}
      }
    }
    if ( found ) {
      System.out.println("'" + name + "' was found in the sentence '" +
			 sentence + "'");
    } else {
      System.out.println("'" + name + "' was not found in the sentence '" +
			 sentence + "'");
    }
  }
}
