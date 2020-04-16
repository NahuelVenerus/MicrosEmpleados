package com.company.model.empleado.personalidad;

import com.company.model.empleado.Empleado;
import com.company.model.micro.Micro;

public class Apurado implements Personalidad {

    @Override
    public boolean puedeSubir(Micro micro, Empleado empleado) {
        return true;
    }

    @Override
    public String toString() {
        return "Apurado{}";
    }
}
