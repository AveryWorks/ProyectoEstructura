/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author maged
 */
public class Empleado {

    private int idEmpleado;
    private String nombre;
    private String labor;
    private String correo;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String labor, String correo) {
        this.idEmpleado = id;
        this.nombre = nombre;
        this.labor = labor;
        this.correo = correo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLabor() {
        return labor;
    }

    public String getCorreo() {
        return correo;
    }

    public void setIdEmpleado(int id) {
        this.idEmpleado = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + idEmpleado + ", nombre=" + nombre + ", labor=" + labor + ", correo=" + correo + '}';
    }
}
