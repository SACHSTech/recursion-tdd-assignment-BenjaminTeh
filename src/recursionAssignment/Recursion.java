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
    char lastLetter;
    char firstLetter;
    int length = str.length();
    lastLetter = str.charAt(length - 1);
    firstLetter = str.charAt(length - 2);
      if(firstLetter == lastLetter){
        return str.substring(0, (length - 2)) + "*" + lastLetter;
      }
      else{
        return pairStar(str.substring(0, (length - 2)));
      }
  }
  
}
