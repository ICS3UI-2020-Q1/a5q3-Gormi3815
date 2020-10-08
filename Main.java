import java.util.Scanner;
/** this program will tell you the factorial of a number
 *
 * @author isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    //if 5=y 5x4x3x2x1
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter an integer to see the factorial");
     int num = input.nextInt();
     int sum = 1;
      for (int count = 0; count < num ; count++){
         int end = (num-count);
         sum = sum * end;
      } System.out.print(sum);
  }
}
