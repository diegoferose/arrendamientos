package com.arrendamientos.arrendamientos.aplicacion.manejador;

import com.arrendamientos.arrendamientos.aplicacion.fabrica.FabricaRegistrarPago;
import com.arrendamientos.arrendamientos.dominio.modelo.RegistroPago;
import com.arrendamientos.arrendamientos.dominio.modelo.dto.RespuestaPagoDto;
import com.arrendamientos.arrendamientos.dominio.servicio.PagoArriendoServicio;
import com.arrendamientos.arrendamientos.infracestructura.dto.RegistrarPagoDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ManejadorPagoArriendo {
    FabricaRegistrarPago fabricaRegistrarPago;
    PagoArriendoServicio pagoArriendoServicio;

    public RespuestaPagoDto ejecutar(RegistrarPagoDto registrarPagoDto){
        return pagoArriendoServicio.ejecutar(
                fabricaRegistrarPago.crear(registrarPagoDto)
        );
    }

}
