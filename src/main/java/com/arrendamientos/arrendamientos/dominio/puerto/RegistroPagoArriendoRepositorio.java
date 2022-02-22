package com.arrendamientos.arrendamientos.dominio.puerto;

import com.arrendamientos.arrendamientos.dominio.modelo.RegistroPago;
import com.arrendamientos.arrendamientos.dominio.modelo.dto.RespuestaPagoDto;

public interface RegistroPagoArriendoRepositorio {
    RespuestaPagoDto registrarPago(RegistroPago registroPago);
}
