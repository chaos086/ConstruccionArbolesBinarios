package operaciones.AgregarDato;

import modelo.*;
import operaciones.*;

public class AgregarDato {
    public void ejecutar(ArbolBinario arbol, int dato) {
        arbol.raiz = insertar(arbol.raiz, dato);
    }

    private Nodo insertar(Nodo raiz, int dato) {
        if (raiz == null) {
            return new Nodo(dato);
        }
        if (dato < raiz.dato) {
            raiz.izquierdo = insertar(raiz.izquierdo, dato);
        } else if (dato > raiz.dato) {
            raiz.derecho = insertar(raiz.derecho, dato);
        }
        return raiz;
    }
}