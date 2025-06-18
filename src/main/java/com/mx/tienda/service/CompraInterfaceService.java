package com.mx.tienda.service;

import java.util.List;

import com.mx.tienda.model.Compra;

public interface CompraInterfaceService {

Compra crearCompra(Compra compra);
List<Compra> buscarCompra();
Compra actualizarCompra(Compra compra, int idCompra);
void eliminarCompra(int idCompra);
}
