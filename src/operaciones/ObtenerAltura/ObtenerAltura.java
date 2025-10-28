package operaciones.ObtenerAltura;

import modelo.*;

public class ObtenerAltura {

    public int ejecutar(Nodo raiz) {
        if (raiz == null)
            return 0;
        int izquierda = ejecutar(raiz.izquierdo);
        int derecha = ejecutar(raiz.derecho);
        return Math.max(izquierda, derecha) + 1;
    }
}