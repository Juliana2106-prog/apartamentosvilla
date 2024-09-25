package org.example;

import org.example.MODELOS.APARTAMENTO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****************************");
        System.out.println("APARTAMENTOS LA VILLA ALQUILER");
        System.out.println("*******************************");

        System.out.println("\n Bienvenidos ");

        Scanner lea = new Scanner(System.in);
        APARTAMENTO apartamento = new APARTAMENTO();

        System.out.print("Digita la direccion: ");
        apartamento.setDireccion(lea.nextLine());

        System.out.print("Digite el nombre de la unidad: ");
        apartamento.setNombreUnidad(lea.nextLine());

        System.out.print("Digite el tamaño del apartamento: ");
        apartamento.setTamaño(lea.nextFloat());

        System.out.print("Digite el numero de habitaciones: ");
        apartamento.setHabitaciones(lea.nextInt());

        System.out.print("Digite el precio del alquiler: ");
        apartamento.setPrecioAlquiler(lea.nextFloat());

        System.out.print("Digite numero de baños: ");
        apartamento.setBaños(lea.nextInt());


        //IMPRIMIENDO DATOS DEL APARTAMENTO:
        System.out.println(apartamento);




    }
}