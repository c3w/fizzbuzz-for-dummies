import java.util.Scanner;

public class FizzBuzz {

public static void main(String[] argv) {
  int i;
  String userResult;
  boolean fizzbuzz = false;

  Scanner scanner = new Scanner(System.in);

  System.out.print("Input pls: ");

  while ((i = scanner.nextInt()) != 0) {
    userResult = Integer.toString(i);

    if ( i % 3 == 0 && i % 5 == 0 ) {
      userResult = "fizzbuzz";
      fizzbuzz = true;
    }

    if (fizzbuzz == false) {
      if ( i % 3 == 0 ) {
        userResult = "fizz";
      }
      if ( i % 5 == 0 ) {
        userResult = "buzz";
      }
    }
		
    System.out.println(userResult);
    System.out.print("Input pls: ");
  }
}
}
