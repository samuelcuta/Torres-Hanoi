/*
Nombres: Ana Maria Casallas Ariza
Samuel Cuta Barrera
Gina Esperanza Alvarado Acosta
*/

package estructuras;

public class ResolverHanoi {

    public static void resolverHanoi(int n, char origen, char destino, char auxiliar) {

        if (n == 1) {
            // Caso base: mover el disco del origen al destino
            System.out.println("Mover disco 1 desde " + origen + " hasta " + destino);
            return;
        }

        // Mover n-1 discos del origen al auxiliar, utilizando el destino como auxiliar
        resolverHanoi(n - 1, origen, auxiliar, destino);

        // Mover el disco restante del origen al destino
        System.out.println("Mover disco " + n + " desde " + origen + " hasta " + destino);

        // Mover los n-1 discos del auxiliar al destino, utilizando el origen como auxiliar
        resolverHanoi(n - 1, auxiliar, destino, origen);
    }
}
