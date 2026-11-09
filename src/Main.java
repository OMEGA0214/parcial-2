import Ejercicio1.Ejercicio1;
import Ejercicio1.Operacion;
import Ejercicio2.Ejercicio2;
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

//        Pila e1 = ej1.ObtenerUltimasConfirmadas(pila, 2);
//        while (!e1.isEmpty()) {
//            Operacion op = (Operacion) e1.pop();
//            System.out.println(op.getCodigo());
//        }
//        while (!pila.isEmpty()) {
//            Operacion op = (Operacion) pila.pop();
//            System.out.println(op.getCodigo());
//        }
        Pila<String> acciones = new Pila<String>();
        acciones.push("Accion 1");
        acciones.push("Accion 2");
        acciones.push("Accion 3");
        acciones.push("Accion 4");
        acciones.push("Accion 5");
        acciones.push("Accion 6");
        Ejercicio2 ej2 = new Ejercicio2();
//        Pila e2 = ej2.obtenerSegmento(acciones, 2, 4);
//        while (!e2.isEmpty()) {
//            String accion = (String) e2.pop();
//            System.out.println(accion);
//        }
//        while(!acciones.isEmpty()){
//            System.out.println(acciones.pop());
//        }


    }
}