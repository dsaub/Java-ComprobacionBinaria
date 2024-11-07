package me.elordenador.checkear;

import me.elordenador.BarUtils;
import me.elordenador.ordenador.Ordenador;


import java.io.IOException;
import java.util.Scanner;

public class Checkear {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga la cantidad de numeros a introducir: ");
        System.out.print("> ");

        int cantidad = sc.nextInt(); sc.nextLine();
        int[] array = new int[cantidad];
        BarUtils barUtils = new BarUtils(cantidad);
        barUtils.enable();
        System.out.println("Generando numeros aleatorios: ");
        for (int i = 0; i < cantidad; i++) {
            array[i] = (int)Math.floor(Math.random() * cantidad*10);
            barUtils.update(i);
        }
        barUtils.finish();


        Ordenador ordenador = new Ordenador(array);
        ordenador.enableProgressBar();
        System.out.println("Ordenando...");
        array = ordenador.run();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("N: ");
        int n = sc.nextInt(); sc.nextLine();


        int izq = 0;
        int der = array.length - 1;
        int medio;
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
                salida = true;
                encontrado = true;

            }
            if ((der-izq) == 1) {
                salida = true;
                if (izq == n || der == n) {
                    encontrado = true;
                }
            }

        }



        if (encontrado) {
            System.out.println("He encontrado el numero");
        } else {
            System.out.println("No encontrado el numero");
        }
    }
}
