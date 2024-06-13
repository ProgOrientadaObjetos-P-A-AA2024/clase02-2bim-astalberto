/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial,
        // con datos por teclado
        ArrayList<EstudiantePresencial> a = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String aux;
        boolean bandera = true;
        while (bandera) {

            System.out.println("Ingrese nombre");
            String n = entrada.nextLine();
            System.out.println("Ingrese apellido");
            String ap = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String ced = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de créditos");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese costo de créditos");
            double costo = entrada.nextDouble();

            EstudiantePresencial presencial = new EstudiantePresencial(n, ap, ced,
                    edad, creditos, costo);
            presencial.calcularMatriculaPresencial();
            a.add(presencial);
            entrada.nextLine();
            System.out.println("Desea salir? [si]");
            aux = entrada.nextLine().toLowerCase();
            if (aux.equals("si")) {
                bandera = false;
            }

        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

    }
}
