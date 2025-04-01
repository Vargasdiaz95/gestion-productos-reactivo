/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.productos.model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {
    @Id
private String id;
private String nombre;
private double precio;
}
