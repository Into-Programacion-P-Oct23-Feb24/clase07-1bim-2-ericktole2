/*
1
2
3
4
5
6
7
8
9
10
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        int contador = 1;
        int total = 0;
        do {
           /* System.out.printf("%d\n", contador);
            */contador = contador + 1;
            total = total + contador;
        } while (contador <= 10);

        System.out.printf("total: %d\n", total);
    }

}
               