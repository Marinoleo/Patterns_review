package com.spring.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Notificacion {
    private String ultimoMensaje;
    private List<ObserverMensaje> seguidores;

    public Notificacion() {
        seguidores = new ArrayList<ObserverMensaje>();
    }

    public void agregarSeguidor(ObserverMensaje seguidor) {
        seguidores.add(seguidor);
    }

    public void quitarSeguidor(ObserverMensaje seguidor) {
        seguidores.remove(seguidor);
    }
    public void nuevoMensaje(String mensaje){
        this.ultimoMensaje = mensaje;
        notificar(mensaje);
    }
    private void notificar (String mensaje){
        for (ObserverMensaje obs: seguidores){
            obs.recibir(mensaje);
        }
    }


}
