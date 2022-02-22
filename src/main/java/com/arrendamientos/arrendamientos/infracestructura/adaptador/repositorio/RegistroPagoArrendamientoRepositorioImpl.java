package com.arrendamientos.arrendamientos.infracestructura.adaptador.repositorio;

import com.arrendamientos.arrendamientos.dominio.modelo.RegistroPago;
import com.arrendamientos.arrendamientos.dominio.modelo.dto.RespuestaPagoDto;
import com.arrendamientos.arrendamientos.dominio.puerto.RegistroPagoArriendoRepositorio;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegistroPagoArrendamientoRepositorioImpl implements RegistroPagoArriendoRepositorio {
    private JdbcTemplate jdbcTemplate;

    public RegistroPagoArrendamientoRepositorioImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public RespuestaPagoDto registrarPago(RegistroPago registroPago) {
        jdbcTemplate.update("insert into arriendo values (?,?,?,?,?)",
                null,
                registroPago.getDocumentoIdentificacionArrendatario(),
                registroPago.getCodigoInmueble(),
                registroPago.getValorPagado(),
                registroPago.getFechaPago());
        return new RespuestaPagoDto("Exito");
    }
}
