/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.modules.manageRooms.classes;

import stars.classes.DataPropia;

/**
 *
 * @author Gestor
 */
public class Room {
    
    private int numRoom = 0;
    private DataPropia entrada = null;
    private DataPropia eixida = null;
    private String tipus = "";
    private int capacitat = 0;
    /*private StringBuffer observacions = null;*/

    public Room (int numRoom, DataPropia entrada, DataPropia eixida, String tipus, int capacitat) {
        this.numRoom = numRoom;
        this.entrada = entrada;
        this.eixida = eixida;
        this.tipus = tipus;
        this.capacitat = capacitat;                
    }
    
    public Room (){
        
    }

    public int getNumRoom() {
        return numRoom;
    }

    public void setNumRoom(int numRoom) {
        this.numRoom = numRoom;
    }

    public DataPropia getEntrada() {
        return entrada;
    }

    public void setEntrada(DataPropia entrada) {
        this.entrada = entrada;
    }

    public DataPropia getEixida() {
        return eixida;
    }

    public void setEixida(DataPropia eixida) {
        this.eixida = eixida;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    /*
    public StringBuffer getObservacions() {
        return observacions;
    }
    

    public void setObservacions(StringBuffer observacions) {
        this.observacions = observacions;
    }
    */
    
    
    
}
