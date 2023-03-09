import java.util.Scanner;
public class Series{
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.println("Cuantos elementos de la serie quieres: ");
      int nele = entrada.nextInt();
      int aux = nele;
      // serie de fibonacci
      int a = 1;
      int b = 1;
      int serie;

      System.out.println("la serie de fibonnaci es:");
      if (nele == 1){
        System.out.println(a);
      } else if (nele == 2){
        System.out.println(a + " " + b + "\n");
      }else if (nele > 2){

        System.out.print(a + " " + b + " ");
        //ciclo decremental
        while (aux > 2){

          serie = a + b;
          System.out.print(serie+" ");
          a = b;
          b = serie;
          --aux;
        }
      }else{
        System.out.println("no es opcion valida");
      }
      System.out.println();
      aux = 0;

      
      // serie de nele numeros primos
      System.out.println("la serie de n numeros primos es:");

      int r; // para recorrer los antencesores de z
      int z = 2; // iniciamos busqueda de numeros primos desde 2

      while(aux <= nele){ // iniciamos ciclo para encontar nele primos desde aux = 0 hasta nele
        r = z; // iniciamos el valor de r=z
        boolean primo = true; //partimos de la hipotesis apriori de que el numero z es primo

        while (r >= 2){ // recorremos desde r = z hasta que sea =2 para verificar antencesores divisibles
          if ((z%r)==0 && z!= r){ // calculamos z%r si es == 0 es divisible y ademas z es diferente de r (para que no sea el mismo  numero)
            primo = false; // si existe cualquier numero antecesor que sea divisible de z, entonces z ya no es primo
          }

          r--; // dismunimos r
        }

        if (primo){ // si z es primo lo imprimimos
            System.out.print(z+" ");
            aux++; // acumulamos un primo encontrado al valor de aux
        }

        z++;  //incrementamos el valor de z para analizar el sig numero si es primo

      }
      System.out.println();

  }
}
