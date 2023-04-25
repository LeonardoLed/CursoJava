public final class TwelveDays{

  final String Uno = "Un perdiz en un peral";
  final String Dos = "Dos tortolas";
  final String Tres = "Tres gallinas";
  final String Cuatro = "Cuatro pajaritos";
  final String Cinco = "Cinco anillos dorados";
  final String Seis = "Sies mamá gansas";
  final String Siete = "Siete cisnes";
  final String Ocho = "Ocho lecheritas";
  final String Nueve = "Nueve bailarinas";
  final String Diez = "Diez señores saltando";
  final String Once = "Once gaiteros";
  final String Doce = "Doce tamborileros";
  static final String Intro = ", mi amor me mando: ";

  public TwelveDays(){}

  public static void Intro(int dia){
    System.out.println("el " + dia + " dia " + Intro);
  }


  public void Day(char aleatorio){

    switch (aleatorio){
      case '1':
        System.out.print(Uno);
      break;
      case '2':
        System.out.print(Dos);
      break;
      case '3':
        System.out.print(Tres);
      break;
      case '4':
        System.out.print(Cuatro);
      break;
      case '5':
        System.out.print(Cinco);
      break;
      case '6':
        System.out.print(Seis);
      break;
      case '7':
        System.out.print(Siete);
      break;
      case '8':
        System.out.print(Ocho);
      break;
      case '9':
        System.out.print(Nueve);
      break;
      case 'a':
        System.out.print(Diez);
      break;
      case 'b':
        System.out.print(Once);
      break;
      case 'c':
        System.out.print(Doce);
      break;
      default:
      break;
    }

  }





}
