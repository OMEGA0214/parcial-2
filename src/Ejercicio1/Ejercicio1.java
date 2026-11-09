package Ejercicio1;
import  Estructuras.Pila;

public class Ejercicio1 {
    public Pila ObtenerUltimasConfirmadas(Pila operaciones, int n) {
        if(n <= 0) {
            return new Pila<>();
        }
        Pila confirmadas = new Pila();
        Pila temp = new Pila();
        int inssertadas = 0;
        while (!operaciones.isEmpty()) {
            Operacion operacion = (Operacion) operaciones.pop();
            if(inssertadas >= n) {
                break;
            }
            if (operacion.getEstado()) {
                confirmadas.push(operacion);
                temp.push(operacion);
                inssertadas++;
            }
            temp.push(operacion);
        }

        while (!temp.isEmpty()) {
            operaciones.push(temp.pop());
        }
        Pila aux = new Pila();
        while (!confirmadas.isEmpty()) {
            aux.push(confirmadas.pop());
        }
        return aux;
    }
}
