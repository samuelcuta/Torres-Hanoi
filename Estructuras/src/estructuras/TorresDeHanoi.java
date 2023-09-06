/*
Nombres: Ana Maria Casallas Ariza
Samuel Cuta Barrera
Gina Esperanza Alvarado Acosta
*/

package estructuras;

import java.util.Scanner;

public class TorresDeHanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite la cantidad de discos: ");
        int n = sc.nextInt();

        char origen = 'A';
        char destino = 'B';
        char auxiliar = 'C';

        ResolverHanoi.resolverHanoi(n, origen, destino, auxiliar);
    }
}
