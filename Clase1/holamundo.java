
public class holamundo{


public static void main(String[] args) {

  System.out.println("hola mundo");

  int a = 2 ;
  int b = 3 ; //asignacion explicita
  int c = 15;
  float suma = a-c;
  double res = b % 2;
  System.out.println(-suma); // suma = suma * (-1)
  int e = a++; //operador unario de incremento, e = 3
  int f = a--; // f = 1 asignacion explicita y implicita
  a++; // a = a + 1 asignacion implicita
  a--;

  // operadores de igualdad ==, !=
  boolean x = a == b; // 2 == 3 -> false
  boolean y = a != b;

  //operadores de relacion  <, > , >=, <=,
  //operadores logicos &&, ||, ^
  //operadores bit a bit &, |, ^, >>, <<
  //operador ternario ?:

  // a = 2, b = 3, c = 15
  // true and true or false -> true
  if (a > 10 && b < 10 || c > 100 ){
    System.out.println("se cumple");
  }else{
    System.out.println("no se cumple");
  }


  if (!(a>=b) && (c<b) && !(b==9)){
      System.out.println("se cumple");
  }

  int x = 10;


}

}
