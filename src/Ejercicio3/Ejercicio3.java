package Ejercicio3;

import Estructuras.Cola;

public class Ejercicio3 {
    public Cola seleccinarSolicitudes(Cola<Solicitud> solicitudes, int minutos) {
        if( minutos <= 0){
            return new Cola();
        }
        Cola<Solicitud> aux = new Cola();
        Cola<Solicitud> seleccionadas = new Cola<Solicitud>();

        while (!solicitudes.isEmpty()) {
            Solicitud solicitud = solicitudes.desencolar();
            if (solicitud.getPrioridad() && solicitud.getDuracion() <= minutos) {
                seleccionadas.encolar(solicitud);
                minutos -= solicitud.getDuracion();
            } else {
                aux.encolar(solicitud);
            }
        }
        if(minutos>0){
            while(!aux.isEmpty()) {
                Solicitud solicitud = aux.desencolar();
                if (solicitud.getDuracion() <= minutos) {
                    seleccionadas.encolar(solicitud);
                    minutos -= solicitud.getDuracion();
                } else {
                    solicitudes.encolar(solicitud);
                }
            }
        }
        if(!aux.isEmpty()){
            while(!aux.isEmpty()){
                solicitudes.encolar(aux.desencolar());
            }
        }

        return seleccionadas;
    }
}
