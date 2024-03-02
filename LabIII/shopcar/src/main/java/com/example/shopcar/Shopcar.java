package com.example.shopcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class Shopcar {

    public static void main(String[] args) {
        SpringApplication.run(Shopcar.class, args);
    }

}

@RestController
@RequestMapping("/carros")
class RestApiDemoController {
    private List<Carro> carros = new ArrayList<>();

    public RestApiDemoController() {
        carros.addAll(List.of(
                new Carro("Voyage"),
                new Carro("Corsa"),
                new Carro("Fusca"),
                new Carro("Uno")
        ));
    }

    @GetMapping
    Iterable<Carro> getCarros() {
        return carros;
    }

    @GetMapping("/{id}")
    Optional<Carro> getCarroById(@PathVariable String id) {
        for (Carro c: carros) {
            if (c.getId().equals(id)) {
                return Optional.of(c);
            }
        }

        return Optional.empty();
    }

    @PostMapping
    Carro postCarro(@RequestBody Carro carro) {
        carros.add(carro);
        return carro;
    }

    @PutMapping("/{id}")
    ResponseEntity<Carro> putCarro(@PathVariable String id,
                                   @RequestBody Carro carro) {
        int carroIndex = -1;

        for (Carro c: carros) {
            if (c.getId().equals(id)) {
                carroIndex = carros.indexOf(c);
                carros.set(carroIndex, carro);
            }
        }

        return (carroIndex == -1) ?
                new ResponseEntity<>(postCarro(carro), HttpStatus.CREATED) :
                new ResponseEntity<>(carro, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteCarro(@PathVariable String id) {
        carros.removeIf(c -> c.getId().equals(id));
    }
}

class Carro {
    private final String id;
    private String name;

    public Carro(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Carro(String name) {
        this(UUID.randomUUID().toString(), name);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}