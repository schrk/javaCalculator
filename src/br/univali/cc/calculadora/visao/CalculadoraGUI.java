/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.univali.cc.calculadora.visao;

import br.univali.cc.calculadora.dominio.Calculadora;
import br.univali.cc.calculadora.excecoes.DivisaoPorZeroException;
import br.univali.cc.calculadora.excecoes.FinalizarSistemaSilenciosamenteException;
import br.univali.cc.calculadora.excecoes.OperacaoInvalidaException;
import javax.swing.JOptionPane;

/**
 *
 * @author 1978233
 */
public class CalculadoraGUI {
    
    Calculadora calculadora = new Calculadora();
    
    public String lerValor(String rotulo) {
        return JOptionPane.showInputDialog(null,rotulo);
    }

    public void escreverValor(String valor) {
        JOptionPane.showMessageDialog(null, valor);
    }
    
    
    public void menu(){
        String resultado = "";
        try { 
            double oper1 = Double.parseDouble(lerValor("Operando 1"));
            double oper2 = Double.parseDouble(lerValor("Operando 2"));
            char operacao = lerValor("escolha + - * /").charAt(0);
            
            calculadora.setOper1(oper1);
            calculadora.setOper2(oper2);
            calculadora.setOperacao(operacao);
            
            resultado = String.valueOf(calculadora.resultado());
            
        } catch(OperacaoInvalidaException ex) {
            resultado = ex.getMessage();
        } catch(DivisaoPorZeroException ex) {
            resultado = "dãããã.. quer dividir por zero quiridu!!!!";
        } catch(NullPointerException ex) {
            resultado = "Finalizando a calculadora";
            throw new FinalizarSistemaSilenciosamenteException();
        } catch(NumberFormatException ex) {
            resultado = "deu ruim!";
        } finally {
            escreverValor("Resultado: "+resultado);
        }
        menu();        
    }
    
}
