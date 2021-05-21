package recursionAssignment;
import java.io.*;

public class Recursion{

  public static int count7(int n){
    int sevenCounter = 0;
    // If negative number, return nothing
    if (n < 0){
      return -1;
    }
    // If it is a 7, add to the counter
    else if (n % 10 == 7){
      sevenCounter++;
    // If it is exactly 7, also end the method
      if (n / 10 == 0 && n % 10 == 7){
        return sevenCounter;
      }
      n = n / 10;
    }
    // Same process but when it is not 7, no counter adds
    else if (n % 10 != 7){
      if (n / 10 == 0 && n % 10 != 7){
        return sevenCounter;
      }
      n = n / 10;
    }
    // Recursive case
    return count7(n) + sevenCounter;
  }

  public static String pairStar(String str){
// Ends method if there aren't two characters to compare
    int length = str.length();

    if (str.length() < 2){
        return str;
    }

    char firstLetter = str.charAt(0);
    char secondLetter = str.charAt(1);
// If the characters match, print out firstLetter, a star, and run again
    if (firstLetter == secondLetter){
      return str.substring(0, 1) + "*" + pairStar(str.substring(1));
    }
// If they do not match, print out firstLetter, run again
    else{
      return str.substring(0, 1) + pairStar(str.substring(1));
    }
  }

  public static String stringClean(String str){
    if(str.length() == 1){
      return str;
    }

    if (str.charAt(0) == str.charAt(1)){
      return stringClean(str.substring(1));
    }
    else{
      return str.substring(0,1) + stringClean(str.substring(1));
    }
  }
  
}
