package com.mx.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mx.tienda.model.Compra;
import com.mx.tienda.service.CompraInterfaceService;

@RestController
public class CompraController {

    @Autowired
    CompraInterfaceService service;
    private List<Compra> buscar;

    @PostMapping(value = "/crearCompra")
    public Compra crearCompra(@RequestBody Compra compra) {
        Compra crear = null;
        try {
            crear = service.crearCompra(compra);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return crear;
    }

    @GetMapping(value = "/buscarCompra")
    public List<Compra> buscarCompra() {
        try {
            buscar = service.buscarCompra();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return buscar;
    }

    @PutMapping(value = "actualizarCompra/{idCompra}")
    public Compra actualizarCompra(@RequestBody Compra compra, @PathVariable int idCompra) {
        Compra actualizar = null;
        try {
            actualizar = service.actualizarCompra(compra, idCompra);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return actualizar;

    }

    @DeleteMapping(value = "/eliminarCompra/{idCompra}")
    public void eliminarCompra(@PathVariable int idCompra){
        try {
            service.eliminarCompra(idCompra);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}