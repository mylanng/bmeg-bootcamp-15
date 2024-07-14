// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays; 
import java.util.List; 
// import org.junit.jupiter.api.Test;

public class Main {
  public static int countEvenNum (int[] arr, int size){
    int count = 0;
    for (int i = 0; i < size; i++){
      if (arr[i] % 2 == 0){
        count++;
      }
    }
    return count;
  }
  
  public static void main(String[] args) {
    int n = 5;
    //List <Integer> foo = Arrays.asList (0,1,2,3,4);
    int [] foo = {0,1,2,3,4};

    int m = 100;
    int [] bar = new int [m];

    for (int i = 0; i < m; i++){
      bar[i] = i;
    }
    
    System.out.println("The total number of even numbers in foo are: \n" + countEvenNum(bar, m));
  }

}