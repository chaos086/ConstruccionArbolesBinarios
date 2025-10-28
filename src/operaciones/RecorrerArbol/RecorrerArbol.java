package operaciones.RecorrerArbol;

import modelo.*;
import operaciones.*;

public class RecorrerArbol {

    public void inOrden(Nodo raiz) {
        if (raiz != null) {
            inOrden(raiz.izquierdo);
            System.out.print(raiz.dato + " ");
            inOrden(raiz.derecho);
        }
    }

    public void preOrden(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.dato + " ");
            preOrden(raiz.izquierdo);
            preOrden(raiz.derecho);
        }
    }

    public void postOrden(Nodo raiz) {
        if (raiz != null) {
            postOrden(raiz.izquierdo);
            postOrden(raiz.derecho);
            System.out.print(raiz.dato + " ");
        }
    }
}
