/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.productos.repository;
import com.example.productos.model.Producto;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductoRepository extends ReactiveCrudRepository<Producto, String> {
    
}
