import Ejercicio1.Ejercicio1;
import Ejercicio1.Operacion;
import Estructuras.Pila;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pila<Operacion> pila = new Pila<Operacion>();
        pila.push(new Operacion("op1", false));
        pila.push(new Operacion("op2", true));
        pila.push(new Operacion("op3", true));
        pila.push(new Operacion("op4", false));
        pila.push(new Operacion("op5", true));
        Ejercicio1 ej1 = new Ejercicio1();

        Pila e1 = ej1.ObtenerUltimasConfirmadas(pila, 2);
        while (!e1.isEmpty()) {
            Operacion op = (Operacion) e1.pop();
            System.out.println(op.getCodigo());
        }
    }
}