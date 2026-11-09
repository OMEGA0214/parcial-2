package Ejercicio2;

import Estructuras.Nodo;
import Estructuras.Pila;

public class Ejercicio2 {

    public Pila obtenerSegmento (Pila pila, int ini, int fin){
        Pila segmento = new Pila();
        Pila temp = new Pila();
        int pos =1;
        if(ini<1 ||  ini>fin){
            return new Pila();
        }
        while(!pila.isEmpty()){
            Object aux = pila.pop();

            if(pos >= ini && pos <= fin){
                segmento.push(aux);
            }

            temp.push(aux);
            pos++;
            }
        if(pos -1 < fin){
            while(!temp.isEmpty()){
                pila.push(temp.pop());}
            return new Pila();
        }
        while(!temp.isEmpty()){
            pila.push(temp.pop());}

        while(!segmento.isEmpty()){
            temp.push(segmento.pop());
        }
        return temp;
    }
}
