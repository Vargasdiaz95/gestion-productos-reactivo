/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.productos.controller;
import com.example.productos.model.Producto;
import com.example.productos.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Locale;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor // Lombok: genera un constructor con los campos final
public class ProductoController {

    private final ProductoService productoService = null;
    
    private final MessageSource messageSource = null;

    @GetMapping
    public Flux<Producto> listarproductos() {
        return productoService.listarProductos();
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Producto>> obtenerPorId(@PathVariable String id) {
        return productoService.obtenerProductoPorId(id)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<Producto> crear(@RequestBody Producto producto) {
        return productoService.crearProducto(producto);
    }

    @PutMapping("/{id}")
    public Mono<ResponseEntity<Producto>> actualizar(@PathVariable String id, @RequestBody Producto producto) {
        return productoService.actualizarProducto(id, producto)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public Mono<Void> eliminar(@PathVariable String id) {
        return productoService.eliminarProducto(id);
    }

    @GetMapping("/mensaje")
    public String mensaje(@RequestParam(name = "lang", defaultValue = "es") String lang) {
        Locale locale = Locale.forLanguageTag(lang);
        return messageSource.getMessage("mensaje.bienvenida", null, locale);
    }
}
