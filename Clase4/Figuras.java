import java.util.Random;

public class Figuras{

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  public static void main(String[] args) {

  //ROMBO
  Random a = new Random();
  int b = a.nextInt(50)+1; //offset

  int j = 0;
  int level = 0;

  while(j < b-1 ){

    int i = 0;
    level = b-j-1;
    while (level>0){
      System.out.print(ANSI_YELLOW + " ");
      level--;
    }


    while (j >= i){
      System.out.print("* ");
      i++;
    }

    System.out.println("");
    j++;

  }
  System.out.print(ANSI_RESET);

  //incremental

  j = b;
  level = 0;


  while(j > 0){

    int i = 1;
    level = b-j;
    while (level>0){
      System.out.print(ANSI_RED + " ");
      level--;
      //i++;
    }


    while (j >= i){
      System.out.print("* ");
      i++;
    }

    System.out.println("");
    //level++;
    j--;

  }

  System.out.print(ANSI_RESET);


  }
}
