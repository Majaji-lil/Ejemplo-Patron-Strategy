package Patron.strategy.ejemplo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import Patron.strategy.ejemplo.service.*;

@RestController
@RequestMapping("/envio")
public class EnvioController {

    private final EnvioService service;

    public EnvioController(EnvioService service) {
        this.service = service;
    }

    @GetMapping
    public String enviar(@RequestParam String tipo) {
        return service.procesarEnvio(tipo);
    }
    

}
