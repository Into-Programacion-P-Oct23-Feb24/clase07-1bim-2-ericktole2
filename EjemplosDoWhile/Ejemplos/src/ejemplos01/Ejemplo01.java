/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        int contador = 1;
        int total = 0;
        do {
            System.out.printf("%d\n", contador);
            contador = contador + 1;
            total = total + contador; 
        } while (contador <=10 );
        
        System.out.printf("total: %s",total);
    }

}
