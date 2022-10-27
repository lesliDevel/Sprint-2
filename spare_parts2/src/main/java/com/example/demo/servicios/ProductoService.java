package com.example.demo.servicios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Producto;

@Repository
public interface ProductoService extends  JpaRepository<Producto,Long> {

}
