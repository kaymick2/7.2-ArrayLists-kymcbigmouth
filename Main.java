import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner caixaDoCaralho = new Scanner(System.in);

    ArrayList<String> satan = new ArrayList<String>();
    System.out.println("exercise a. Type a string to add to element 1");
    satan.add(caixaDoCaralho.next());
    System.out.println(satan);
    // exercise b
    System.out.println("enter thing to put before the last thing: ");
    satan.add(0, caixaDoCaralho.next());
    System.out.println("your new array list is: ");
    System.out.println(satan);
    // exercise c
    satan.remove(0);
    System.out.println("Now i broke it. it look like this now. ");
    System.out.println(satan);
    // exercise d
    System.out.println("i just removed element 0. now pick something to replace it with and slam enter: ");
    satan.set(0, caixaDoCaralho.next());
    System.out.println("it now looks like this: ");
    System.out.println(satan);
    // exercise e
    System.out.println("you are now going to enter 4 more items.");
    int y = 0;
    while (y < 4) {
      System.out.println("enter an element: ");
      satan.add(caixaDoCaralho.next());
      y++;
    }
    System.out.println("your new array list has "+satan.size()+" elements. it looks like this: ");
    System.out.println(satan);
    //exercise f
    System.out.println("which element do you want to print out to the screen? make sure you only type 0-4 or the java gods will kill you. ");
    System.out.println(satan.get(caixaDoCaralho.nextInt()));
    System.out.println("the array has "+satan.size()+" elements.");
  }
}