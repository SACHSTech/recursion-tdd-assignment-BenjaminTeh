package recursionAssignment;
import java.io.*;

public class Recursion{

  public static int count7(int n){
    int sevenCounter = 0;
    if (n < 0){
      return -1;
    }
    else if (n % 10 == 7){
      sevenCounter++;
      if (n / 10 == 0 && n % 10 == 7){
        return sevenCounter;
      }
      n = n / 10;
    }
    else if (n % 10 != 7){
      if (n / 10 == 0 && n % 10 != 7){
        return sevenCounter;
      }
      n = n / 10;
    }
    return count7(n) + sevenCounter;
  }
  
}
