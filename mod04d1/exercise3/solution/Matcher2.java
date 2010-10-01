public class Matcher2 {

  public static boolean find(String item, String line) {
    int        i, j;
    boolean    found = false;

    for ( i = 0; (i < line.length()) && !found; i++ ) {
      j = 0;
      found = false;
      while ( ! found ) {
	if ( j >= item.length() ) {
	  break;
	} else if ( (i + j) >= line.length() ) {
	  break;
	} else if ( item.charAt(j) != line.charAt(i + j) ) {
	  break;
	} else {
	  j++;
	  if ( j == item.length() ) {
	    found = true;
	  }
	}
      }
    }

    return found;
  }

  public static void main(String[] args) {
    String name;
    String sentence;

    name = "Jane";
    sentence = "Tommorow, Jane will take Bill to the concert.";
    if ( Matcher2.find(name, sentence) ) {
      System.out.println("'" + name + "' was found in the sentence '" +
			 sentence + "'");
    } else {
      System.out.println("'" + name + "' was not found in the sentence '" +
			 sentence + "'");
    }

    name = "Samantha";
    if ( find(name, sentence) ) {
      System.out.println("'" + name + "' was found in the sentence '" +
			 sentence + "'");
    } else {
      System.out.println("'" + name + "' was not found in the sentence '" +
			 sentence + "'");
    }
  }
}
