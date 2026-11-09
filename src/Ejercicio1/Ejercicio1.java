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
            if(inssertadas >= n) {
                break;}
            Operacion operacion = (Operacion) operaciones.pop();

            if (operacion.getEstado()) {
                confirmadas.push(operacion);
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
