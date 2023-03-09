import java.util.Random;

public class Figuras{
  public static void main(String[] args) {
  //ROMBO
  Random a = new Random();
  int b = a.nextInt(50)+1; //offset

  //incremental

  int j = b;
  int level = 0;

  while(j > 0){
    int i = 1;
    level = b-j;
    while (level>0){
      System.out.print(" ");
      level--;
      //i++;
    }


    while (j >= i){
      System.out.print("* ");
      i++;
    }

    System.out.println("");
    level++;
    j--;

  }

  }
}
