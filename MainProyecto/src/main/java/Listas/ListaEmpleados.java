/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Clases.Empleado;

/**
 *
 * @author maged
 */
public class ListaEmpleados {

    NodoEmpleado Cabeza;

    public void insertarEmpleado(Empleado em) {

        if (Cabeza == null) {
            Cabeza = new NodoEmpleado(em);
        } else if (em.getIdEmpleado() < Cabeza.getDatoEmpleado().getIdEmpleado()) {
            NodoEmpleado aux = new NodoEmpleado(em);
            aux.setNextEmpleado(Cabeza);
            Cabeza = aux;
        } else if (Cabeza.getNextEmpleado() == null) {
            Cabeza.setNextEmpleado(new NodoEmpleado(em));

        } else {

            NodoEmpleado aux = Cabeza;
            while (aux.getNextEmpleado() != null
                    && aux.getNextEmpleado().getDatoEmpleado().getIdEmpleado() < em.getIdEmpleado()) {

                aux = aux.getNextEmpleado();
            }
            NodoEmpleado temp = new NodoEmpleado(em);
            temp.setNextEmpleado(aux.getNextEmpleado());
            aux.setNextEmpleado(temp);
        }

    }
}
