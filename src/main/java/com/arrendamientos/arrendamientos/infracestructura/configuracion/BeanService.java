package com.arrendamientos.arrendamientos.infracestructura.configuracion;

import com.arrendamientos.arrendamientos.aplicacion.fabrica.FabricaRegistrarPago;
import com.arrendamientos.arrendamientos.aplicacion.manejador.ManejadorPagoArriendo;
import com.arrendamientos.arrendamientos.dominio.servicio.PagoArriendoServicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanService {
    @Bean
    public  PagoArriendoServicio pagoArriendoServicio(){
        return new PagoArriendoServicio();
    }

    @Bean
    public ManejadorPagoArriendo manejadorPagoArriendo(FabricaRegistrarPago fabricaRegistrarPago, PagoArriendoServicio pagoArriendoServicio){
        return new ManejadorPagoArriendo(fabricaRegistrarPago,pagoArriendoServicio);
    }
}
