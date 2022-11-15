/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Clases.Cliente;

/**
 *
 * @author maged
 */
public class ListaClientes {
    
    NodoCliente Cabeza;
    public void insertarCliente(Cliente cln) {

        if (Cabeza == null) {
            Cabeza = new NodoCliente(cln);
        } else if (cln.getIdCliente()< Cabeza.getDatoCliente().getIdCliente()) {
            NodoCliente aux = new NodoCliente(cln);
            aux.setNextCliente(Cabeza);
            Cabeza = aux;
        } else if (Cabeza.getNextCliente()== null) {
            Cabeza.setNextCliente(new NodoCliente(cln));

        } else {

            NodoCliente aux = Cabeza;
            while (aux.getNextCliente()!= null
                    && aux.getNextCliente().getDatoCliente().getIdCliente()< cln.getIdCliente()) {

                aux = aux.getNextCliente();
            }
            NodoCliente temp = new NodoCliente(cln);
            temp.setNextCliente(aux.getNextCliente());
            aux.setNextCliente(temp);
        }

    }
}
