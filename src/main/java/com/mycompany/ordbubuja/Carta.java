/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordbubuja;

/**
 *
 * @author YULIETH
 */
public class Carta {
    
    String Valor ;
    private String  palo ;

    public Carta() {
    }

    public Carta(String Valor, String palo) {
        this.Valor = Valor;
        this.palo = palo;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    public String toString(){
        return Valor +"de "+palo ;
    }

    boolean Valor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
