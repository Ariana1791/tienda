package com.mx.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.tienda.model.Compra;

public interface CompraInterfaceRepositoy extends JpaRepository<Compra, Integer> {

}
