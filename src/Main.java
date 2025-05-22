import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        sacaremos el promedio de 5 notas

         double nota= 0, acumulado = 0, cantidadNotas = 0;
        System.out.println("ingrese la cantidad de notas a promediar: ");
        cantidadNotas = sc.nextDouble();
//        System.out.println("promedio de notas logica de programación: ");

//        ciclo for
//        for (int i = 1; i <=cantidadNotas; i++){
//            System.out.print("ingrese la nota: " + i + ": ");
//            nota = sc.nextDouble();
//            acumulado=acumulado+nota; esto es lo mismo que el codigo de abajo.
//            acumulado+=nota;
//        }

//        ciclo while cuando se y no se la cantidad de veces a repetir

//    En el ciclo while defino la estrucutura o inicializacion por fuera o antes de los parentesis. asi como esta abajo,
//    o sea el int i = 1 esta antes del ciclo
//
//        int i = 1;
//        while ( i <= cantidadNotas){
//            System.out.println("ingrese la nota: "  + i + ": ");
//            nota = sc.nextDouble();
//            acumulado += nota;
//            i++;

//            Ciclo controlado por un centinela, bandera o interruptor ( cuando no se sabe la cantidad de veces a repetir)
//         un centinela o interruptor es cuando tengo la capacidad de decidir cuando detener el ciclo

//            int centinela = 1;
//            int opcion = 0;
//            int i = 1;
//
//            while(centinela == 1){
//                System.out.println("ingrese la nota: " + i + ": ");
//                nota= sc.nextByte();
//                acumulado +=nota;
//                i++;
//                System.out.println("Desea registrar otra nota?\n1 - Si\n0 - No");
//                opcion= sc.nextInt();
//                if (opcion == 0){
//                    centinela = 0;
//                }
//
//
//            }
//        System.out.println(i);
//        System.out.println("el promedio del estudiante es: " + (acumulado/(i-1)));


//        ciclo do while primero ejecuta el codigo y luego pregunta si se cumple la condicion.
//        asegurando por lo menos una vez la ejecucion del codigo

        int i = 10;
        do{
            System.out.println("ingrese la nota: " + i + ": ");
            nota= sc.nextDouble();
            acumulado += nota;
            i++;

        } while (i<=5);
            System.out.println("el promedio del estudiante es: " + (acumulado/cantidadNotas));



        }
    }
