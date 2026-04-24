package Patron.strategy.ejemplo.service.Strategy;

import org.springframework.stereotype.Component;

@Component("express")
public class EnvioExpress implements EnvioStrategy {
    public String enviar() {
        return "Envio express (24 horas)";
    }
}
