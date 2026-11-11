package Estructuras;


public class ArbolBin<T extends Comparable<T>>{
    private NodoArbol<T> raiz;

    public ArbolBin() {
        this.raiz = null;
    }

    public NodoArbol<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol<T> raiz) {
        this.raiz = raiz;
    }

    public void insertar(T dato) {
        if(raiz == null){
            raiz = new NodoArbol<T>(dato);
        } else if(dato.compareTo(raiz.getDato()) < 0){
            if(raiz.getIzquierdo() == null){
                raiz.setIzquierdo(new NodoArbol<T>(dato));
            } else {
                insertarRecursivo(raiz.getIzquierdo(), dato);
            }
        } else {
            if(raiz.getDerecho() == null){
                raiz.setDerecho(new NodoArbol<T>(dato));
            } else {
                insertarRecursivo(raiz.getDerecho(), dato);
            }
        }
    }

    private void insertarRecursivo(NodoArbol<T> nodo, T dato) {
        if(dato.compareTo(nodo.getDato()) < 0){
            if(nodo.getIzquierdo() == null){
                nodo.setIzquierdo(new NodoArbol<T>(dato));
            } else {
                insertarRecursivo(nodo.getIzquierdo(), dato);
            }
        } else {
            if(nodo.getDerecho() == null){
                nodo.setDerecho(new NodoArbol<T>(dato));
            } else {
                insertarRecursivo(nodo.getDerecho(), dato);
            }
        }
    }

    public void eliminar(T dato) {
     raiz = eliminarRecursivo(raiz, dato);
    }
    public NodoArbol<T> eliminarRecursivo(NodoArbol<T> nodo, T dato) {
        if(nodo == null){
            return null;
        }
        if(dato.compareTo(nodo.getDato()) < 0){
            nodo.setIzquierdo(eliminarRecursivo(nodo.getIzquierdo(), dato));
        } else if(dato.compareTo(nodo.getDato()) > 0){
            nodo.setDerecho(eliminarRecursivo(nodo.getDerecho(), dato));
        } else {
            if(nodo.getIzquierdo() == null && nodo.getDerecho() == null){
                return null;
            } else if(nodo.getIzquierdo() == null){
                return nodo.getDerecho();
            } else if(nodo.getDerecho() == null){
                return nodo.getIzquierdo();
            } else {
                NodoArbol<T> sucesor = encontrarSucesor(nodo.getIzquierdo());
                nodo.setDato(sucesor.getDato());
                nodo.setIzquierdo(eliminarRecursivo(nodo.getIzquierdo(), sucesor.getDato()));
            }
        }
        return nodo;
    }
    public NodoArbol<T> encontrarSucesor(NodoArbol<T> nodo) {
        if(nodo.getDerecho() == null){
            return nodo;
        } else {
            return encontrarSucesor(nodo.getDerecho());
        }
    }

    public void inOrden() {
        inOrdenRec(raiz);
        System.out.println();
    }
    private void inOrdenRec(NodoArbol<T> nodo) {
        if (nodo != null) {
            inOrdenRec(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + " ");
            inOrdenRec(nodo.getDerecho());
        }
    }
}
