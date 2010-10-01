public class Matcher {

  public static void main(String[] args) {
    String[]   names = { "Jane", "Fred", "Samantha" };
    String[]   sentences = {
      "Tommorow, Jane will take Bill to the concert.",
      "Fred sat on a log.",
      "Jane and Samantha went to the concert because Bill was sick." };
    int        index = 0, i, j;
    boolean    found = false;

    String name = "Jane";
    String sentence = "Tommorow, Jane will take Bill to the concert.";
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
	    index = i;
	  }
	}
      }
    }
    if ( found ) {
      System.out.println("'" + name + "' was found in the sentence '" +
			 sentence + "' at index=" + index);
    } else {
      System.out.println("'" + name + "' was not found in the sentence '" +
			 sentence + "'");
    }
  }
}
