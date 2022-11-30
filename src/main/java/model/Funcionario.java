/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mateus
 */
abstract public class Funcionario extends Pessoa{
    private double remuneracaoMensal;
    private Date horaDeEntrada;
    private Date horaDeSaida;
    private ArrayList diasTrabalhados;
    
    Funcionario(){
        this.remuneracaoMensal = 0.0;
        this.horaDeSaida = new Date();
        this.horaDeEntrada = new Date();
        this.diasTrabalhados = new ArrayList();
        
    }

    /**
     * @return the remuneracaoMensal
     */
    public double getRemuneracaoMensal() {
        return remuneracaoMensal;
    }

    /**
     * @param remuneracaoMensal the remuneracaoMensal to set
     */
    public void setRemuneracaoMensal(double remuneracaoMensal) {
        this.remuneracaoMensal = remuneracaoMensal;
    }

    /**
     * @return the horaDeEntrada
     */
    public Date getHoraDeEntrada() {
        return horaDeEntrada;
    }

    /**
     * @param horaDeEntrada the horaDeEntrada to set
     */
    public void setHoraDeEntrada(Date horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    /**
     * @return the horaDeSaida
     */
    public Date getHoraDeSaida() {
        return horaDeSaida;
    }

    /**
     * @param horaDeSaida the horaDeSaida to set
     */
    public void setHoraDeSaida(Date horaDeSaida) {
        this.horaDeSaida = horaDeSaida;
    }

    /**
     * @return the diasTrabalhados
     */
    public ArrayList getDiasTrabalhados() {
        return diasTrabalhados;
    }

    /**
     * @param diasTrabalhados the diasTrabalhados to set
     */
    public void setDiasTrabalhados(ArrayList diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }
}
