package com.arrendamientos.arrendamientos.dominio.excepcion;

public class excepcioValorNoNumerico extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public excepcioValorNoNumerico(String message) {
        super(message);
    }
}
