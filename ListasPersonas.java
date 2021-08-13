package geters;

import geters.Personas;

public class ListasPersonas {

    public double promedioEdad(Personas[] p) {

        double sumEdad = 0;
        for (Personas r : p) {
            double promedioEdad = 0;
            sumEdad = sumEdad + r.getEdad();
        }
        for (int i = 0; i < p.length; i++) {

            if (p[i + 1].getEdad() > promedioEdad(p)) {

            }
        }
        double resultado = sumEdad / p.length;
        return promedioEdad(p);

    }

    public int personaEdaMax(Personas[] p) {
        double edad;
        int indice = 0;

        edad = p[0].getEdad();
        for (int i = 1; i < p.length; i++) {

            if (p[i].getEdad() > edad) {

                edad = p[i].getEdad();
                indice = 1;

            }

        }
        return indice;

    }
}
