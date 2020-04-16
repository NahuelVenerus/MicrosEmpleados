package com.company.model.empleado.personalidad;

import com.company.model.empleado.Empleado;
import com.company.model.micro.Micro;

public class Claustrofobico implements Personalidad {

    @Override
    public boolean puedeSubir(Micro micro, Empleado empleado) {
        return micro.getVolumen() > 120;
    }

    @Override
    public String toString() {
        return "Claustrofobico{}";
    }
}
