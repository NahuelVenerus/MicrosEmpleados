package com.company.model.micro;

import com.company.model.empleado.Empleado;
import com.company.model.exception.EmpleadoNoPuedeBajarException;
import com.company.model.exception.EmpleadoNoPuedeSubirAMicroException;

import java.util.ArrayList;
import java.util.List;

public class Micro {

    private int asientos;
    private int espacioParados;
    private int sentados = 0;
    private int parados = 0;
    private int volumen;
    private List<Empleado> empleados = new ArrayList<Empleado>();

    public Micro(int asientos, int espacioParados, int volumen) {
        this.asientos = asientos;
        this.espacioParados = espacioParados;
        this.volumen = volumen;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public int getAsientos() {
        return asientos;
    }

    public int getEspacioParados() {
        return espacioParados;
    }

    public int getSentados() {
        return sentados;
    }

    public int getParados() {
        return parados;
    }

    public int getVolumen() {
        return volumen;
    }

    public void sube(Empleado empleado){
        if (empleado.quiereSubir(this)){
            empleados.add(empleado);
            empleado.setMicro(this);
            if (asientos > sentados){
                sentados++;
                empleado.setSentado(true);
            } else {
                parados++;
            }
        } else {
            throw new EmpleadoNoPuedeSubirAMicroException("El empleado " + empleado + " no puede subir al micro");
        }

    }
    public void baja(Empleado empleado){
        if (!estaVacio() && this.getEmpleados().contains(empleado)){
            empleado.setSentado(false);
            sentados--;
            empleado.setMicro(null);
            empleados.remove(empleado);
        } else {
            throw new EmpleadoNoPuedeBajarException("El empleado " + empleado + "no puede bajar del micro");
        }
    }

    public int lugaresLibres() {
        return asientos + espacioParados - sentados - parados;
    }

    public boolean hayLugar() {
        return lugaresLibres() > 0;
    }

    private boolean estaVacio() {
        return empleados.isEmpty();
    }

    private Empleado primeroEnSubir() {
        if (!estaVacio()) {
            return empleados.get(0);
        }
        return null;
    }

    private boolean puedeSubirUnaPersona(Micro micro, Empleado empleado){
        return hayLugar() && empleado.quiereSubir(micro);
    }


}
