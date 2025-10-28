import modelo.*;
import operaciones.AgregarDato.AgregarDato;
import operaciones.EstaVacio.EstaVacio;
import operaciones.RecorrerArbol.RecorrerArbol;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        EstaVacio vacio = new EstaVacio();

        System.out.println("¿Árbol vacío? " + vacio.ejecutar(arbol));

        AgregarDato agregar = new AgregarDato();
        agregar.ejecutar(arbol, 10);
        agregar.ejecutar(arbol, 5);
        agregar.ejecutar(arbol, 20);

        System.out.println("¿Árbol vacío? " + vacio.ejecutar(arbol));

        RecorrerArbol recorrido = new RecorrerArbol();
        System.out.print("Recorrido inorden: ");
        recorrido.inOrden(arbol.raiz);
    }
}