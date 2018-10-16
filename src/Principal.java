/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Principal {
 
    public static void main (String []args) {

        FutbolistaProfesional jugador1 = new FutbolistaProfesional();
        
            jugador1.nombre = "Pepe";
            jugador1.edad = 28;
            jugador1.posición = "volante izquierdo";
            jugador1.equipo = "El Mejor";
            jugador1.montocontrato = 5000000;
            jugador1.vigenciacontrato = 2024;
            
            System.out.println("Futbolista : " + jugador1.nombre);
            System.out.println("Edad : " + jugador1.edad);
            System.out.println("Posición : " + jugador1.posición);
            System.out.println("Equipo : " + jugador1.equipo);
            System.out.println("Monto Contrato : " + jugador1.montocontrato);
            System.out.println("Contrato vigente hasta : " + jugador1.vigenciacontrato);
            
            jugador1.comer();
            jugador1.dormir();
            jugador1.entrenar();
            jugador1.jugar();
            jugador1.firmarcontrato();
                     
            FutbolistaProfesional jugador2 = new FutbolistaProfesional();
        
            jugador2.nombre = "Cachito";
            jugador2.edad = 36;
            jugador2.posición = "defensor central";
            jugador2.equipo = "Es lo que hay";
            jugador2.montocontrato = 2000000;
            jugador2.vigenciacontrato = 2014;
            
            System.out.println("Futbolista : " + jugador2.nombre);
            System.out.println("Edad : " + jugador2.edad);
            System.out.println("Posición : " + jugador2.posición);
            System.out.println("Equipo : " + jugador2.equipo);
            System.out.println("Monto Contrato : " + jugador2.montocontrato);
            System.out.println("Contrato vigente hasta : " + jugador2.vigenciacontrato);
            
            jugador2.comer();
            jugador2.dormir();
            jugador2.entrenar();
            jugador2.jugar();
            jugador2.firmarcontrato();
}
}   
