import java.util.Random;

public class Canicas{

  public static void draw(int canicas){
    while (canicas >0){
      System.out.print("@");
      canicas--;
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    System.out.println("Bievenido al juego del Calamar > Juego de Canicas ");
    System.out.println("###%###//%%%%%&&&&%%%%%####/%%%##*&&&%*&&&&%#%%%&&%%(%/%%/&&&/(%*/########%%###((%(#%&((#//////%&/&%%%&%&&&&&#%%&&&&&&%,*####%%/(#############%%&@@@@@");
    System.out.println("%%%%#%#####,,/*#&&&%%%%%&%%##&&&%#/&&%%&&&&%%&&%&&%%&&#%%/%#%/***#%%%//////////////////(((/////&&(&&%%@%&&@&%%%%%&&&&%/#%%%%%%*#%%%%%%##%((*#,#(#%%&&%");
    System.out.println("(%%#%%%%%%###,,,/&&&&%&&&%%##%&&&%%&%&%#&&@&%%@&%@&(&&(%%*&(&**/#%#((//#&&@@@@&&%(((((((((((///%#(&&%%%%&@&%%%&%%&&%%#%%&%&%%(%%%&%%%%%%%%%#%%%%%%%%%&");
    System.out.println("**%&%%%%%&%%&#*,*,&%&&%&&&&%%#&&&&%#&&%%&&&&##&&%%#%&&/&&*//%*/####%&@@&&&%(*%&&&@@@&#(((((((/////&&%%#(%&%%%%%&@&&&#%&%@&&%#&%&&&&&&&%%%**######%%%%#");
    System.out.println("%,*&&%&%%%&%&&%,#(,/&%&&&&&%%%&&&&&%&@&%&%/&%/%&/%/%%&/&&*/*/*/#&&@&&%%%%/*,,,*%%%##%&@@%(((((/////#%&%(%&%&&&&&&&&%&&&&&&&%%&%&@&&&&&,#%%%%%%%%%%*#*%");
    System.out.println("&#,*&%%&&&&&&&%%#%&&&&%%&&&%%%%%@&&%%&%#%%/&&/&%/%*/&&*/*,*///%&@&&%%%%#,,*%&*,,(%%###%&@%(((((/////%&%/%%%&#&&&&&%%%&&&&&%%&&&@&&&&&/%%%%%%%%%%%%#%/%");
    System.out.println("&%(,(&&%&&%&&@%%#%@@@@@&@@@&%%#%%@&&%(&&%%*&%(&%#%////*,*////%&&&&&&%%***%%%&%#,**%%#%%%&@%(#((///*,##%(%&%%%&&##&%%&&@&&&%&&&&@&&&%(%%%&&&&&&&&%%%&&#");
    System.out.println("&%%&%%&&%&&%&@&%%#%&&&%&&&%&&&%%(&&%%*&&&%/&%(%%(%//////////#@&&&&&&%**(&&&&&&&&*,*#%%%%&&@%###(/////*&#%%%%%%&(#&&&&@&%%%%&&&&&&&%/%%&&&&&&&&&&%&%&/*");
    System.out.println("&&%&%#%&&%&&%&&&&%##&&&&&&%&&#(%*&&&%*&&&%/&&(%#(///////////&@&&&&&(**&&&&&&&&&&&(**/&%&&&&&####(//////%&%%%%%&/%&&#&&&&&&&&&&@&&&&%&&&&&&&&&&&&&&&(*%");
    System.out.println("@&%&%##&&&%&&%@&&&%%&&&&&&#(&%%(/&&%%/&&&&(&&////////////**/&@&&&&///&&&&&&&&&&&&&&***&&&&&@%#%##//////&&(%%%&&*&%&%&%/&&&&##&&&&&%&&&&&&&&&&&&&&%%*%&");
    System.out.println("&@%&&%%%&&&%%&%&&(%%&&&&%&/#&&&/(&&&%**&&&(/***//////***//*/&&&&&///&&&&&&&&&&&&&&&&***&&&&&%#%###/////%&#%&%%&*&&%&&/%&&&&#%&&&&%&&&&@&&&@&&&&&&&%%&&");
    System.out.println("@@&&%%%%&&&&%%%%%%(%@&&&&%*#&%&*#&&&%,/%&%*////////////*//**&@&&%(////////////////**///(&&&&%#%%#%/////**%%%#/**%&&%%/&&&&&#&&&/%%&&@&@&&@&&&&&&%&%&&&");
    System.out.println("&%@&&%%%&&&&&%%%(%&@&&&&&%*%&&%*%/&&%*//**,,,**//***********/&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&@%%%##%//(//**(%%////&%%%%/&&&&&&#%(/%%&&@@&@@&&&&&&%&&&&&&");
    System.out.println("&%@&&%%&&&&&%%*(*%&&&&&&%%*%&&&*((&%(%///////////////*******/%&@&&@@@@@@@@@@@@@@@@@@@@&&&&@&%%%%%%//////(/**///#&&&%*(&&&&&%%&/%%%&&&@@@&&&&&&%&&&&&&%");
    System.out.println("%&#@%#&&&&&&%%*(/%&&&&&&&%/(&&&////&&/*,////////////////****%%&@&&&&@@@@@@@@@@@@@@@&&&&&&&@%%%%%%%/////////////%&&&%/%&&&&&/%(/%&&&&@@&&&&&&&&&&&&&@%%");
    System.out.println("&&*@&#&&&&&&%&*(#%&&&&&&&%*/%&&(%%#((////////////////**/***/#%%&@&&&&@@@@@&@@@@@@@&&@&&&&@&&%%%#%#/////////////&&&&//%&&&%&/(*%&#&&&@@&&@&&&&&&&&%&@%*");
    System.out.println("&%*%%&&&&&&&%&/(#%&&((&&&%#(((&##(,**/(//////////////////////%%%%@@&&@@@@@&@@@@@@@@@&&&&@&&&%%%%%(((/(///////**(##(//%&&&%/*(/&&&%&&&(&&&&&&%&&&&&&%/&");
    System.out.println("&%*%&&&&@&&&&%//#&&&%(&&&&/(((/**/(/////(/////////////////////%%%&@@&@@@@@@@@&@@@@@@@@&@&&&%%%%%#((///////////(//*(((&&&&///(&&&&&&&(%%&&&&&&&&&&&&%%@");
    System.out.println("&&*#&&&&&@&&&%#*%&@(/((&&&(****//(//((///////////////////(#%%&&%%%&@&&&@@@@@@@@@@@@@&&@&&&&%%%%&%%%%%(#(((((//(/((/(/&&&&(//%&&&&&%//&&&&&&@&#%&@&@&&@");
    System.out.println("&%*%%&&&&@%&&&%*#//###(////(((////(////////////////(########%&&&&&&&@&&&&@@@@@@@@&&%%&&&&&&&&&&&&&&&&&####(((((((//(&&&(((/(&&&&&%((/&&&&&&&&%@@&@@&&@");
    System.out.println("&%*%%&/&&%(&&&%*%***/((((((///((((/////////////(#########%#%%&&&%%%&&@&&&&&&&&@&&&&&@&&&&&&%&&&&#&&&&&&###(((((((##(///(#((&&&&&%((/(%&&&&&&&//(&@@&&(");
    System.out.println("%%*&%#(((##%&&#*%((((//////((///(((//(///////##############%&&&&%%%%%&&&&&&&@@@&&&&&&&%%####&&&&##&&&&&&####(((((((((((((/&&&&&#/((/&%&&&&&&(((((&&@&%");
    System.out.println("%%/&&%(((((#&&&(/(///((//////////(////////(######%%%%%%%%%&&&&&&%%%%%%%&%%%&&@&%%&%%%%%###%&&&&%##&&&&&&&######(#((((((/(&&&&&(((((/%&&&&&&%(((((#&&%%");
    System.out.println("&%#//######((%&#/****//((///////////////(#####%%%&&&&&%%%%%%@&@@%%%%%%%%%%%&&&%%%%%%%%##%%%&&&&###&&&&&&&%%%%#######**/#%&@#(((((((%&&&&&&%(((((((&&&(");
    System.out.println("&&%/(((((((((//////////////////////////#%%%%%&&&&&&%%%%%%%%%@&@@%%%%%%%%%%%&&&%%%%%%%%%%##@&&&&####&&&&&&%%%%%%##%%####(((((###(((/%&&&&&%((((((((&&&/");
    System.out.println("&&%/((((((((//////////////////////////%%%%%%&&&&&%%%%%%%%%%%&@@@%%%%%%%%%%%&&&%%%%%%%%#%%%&&&&#%%##&&&&&&%%%%%%%%%%%%%(((((((#####%&&&&&&#((((((((&&&/");
    System.out.println("&&&/#((((((((((((((((((((////////////(%%%%%%&&&%%%%%%%%%%%%%&@@@&%%%%%%%%%%&&&%%%%%%%%%%#&&&&&#%###%&&&&&&%%%%%%%#%%%%((((((((((((&&&&&&&((((((((#&&&/");
    System.out.println("&&%/((//*/(((((((((((((//((((////((//%%&%&&%&&%%&&&%%%%%%%%%&@@@&%%%%%%%%%%&&&%%%%%%%%%%&@@@&%#%%###&&&&&&%%%%%%%##%%%%((((((((((/&&&&&&#(((((((((&&&(");
    System.out.println("&&%(//*//((((((((((((((((((((((/////#%&%%&&&&&%&&%%%%%%%%%%%%@@@@%%%%%%%%%%&&&%%%%%%%%%%@@@@&%%%%%##&&&&&&%%%%&&%%%%%%%%((((((*///%&&@&%###(((((((#&&(");
    System.out.println("////(((((((((((((((((((((((((((/((((%%%&&&&&&%&&&&&&%%%%%%%%%&@@@&%%%%%%%%%&&&%%%%%%%%%&@@@@%%%%%##%%&&&&&&##%%&&%%%&%%%##((##(((/#%&&#############%#(");
    System.out.println("(((((((((((((((((((((((((((/(((((((%%%%&&&&&&&&&&&&%&%%%%%%%%&@@@@%%%%%%%%%&@@%%%%%%%%&@@@@&%%%%%%%%%@&&&&&&%&&&&%%%%%%%#((((#####(((((###%%######%(((");
    System.out.println("(((((((((((((((((((((((((((((((((#%%%%%%&&&&&@&&&&%&&%%%%%%%%%@@@@&%%%%%%%%@@@%&%&&%%&@@@@@%%%%%%%%%%&&&&&&&%%%&&&&%%%%%%(##(((#(((####((#((((((((((((");
    System.out.println("(((((((((((((((((((((((((((((((((&%%&&&%&&&&&&&&&&&&&&&&&&%%%%&@@@@%%%&&&%%@@@&&%&&&%@@@@@&%%%%&%%&&&&&&&&&&&&&@&&&&&&&%%###(((((((##(((((((((##((((((");
    System.out.println("((((((((((((((((((((((((((((((((%%&&&&&&&&&&&&&&&&&&&&&&&&&&&%&@@@@&&&&&&%&@@@&&&&&&&@@@@@%%&%%%&&&&&&@&&&&&@@@&&&&&&&&&%%##((####(###############(((#");
    System.out.println("(((((((((((((((((((((((((((((((#%%%&&&&&&&&&@&&@&&&&&&&&&&&&&&&&@@@@&&&&&&&@@@&&&&&&@@@@@&%%%%%%%%%%&&@@@@@@@&&&&&&&&&&&&%###################(//(##((%");

    Random aleatorio = new Random();
    int jugadorA = 10;
    int jugadorB = 10;
    boolean par = true;
    int contador = 0;
    int rangoA = 0;
    int rangoB = 0;

    int volado = aleatorio.nextInt(2);
    char turno = 'A';

    if (volado == 0){
      System.out.println("Inicia jugador A");
    }else{
      System.out.println("Inicia jugador B");
      turno = 'B';
    }

    while (jugadorA>0 && jugadorB>0){


        contador++;
        if(jugadorA == 1){ rangoA = 1;}else{
          rangoA = (int)jugadorA/2;
          rangoA++;
        }

        if(jugadorB == 1){rangoB = 1;}else{
          rangoB = (int)jugadorB/2;
          rangoB++;
        }

        int suerteA = aleatorio.nextInt(rangoA)+1;
        int suerteB = aleatorio.nextInt(rangoB)+1;

        int prediccion = aleatorio.nextInt(1000);
        System.out.println("Esta adivinando el jugador "+  turno+ "......");

        if (prediccion % 2 == 0){par = true;
          System.out.println("el jugador "+ turno +" ha dicho que otro jugador tiene un juego par");
        }else{par = false;
          System.out.println("el jugador "+ turno +" ha dicho que otro jugador tiene un juego impar");
        }

        if (volado == 0){
          System.out.println("el numero del Jugador rival es: " + suerteB);
          System.out.println("el numero del Jugador actual es: "+ suerteA);
          boolean parRival = suerteB % 2 == 0;

          if (parRival == par){
            System.out.println("el jugador " + turno + " se lleva " + suerteB + " Canicas");
            jugadorA += suerteB;
            jugadorB -= suerteB;
            //System.out.println("el jugador B se queda con: " + jugadorB + " Canicas");
          }else{
            System.out.println("el jugador B se lleva " + suerteA + " Canicas");
            jugadorB += suerteA;
            jugadorA -= suerteA;
            //System.out.println("el jugador A se queda con: " + jugadorA + " Canicas");
          }

          turno = 'B';
          volado = 1;

        }else{

          System.out.println("el numero del Jugador rival es: " + suerteA);
          System.out.println("el numero del Jugador actual es: "+ suerteB);
          boolean parRival = suerteA % 2 == 0;

          if (parRival == par){
            System.out.println("el jugador " + turno + " se lleva " + suerteA + " Canicas");
            jugadorB += suerteA;
            jugadorA -= suerteA;
            //System.out.println("el jugador A se queda con: " + jugadorA + " Canicas");

          }else{
            System.out.println("el jugador A se lleva " + suerteB);
            jugadorA += suerteB;
            jugadorB -= suerteB;
            //System.out.println("el jugador B se queda con: " + jugadorB + " Canicas");

          }

          turno = 'A';
          volado = 0;
        }

        try {
          Thread.sleep(2 * 1000);
        } catch (InterruptedException ie) {
          Thread.currentThread().interrupt();
        }


        System.out.println("Estado del Juego>");
        System.out.println("Jugador A:");
        draw(jugadorA);
        System.out.println("Jugador B:");
        draw(jugadorB);

        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------");





    }

    if (jugadorA== 20){
      System.out.println("Fin del Juego !! el jugador B muere!!");
    }else{
      System.out.println("Fin del Juego !! el jugador A muere!!");
    }

    System.out.println("numero de intentos: " +  contador);


  }

}
