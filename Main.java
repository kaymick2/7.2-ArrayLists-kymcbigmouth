import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner caixaDoCaralho= new Scanner(System.in);

    ArrayList<String> satan = new ArrayList<String>();
    System.out.println("exercise a. Type a string to add to element 1");
    String x=caixaDoCaralho.next();
    satan.add(x);
    System.out.println(satan);
  }
}