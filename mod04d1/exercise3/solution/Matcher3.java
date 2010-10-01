public class Matcher3 {

  private String item;

  public Matcher3(String item_to_match) {
    item = item_to_match;
  }

  /**
   * returns the item to match
   */
  public String getItem() {
    return item;
  }

  public boolean find(String line) {
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
    Matcher3 jane_matcher = new Matcher3("Jane");
    Matcher3 samantha_matcher = new Matcher3("Samantha");
    String sentence1 = "Tommorow, Jane will take Bill to the concert.";
    String sentence2 = "Fred sat on a log.";
    String sentence3 = "Jane and Samantha went to the concert because Bill was sick.";

    if ( jane_matcher.find(sentence1) ) {
      System.out.println("'" + jane_matcher.getItem() + "' was found in the sentence '" +
			 sentence1 + "'");
    } else {
      System.out.println("'" + jane_matcher.getItem() + "' was not found in the sentence '" +
			 sentence1 + "'");
    }
    if ( jane_matcher.find(sentence2) ) {
      System.out.println("'" + jane_matcher.getItem() + "' was found in the sentence '" +
			 sentence2 + "'");
    } else {
      System.out.println("'" + jane_matcher.getItem() + "' was not found in the sentence '" +
			 sentence2 + "'");
    }
    if ( jane_matcher.find(sentence3) ) {
      System.out.println("'" + jane_matcher.getItem() + "' was found in the sentence '" +
			 sentence3 + "'");
    } else {
      System.out.println("'" + jane_matcher.getItem() + "' was not found in the sentence '" +
			 sentence3 + "'");
    }

    if ( samantha_matcher.find(sentence1) ) {
      System.out.println("'" + samantha_matcher.getItem() + "' was found in the sentence '" +
			 sentence1 + "'");
    } else {
      System.out.println("'" + samantha_matcher.getItem() + "' was not found in the sentence '" +
			 sentence1 + "'");
    }
    if ( samantha_matcher.find(sentence2) ) {
      System.out.println("'" + samantha_matcher.getItem() + "' was found in the sentence '" +
			 sentence2 + "'");
    } else {
      System.out.println("'" + samantha_matcher.getItem() + "' was not found in the sentence '" +
			 sentence2 + "'");
    }
    if ( samantha_matcher.find(sentence3) ) {
      System.out.println("'" + samantha_matcher.getItem() + "' was found in the sentence '" +
			 sentence3 + "'");
    } else {
      System.out.println("'" + samantha_matcher.getItem() + "' was not found in the sentence '" +
			 sentence3 + "'");
    }
  }
}
