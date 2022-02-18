package com.arrendamientos.arrendamientos.infracestructura.controlador;

import com.arrendamientos.arrendamientos.aplicacion.manejador.ManejadorPagoArriendo;
import com.arrendamientos.arrendamientos.dominio.modelo.dto.RespuestaPagoDto;
import com.arrendamientos.arrendamientos.infracestructura.dto.RegistrarPagoDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ArrendamientosControllador {
    ManejadorPagoArriendo manejadorPagoArriendo;

    public ArrendamientosControllador(ManejadorPagoArriendo manejadorPagoArriendo) {
        this.manejadorPagoArriendo = manejadorPagoArriendo;
    }

    @PostMapping("/pagos")
    public RespuestaPagoDto pagos(@RequestBody RegistrarPagoDto registrarPagoDto){
        return manejadorPagoArriendo.ejecutar(registrarPagoDto);
    }


}
