package Estructuras;

public class Pila<T> {
    private Nodo<T> cima;

    public Pila() {
        this.cima = null;
    }

    public void push(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        nuevoNodo.setSiguiente(cima);
        cima = nuevoNodo;
    }

    public T pop() {
        if (cima == null) {
            throw new IllegalStateException("La pila está vacía");
        }
        T valor = cima.getValor();
        cima = cima.getSiguiente();
        return valor;
    }

    public T peek() {
        if (cima == null) {
            throw new IllegalStateException("La pila está vacía");
        }
        return cima.getValor();
    }

    public boolean isEmpty() {
        return cima == null;
    }
}
