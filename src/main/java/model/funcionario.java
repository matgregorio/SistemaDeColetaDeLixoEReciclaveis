/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mateus
 */
abstract public class funcionario extends pessoa{
    private double remuneracaoMensal;
    
    funcionario(){
        this.remuneracaoMensal = 0.0;
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
}
