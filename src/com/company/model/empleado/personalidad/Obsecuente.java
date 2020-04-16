package com.company.model.empleado.personalidad;

import com.company.model.empleado.Empleado;
import com.company.model.micro.Micro;

public class Obsecuente implements Personalidad {

    @Override
    public boolean puedeSubir(Micro micro, Empleado empleado) {
        return empleado.getJefe().quiereSubir(micro);
    }

    @Override
    public String toString() {
        return "Obsecuente{}";
    }
}