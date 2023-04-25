import java.util.Scanner;

public class Player{
  private Nave[] flota = new Nave[5];
  private Malla Malla_player = new Malla();


  // Jugador Uno

  public Player(){
    assigPlay();
  }

  private int[] asking(int inave){
    boolean flag = true;
    boolean flagN = false;
    int [] posicion = new int[3];
    Scanner entrada = new Scanner(System.in);
    int x, y, o;

    do{
      flagN = false;
      System.out.println("Dame la posicion x inicial");
      x = entrada.nextInt();
      System.out.println("Dame la posicion y inicial");
      y = entrada.nextInt();
      System.out.println("Dame la orientacion [0 -> vertical] y [1-> horizontal]");
      o = entrada.nextInt();

      if (( x >=0 && x <= 9) && ( y >= 0 && y <= 9) && (o >= 0 && o <= 1)){
        // buscamos que esa posicion ya no se haya ocupado
        if (o == 0){
          if (y+Nave.lifesize[inave] <= 9) {
            System.out.print("entre");
            for (int k=0; k<=inave; k++){
              System.out.println(Malla_player.getNaveMatrix(x+k, y) + "," + x+k + ","+y + "," +flagN);
              if (Malla_player.getNaveMatrix(y+k, x) != 0 ){
                flagN = true;
              }
            }
            if (flagN){ flag = true;}else{flag = false;}

          }
        }else{
          if(x + Nave.lifesize[inave] <= 9){

            for (int k =0; k<=inave; k++){
              //System.out.println(Malla_player.getNaveMatrix(x, y+k) + "," + x + "," + y+k + "," + flagN);
              if (Malla_player.getNaveMatrix(x, y+k) != 0 ){
                flagN = true;
              }
            }
            if (flagN){ flag = true;}else{flag = false;}


          }
        }
      }

      if (flag){
        System.out.println("Inserta una coordenada correcta ");
      }else{
        posicion[0] = x;
        posicion[1] = y;
        posicion[2] = o;
      }

    }while(flag);

    return posicion;
  }

  //nuestro jugador acomoda los barcos en la Malla
  private void assigPlay(){
    int posicion[];
    System.out.println("Recuerda que las naves son:");
    System.out.println("Nave 1: tamaño 2");
    System.out.println("Nave 2 y 3: tamaño 3");
    System.out.println("Nave 4: tamaño 4");
    System.out.println("Nave 5: tamaño 5");

    for(int i = 0; i < flota.length; i++){
      System.out.println("Ubicacion de la nave "+ i );
      posicion = asking(i);
      int x = posicion[0];
      int y = posicion[1];
      int z = posicion[2];

      switch(i){
        case 0:
          flota[i] = new Nave(2);

          //Malla[x][y] = 1;
          Malla_player.setNaveMatrix(x,y,i);
          if (z==0){
            flota[i].setAngle(0);
            //Malla[x+1][y] = 1;
            Malla_player.setNaveMatrix(x+1,y,i);
          }else{
            flota[i].setAngle(1);
            //Malla[x][y+1] = 1;
            Malla_player.setNaveMatrix(x,y+1,i);
          }

        break;
        case 1:
          flota[i] = new Nave(3);
          //Malla[x][y] = 1;
          Malla_player.setNaveMatrix(x,y,i);
          if (z==0){
            flota[i].setAngle(0);
            //Malla[x+1][y] = 1;
            Malla_player.setNaveMatrix(x+1,y,i);
            //Malla[x+2][y] = 1;
            Malla_player.setNaveMatrix(x+2,y,i);
          }else{
            flota[i].setAngle(1);
            //Malla[x][y+1] = 1;
            Malla_player.setNaveMatrix(x,y+1,i);
            //Malla[x][y+2] = 1;
            Malla_player.setNaveMatrix(x,y+2,i);
          }

        break;
        case  2:
          flota[i] = new Nave(3);
          //Malla[x][y] = 1;
          Malla_player.setNaveMatrix(x,y,i);
          if (z==0){
            flota[i].setAngle(0);
            //Malla[x+1][y] = 1;
            Malla_player.setNaveMatrix(x+1,y,i);
            //Malla[x+2][y] = 1;
            Malla_player.setNaveMatrix(x+2,y,i);
          }else{
            flota[i].setAngle(1);
            //Malla[x][y+1] = 1;
            Malla_player.setNaveMatrix(x,y+1,i);
            //Malla[x][y+2] = 1;
            Malla_player.setNaveMatrix(x,y+2,i);
          }

        break;

        case 3:

          flota[i] = new Nave(4);
          //Malla[x][y] = 1;
          Malla_player.setNaveMatrix(x,y,i);
          if (z==0){
            flota[i].setAngle(0);
            //Malla[x+1][y] = 1;
            Malla_player.setNaveMatrix(x+1,y,i);
            //Malla[x+2][y] = 1;
            Malla_player.setNaveMatrix(x+2,y,i);
            //Malla[x+3][y] = 1;
            Malla_player.setNaveMatrix(x+3,y,i);
          }else{
            flota[i].setAngle(1);
            //Malla[x][y+1] = 1;
            Malla_player.setNaveMatrix(x,y+1,i);
            //Malla[x][y+2] = 1;
            Malla_player.setNaveMatrix(x,y+2,i);
            //Malla[x][y+3] = 1;
            Malla_player.setNaveMatrix(x,y+3,i);
          }

        break;
        case 4:
        flota[i] = new Nave(5);
        //Malla[x][y] = 1;
        Malla_player.setNaveMatrix(x,y,i);
        if (z==0){
          flota[i].setAngle(0);
          //Malla[x+1][y] = 1;
          Malla_player.setNaveMatrix(x+1,y,i);
          //Malla[x+2][y] = 1;
          Malla_player.setNaveMatrix(x+2,y,i);
          //Malla[x+3][y] = 1;
          Malla_player.setNaveMatrix(x+3,y,i);
          //Malla[x+4][y] = 1;
          Malla_player.setNaveMatrix(x+4,y,i);
        }else{
          flota[i].setAngle(1);
          //Malla[x][y+1] = 1;
          Malla_player.setNaveMatrix(x,y+1,i);
          //Malla[x][y+2] = 1;
          Malla_player.setNaveMatrix(x,y+2,i);
          //Malla[x][y+3] = 1;
          Malla_player.setNaveMatrix(x,y+3,i);
          //Malla[x][y+4] = 1;
          Malla_player.setNaveMatrix(x,y+4,i);
        }

        break;

      }

      Malla_player.PaintMalla();
    }

  }


  //Jugador PC

}
