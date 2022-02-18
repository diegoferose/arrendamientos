package com.arrendamientos.arrendamientos.aplicacion.fabrica;

import com.arrendamientos.arrendamientos.dominio.modelo.RegistroPago;
import com.arrendamientos.arrendamientos.infracestructura.dto.RegistrarPagoDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class FabricaRegistrarPago {
    public RegistroPago crear(RegistrarPagoDto registrarPagoDto){
        return new RegistroPago(
                registrarPagoDto.getDocumentoIdentificacionArrendatario(),
                registrarPagoDto.getCodigoInmueble(),
                registrarPagoDto.getValorPagado(),
                registrarPagoDto.getFechaPago()
        );
    }
}
