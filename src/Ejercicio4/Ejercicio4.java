package Ejercicio4;

import Estructuras.ArbolBin;
import Estructuras.Equipo;
import Estructuras.NodoArbol;

public class Ejercicio4 {

    public int contarEquiposRango(ArbolBin<Equipo> arbol, int min, int max) {
        if(arbol.getRaiz() == null) {
            return 0;
        } else if (min >max) {
            return 0;
        }
        return contarRecursivo(arbol.getRaiz(), min, max);
    }
    public int contarRecursivo(NodoArbol<Equipo> equipo, int min, int max) {
        if (equipo == null) {
            return 0;
        }
       if(equipo.getDato().getCodigo() < min) {
            return contarRecursivo(equipo.getDerecho(), min, max);
        } else if (equipo.getDato().getCodigo() > max) {
            return contarRecursivo(equipo.getIzquierdo(), min, max);
        } else {
            return 1 + contarRecursivo(equipo.getIzquierdo(), min, max) + contarRecursivo(equipo.getDerecho(), min, max);
        }

    }
}
