package com.company.model.empleado.personalidad;

import com.company.model.empleado.Empleado;
import com.company.model.micro.Micro;

public class Moderado implements Personalidad {

    @Override
    public boolean puedeSubir(Micro micro, Empleado empleado) {
        return micro.lugaresLibres() >= empleado.getLugaresLibresNecesarios();
    }

    @Override
    public String toString() {
        return "Moderado{}";
    }
}
