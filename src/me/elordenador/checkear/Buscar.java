package me.elordenador.checkear;

public class Buscar {
    public static int busquedaSecuencial(int[] array, int n) {
        int izq = 0;
        int der = array.length - 1;
        int medio;
        int pos = 0;
        boolean salida = false;
        boolean encontrado = false;

        while (!salida) {
            medio = (der - izq) / 2 + izq;
            if (n < array[medio]) {
                // El numero n es menor, probablemente este a la derecha
                der = medio;
            } else if (n > array[medio]) {
                // El numero n es mayor, probablemente este a la izquierda
                izq = medio;
            } else {
                pos = medio;
                salida = true;
                encontrado = true;

            }
            if ((der-izq) == 1) {
                salida = true;
                if (array[izq] == n) {
                    encontrado = true;
                    pos = izq;
                }
                if (array[der] == n) {
                    encontrado = true;
                    pos = der;
                }
            }

        }
        if (encontrado) {
            return pos;
        } else {
            return -1;
        }
    }
}
