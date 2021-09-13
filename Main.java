import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number to count down or up from:");
    int num = s.nextInt();
      for(int negNum = num; negNum<=0; negNum++)
      System.out.println(negNum);
      for (int posNum = num; posNum >= 0; posNum--)
      System.out.println(posNum);
    System.out.println("Blast off!");
    }
    }
  

