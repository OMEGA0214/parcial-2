import Ejercicio1.Ejercicio1;
import Ejercicio1.Operacion;
import Ejercicio2.Ejercicio2;
import Ejercicio3.Ejercicio3;
import Ejercicio3.Solicitud;
import Ejercicio4.Ejercicio4;
import Estructuras.ArbolBin;
import Estructuras.Cola;
import Estructuras.Equipo;
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

        Cola<Solicitud> solicitudes = new Cola<Solicitud>();
        solicitudes.encolar(new Solicitud("S1", false, 10));
        solicitudes.encolar(new Solicitud("S2", true, 30));
        solicitudes.encolar(new Solicitud("S3", true, 15));
        solicitudes.encolar(new Solicitud("S4", false, 5));

//        Ejercicio3 ej3 = new Ejercicio3();
//
//        Cola e3 = ej3.seleccinarSolicitudes(solicitudes, 25);
//
//        while (!e3.isEmpty()) {
//            Solicitud solicitud = (Solicitud) e3.desencolar();
//            System.out.println(solicitud.getCodigo());
//        }
//        while (!solicitudes.isEmpty()) {
//            Solicitud solicitud = (Solicitud) solicitudes.desencolar();
//            System.out.println(solicitud.getCodigo());
//        }

        ArbolBin<Equipo> arbol = new ArbolBin<Equipo>();
        Equipo equipo1 = new Equipo(50);
        Equipo equipo2 = new Equipo(30);
        Equipo equipo3 = new Equipo(70);
        Equipo equipo4 = new Equipo(20);
        Equipo equipo5 = new Equipo(40);
        Equipo equipo6 = new Equipo(60);
        Equipo equipo7 = new Equipo(80);
        Equipo equipo8 = new Equipo(55);
        Equipo equipo9 = new Equipo(65);
        arbol.insertar(equipo1);
        arbol.insertar(equipo2);
        arbol.insertar(equipo3);
        arbol.insertar(equipo4);
        arbol.insertar(equipo5);
        arbol.insertar(equipo6);
        arbol.insertar(equipo7);
        arbol.insertar(equipo8);
        arbol.insertar(equipo9);
        Ejercicio4 ej4 = new Ejercicio4();
        System.out.println(ej4.contarEquiposRango(arbol, 80,70));
        arbol.inOrden();
        arbol.eliminar(equipo1);
        System.out.println(ej4.contarEquiposRango(arbol, 40,70));
        arbol.eliminar(equipo1);
        arbol.inOrden();


    }
}