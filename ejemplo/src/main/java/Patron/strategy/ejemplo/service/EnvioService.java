package Patron.strategy.ejemplo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

import Patron.strategy.ejemplo.service.Strategy.EnvioStrategy;

@Service
public class EnvioService {

    @Autowired
    private Map<String, EnvioStrategy> estrategias;

    public String procesarEnvio(String tipo) {
        EnvioStrategy estrategia = estrategias.get(tipo);
        return estrategia.enviar();
    }

}
