package com.mx.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.tienda.constantes.Constantes;
import com.mx.tienda.model.Compra;
import com.mx.tienda.repository.CompraInterfaceRepositoy;

@Service
public class CompraServiceImpl implements CompraInterfaceService {

    @Autowired
    CompraInterfaceRepositoy repository;
    
    @Override

    public Compra crearCompra(Compra compra) {
        Compra result = null;
        try {
           double calculoIva = compra.getPrecioProducto() * Constantes.IVA_PRODUCTO;
           compra.setTotalCompra(calculoIva + compra.getPrecioProducto());
           System.out.println("total compra :"+compra.getTotalCompra());
           System.out.println("nombre producto :"+compra.getNombreProducto());
            compra.setSubTotalCompra(compra.getPrecioProducto());

            result = repository.save(compra);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public List<Compra> buscarCompra() {
        List<Compra> resultado = null;
        try {
            resultado = repository.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    @Override
    public Compra actualizarCompra(Compra compra, int idCompra) {
       Compra guardar = new Compra();
        try {
            boolean recuperado = repository.existsById(idCompra);
            if (recuperado == true) {
                guardar.setIdCompra(idCompra);
                guardar.setNombreProducto(compra.getNombreProducto());
                guardar.setPrecioProducto(compra.getPrecioProducto());
                guardar.setFechaCompra(compra.getFechaCompra());
                guardar.setSubTotalCompra(compra.getSubTotalCompra());
                guardar.setTotalCompra(compra.getTotalCompra());
                guardar = repository.save(guardar);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return guardar;
    }

    @Override
    public void eliminarCompra(int idCompra) {
       int id = (int) idCompra;
        try {
            repository.deleteById(id);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    

    
    


    

}
