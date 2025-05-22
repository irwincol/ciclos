import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        sacaremos el promedio de 5 notas

         double nota= 0, acumulado = 0, cantidadNotas = 0;
        System.out.println("ingrese la cantidad de notas a promediar: ");
        cantidadNotas = sc.nextDouble();
//        System.out.println("promedio de notas logica de programación: ");
//        for (int i = 1; i <=cantidadNotas; i++){
//            System.out.print("ingrese la nota: " + i + ": ");
//            nota = sc.nextDouble();
//            acumulado=acumulado+nota; esto es lo mismo que el codigo de abajo.
//            acumulado+=nota;
//        }
        System.out.println("el promedio del estudiante es: " + (acumulado/cantidadNotas));









    }
}