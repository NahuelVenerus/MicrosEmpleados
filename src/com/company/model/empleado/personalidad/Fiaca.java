package com.company.model.empleado.personalidad;

import com.company.model.empleado.Empleado;
import com.company.model.micro.Micro;

public class Fiaca implements Personalidad {
    @Override
    public boolean puedeSubir(Micro micro, Empleado empleado) {
        return micro.getAsientos() > micro.getSentados();
    }

    @Override
    public String toString() {
        return "Fiaca{}";
    }
}
