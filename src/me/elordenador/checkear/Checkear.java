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


        int pos = Buscar.busquedaSecuencial(array, n);

        if (pos < 0) {
            System.out.println("No se puede encontrar el numero");
        } else {
            System.out.println("El numero ha sido encontrado, esta en la posición: " + pos);
        }
    }


}
