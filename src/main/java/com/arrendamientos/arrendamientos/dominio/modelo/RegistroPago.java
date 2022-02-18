package com.arrendamientos.arrendamientos.dominio.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class RegistroPago {
    private String documentoIdentificacionArrendatario;
    private String codigoInmueble;
    private String valorPagado;
    private String fechaPago;
}
