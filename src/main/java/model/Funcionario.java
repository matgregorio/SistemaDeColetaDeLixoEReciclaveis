/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author mateus
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
abstract public class Funcionario extends Pessoa{
    private double remuneracaoMensal;
    private Date horaDeEntrada;
    private Date horaDeSaida;
    private ArrayList diasTrabalhados;
}
