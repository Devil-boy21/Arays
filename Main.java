package geters;

import geters.Personas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Personas p1=new Personas();
//        p1.setNombre("Yordi");
//        p1.setApellido("Donoso");
//        p1.setEdad(27);

        //Datos de la Persona
        int numPersonas, indicePersonaEdadMayor;
        String nombres, cedula;
        int edad;
        System.out.println("digite la cantidad de personas");
        numPersonas = sc.nextInt();
        Personas[] personas = new Personas[numPersonas];
        for (int i = 0; i < personas.length; i++) {
            sc.nextLine();

            System.out.println("\nDigite los datos de la Persona");
            System.out.print("Ingrese la cedula");
            cedula = sc.nextLine();
            System.out.println("Ingrese el Nombre");
            nombres = sc.nextLine();
            System.out.println("Ingrese la edad");
            edad = sc.nextInt();
            personas[i] = new Personas(nombres, cedula, edad);

        }

        ListasPersonas lp = new ListasPersonas();
        indicePersonaEdadMayor = lp.personaEdaMax(personas);
        System.out.println("\nLa persona de edad mayoes: ");
        System.out.println(personas[indicePersonaEdadMayor].mostarDatos());

//        double resultadoPromedioEdad = lp.promedioEdad(personas);
//        System.out.println("El promedio de las edades es: " + resultadoPromedioEdad);

    }

}
