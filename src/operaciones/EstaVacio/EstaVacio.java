package operaciones.EstaVacio;

import modelo.*;

public class EstaVacio {
    public boolean ejecutar(ArbolBinario arbol) {
        return arbol.raiz == null;
    }
}