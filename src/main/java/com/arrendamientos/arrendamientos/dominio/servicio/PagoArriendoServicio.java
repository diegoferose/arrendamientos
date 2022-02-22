package com.arrendamientos.arrendamientos.dominio.servicio;

import com.arrendamientos.arrendamientos.dominio.excepcion.excepcioValorNoNumerico;
import com.arrendamientos.arrendamientos.dominio.modelo.RegistroPago;
import com.arrendamientos.arrendamientos.dominio.modelo.dto.RespuestaPagoDto;
import com.arrendamientos.arrendamientos.dominio.puerto.RegistroPagoArriendoRepositorio;

public class PagoArriendoServicio {
    RegistroPagoArriendoRepositorio registroPagoArriendoRepositorio;

    public PagoArriendoServicio(RegistroPagoArriendoRepositorio registroPagoArriendoRepositorio) {
        this.registroPagoArriendoRepositorio = registroPagoArriendoRepositorio;
    }

    public RespuestaPagoDto ejecutar(RegistroPago registroPago){
        validarIdentificacionNumerico(registroPago);
        return registroPagoArriendoRepositorio.registrarPago(registroPago);
    }

    private void validarIdentificacionNumerico(RegistroPago registroPago){
        boolean isNumeric =  isNumeric(registroPago.getDocumentoIdentificacionArrendatario());
        if (!isNumeric){
            throw new excepcioValorNoNumerico("el numero de cedula debe ser numerico");
        }
    }
    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }

}
