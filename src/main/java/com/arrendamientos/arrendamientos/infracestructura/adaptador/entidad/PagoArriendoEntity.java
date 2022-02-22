package com.arrendamientos.arrendamientos.infracestructura.adaptador.entidad;

import javax.persistence.*;

@Entity
@Table(name = "arriendo")
public class PagoArriendoEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    private String documentoIdentificacionArrendatario;

    private String codigoInmueble;

    private String valorPagado;

    private String fechaPago;
}
