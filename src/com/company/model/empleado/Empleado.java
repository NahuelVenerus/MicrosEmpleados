package com.company.model.empleado;

import com.company.model.empleado.personalidad.Personalidad;
import com.company.model.micro.Micro;

public class Empleado {

    private Personalidad personalidad;
    private Empleado jefe;
    private int lugaresLibresNecesarios;
    private boolean sentado;
    private Micro micro;

    public Empleado(Personalidad personalidad, Empleado jefe, int lugaresLibresNecesarios) {
        this.personalidad = personalidad;
        this.jefe = jefe;
        this.lugaresLibresNecesarios = lugaresLibresNecesarios;
    }

    public Empleado(Personalidad personalidad) {
        this.personalidad = personalidad;
    }

    public Empleado(Personalidad personalidad, Empleado jefe) {
        this.personalidad = personalidad;
        this.jefe = jefe;
    }

    public Empleado(Personalidad personalidad, int lugaresLibresNecesarios) {
        this.personalidad = personalidad;
        this.lugaresLibresNecesarios = lugaresLibresNecesarios;
    }

    public boolean isSentado() {
        return sentado;
    }

    public void setSentado(boolean sentado) {
        this.sentado = sentado;
    }

    public Micro getMicro() {
        return micro;
    }

    public void setMicro(Micro micro) {
        this.micro = micro;
    }

    public int getLugaresLibresNecesarios() {
        return lugaresLibresNecesarios;
    }

    public Empleado getJefe() {
        return jefe;
    }

    public boolean quiereSubir(Micro micro){
        return personalidad.puedeSubir(micro, this)
                //&& this.getMicro() == null;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "personalidad=" + personalidad +
                ", jefe=" + jefe +
                '}';
    }
}
