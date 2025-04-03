package com.example.productos;

import com.example.productos.model.Producto;
import com.example.productos.repository.ProductoRepository;
import com.example.productos.service.ProductoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import reactor.core.publisher.Flux;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;

@ExtendWith(MockitoExtension.class)
class ProductoServiceTests {
    
    /**
    //Configuracion por default
    @Test
    void contextLoads() {
    }
    */
    /**
    //Prueba Unitaria Listar
    @Mock
    private ProductoRepository productoRepository;

    @InjectMocks
    private ProductoService productoService;

    private Producto producto1;
    private Producto producto2;

    @BeforeEach
    void setUp() {
        producto1 = new Producto("1", "Producto 1", 100);
        producto2 = new Producto("2", "Producto 2", 200);
    }

    @Test
    void listarProductos() {
        when(productoRepository.findAll()).thenReturn(Flux.fromIterable(Arrays.asList(producto1, producto2)));

        Flux<Producto> productos = productoService.listarProductos();

        assertEquals(2, productos.count().block());
        verify(productoRepository, times(1)).findAll();
    }
    */
    /**
    //Prueba Unitaria Obtener Producto Por Id
    @Mock
    private ProductoRepository productoRepository;

    @InjectMocks
    private ProductoService productoService;

    private Producto producto1;

    @BeforeEach
    void setUp() {
        producto1 = new Producto("1", "Producto 1", 100);
    }

    @Test
    void obtenerProductoPorId() {
        when(productoRepository.findById("1")).thenReturn(Mono.just(producto1));

        Mono<Producto> producto = productoService.obtenerProductoPorId("1");

        assertEquals(producto1, producto.block());
        verify(productoRepository, times(1)).findById("1");
    }
    */
    /**
    //Prueba Unitaria Obtener Producto Por Id
    @Mock
    private ProductoRepository productoRepository;

    @InjectMocks
    private ProductoService productoService;

    private Producto producto1;

    @BeforeEach
    void setUp() {
        producto1 = new Producto("1", "Producto 1", 100);
    }

    @Test
    void crearProducto() {
        when(productoRepository.save(producto1)).thenReturn(Mono.just(producto1));

        Mono<Producto> producto = productoService.crearProducto(producto1);

        assertEquals(producto1, producto.block());
        verify(productoRepository, times(1)).save(producto1);
    }
    */
}
