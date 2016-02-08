import java.io.Console;

public class PingPong {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a number greater than 0");
    String stringNumber = myConsole.readLine();
    Integer number = Integer.parseInt(stringNumber);

    for (Integer index = 0; index <= number; index++) {
      if (index == 0) {
        System.out.println(index);
      }
      else if ( index % 15 == 0) {
       System.out.println("ping-pong");
     }
      else if (index % 3 == 0) {
        System.out.println("ping");
      }
      else if ( index % 5 == 0) {
        System.out.println("pong");
      }
    else {
      System.out.println(index);
    }
  }
}
}
