package com.company;

import com.company.model.empleado.Empleado;
import com.company.model.empleado.personalidad.*;
import com.company.model.micro.Micro;

public class Main {

    public static void main(String[] args) {
        Personalidad apurado = new Apurado();
        Personalidad claustrofobico = new Claustrofobico();
        Personalidad fiaca = new Fiaca();
        Personalidad moderado = new Moderado();
        Personalidad obsecuente = new Obsecuente();

        Empleado empleadoApurado = new Empleado(apurado);
        Empleado empleadoClaustrofobico = new Empleado(claustrofobico, empleadoApurado);
        Empleado empleadoFiaca = new Empleado(fiaca, empleadoApurado);
        Empleado empleadoModerado = new Empleado(moderado, 15);
        Empleado empleadoModerado2 = new Empleado(moderado, empleadoApurado,  15);
        Empleado empleadoObsecuente = new Empleado(obsecuente, empleadoApurado);

        Micro micro1 = new Micro(10, 20, 140);
        Micro micro2 = new Micro(3, 0, 60);

        micro2.sube(empleadoApurado);
        micro1.sube(empleadoModerado);
        micro2.sube(empleadoObsecuente);
        micro1.sube(empleadoClaustrofobico);
        micro1.sube(empleadoModerado2);

        System.out.println(micro1.getEmpleados().toString());
        System.out.println(micro2.getEmpleados().toString());


    }
}
