import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner caixaDoCaralho = new Scanner(System.in);

    ArrayList<String> satan = new ArrayList<String>();
    System.out.println("exercise a. Type a string to add to element 1");
    String x = caixaDoCaralho.next();
    satan.add(x);
    System.out.println(satan);
    // exercise b
    System.out.println("enter thing to put before the last thing: ");
    satan.add(1, caixaDoCaralho.next());
    System.out.println("your new array list is: ");
    System.out.println(satan);
    // exercise c
    satan.remove(0);
    System.out.println(satan);
    // exercise d
    System.out.println("i just removed element 0. now pick something to replace it with and slam enter: ");
    System.out.println(satan);
    // exercise e
    System.out.println("you are now going to enter 4 more items.");
    int y = 0;
    while (y <= 4) {
      System.out.println("enter an element: ");
      satan.add(caixaDoCaralho.next());
      y++;
    }
    System.out.println(satan);
  }
}