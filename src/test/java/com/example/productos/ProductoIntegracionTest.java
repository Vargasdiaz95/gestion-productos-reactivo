/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.productos;
import com.example.productos.model.Producto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
@AutoConfigureWebTestClient
public class ProductoIntegracionTest {
    
    /**
    //Prueba de intregacion WebTestClient (POST, GET y DELETE)
    @Autowired
    private WebTestClient webTestClient;
    @Test
    void crearProducto() {
        Producto producto = new Producto(null, "Producto Nuevo", 150);

        webTestClient.post()
                .uri("/api/productos")
                .body(Mono.just(producto), Producto.class)
                .exchange()
                .expectStatus().isCreated()
                .expectBody(Producto.class)
                .value(p -> {
                    assert p.getId() != null;
                    assert p.getNombre().equals("Producto Nuevo");
                    assert p.getPrecio() == 150;
                });
    }

    @Test
    void obtenerProductoPorId() {
        String id = "1";

        webTestClient.get()
                .uri("/api/productos/{id}", id)
                .exchange()
                .expectStatus().isOk()
                .expectBody(Producto.class)
                .value(p -> {
                    assert p.getId().equals(id);
                    assert p.getNombre() != null;
                    assert p.getPrecio() > 0;
                });
    }
    @Test
    void eliminarProducto() {
        String id = "1";

        webTestClient.delete()
                .uri("/api/productos/{id}", id)
                .exchange()
                .expectStatus().isNoContent();

        webTestClient.get()
                .uri("/api/productos/{id}", id)
                .exchange()
                .expectStatus().isNotFound();
    }
    */
    /**
    //Prueba de intregacion WebTestClient (POST, GET y DELETE)
    @Autowired
    private WebTestClient webTestClient;

    @Test
    void crearProducto() {
        Producto producto = new Producto(null, "Producto Simple", 100);

        webTestClient.post()
                .uri("/api/productos")
                .body(Mono.just(producto), Producto.class)
                .exchange()
                .expectStatus().isCreated()
                .expectBody(Producto.class)
                .value(p -> {
                    assert p.getId() != null;
                    assert p.getNombre().equals("Producto Simple");
                    assert p.getPrecio() == 100;
                });
    }
    */
    /**
    //Prueba de intregacion WebTestClient (POST, GET y DELETE)
    @Autowired
    private WebTestClient webTestClient;
    @Test
    void testCrearObtenerEliminarProducto() {
        Producto producto = new Producto(null, "Producto de Prueba", 110);
        Producto productoCreado = webTestClient.post()
                .uri("/api/productos")
                .body(Mono.just(producto), Producto.class)
                .exchange()
                .expectStatus().isCreated()
                .expectBody(Producto.class)
                .value(p -> {
                    assert p.getId() != null;
                    assert p.getNombre().equals("Producto de Prueba");
                    assert p.getPrecio() == 110;
                })
                .returnResult()
                .getResponseBody();
        assert productoCreado != null;
        String productoId = productoCreado.getId();
        webTestClient.get()
                .uri("/api/productos/{id}", productoId)
                .exchange()
                .expectStatus().isOk()
                .expectBody(Producto.class)
                .value(p -> {
                    assert p.getId().equals(productoId);
                    assert p.getNombre().equals("Producto de Prueba");
                    assert p.getPrecio() == 110;
                });
        webTestClient.delete()
                .uri("/api/productos/{id}", productoId)
                .exchange()
                .expectStatus().isNoContent();
        webTestClient.get()
                .uri("/api/productos/{id}", productoId)
                .exchange()
                .expectStatus().isNotFound();
    }
    */
}
