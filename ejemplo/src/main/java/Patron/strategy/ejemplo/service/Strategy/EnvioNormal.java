package Patron.strategy.ejemplo.service.Strategy;

import org.springframework.stereotype.Component;

@Component("normal")
public class EnvioNormal implements EnvioStrategy {
    public String enviar() {
        return "Envio normal (3 a 5 dias)";
    }
}
