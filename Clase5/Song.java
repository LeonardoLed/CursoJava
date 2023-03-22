import java.util.Random;
public class Song{

  public static String newDay(){
      Random a = new Random();
      String aux;

      int b = a.nextInt(12)+1;
      if (b == 10){ aux = "a";}
      else if (b == 11){ aux = "b";}
      else if (b == 12){ aux = "c";}
      else{aux = Integer.toString(b);}
      return aux;

  }

  public static void main(String[] args) {
    TwelveDays mysong = new TwelveDays();
    String myRythm = "";
    String gift;
    boolean flag;


    for (int i = 1; i<=12 ; i++){


      flag = false;
      if (myRythm.length() == 0){
        gift = newDay();
        myRythm = myRythm + gift;
      }else{

        do{
          gift = newDay();
          flag = false;
          for (int j = 0; j <myRythm.length(); j++){
            if (myRythm.charAt(j) == gift.charAt(0)){ flag = true;}
          }
        }while(flag);

        myRythm = myRythm + gift;

      }
      //System.out.println(myRythm + ":" + i);

      mysong.Intro(i);
      for (int k = myRythm.length()-1; k >= 0; k-- ){
        mysong.Day(myRythm.charAt(k));
        if (k==0){System.out.println(".");}
        else{System.out.println(",");}



    }
    System.out.println("❥❥❥❥❥⸙⸙⸙⸙⸙⸙⸙⸙⸙❥❥❥❥❥⸙⸙⸙⸙⸙⸙⸙⸙⸙");



  }





}
}
