/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.univali.cc.calculadora.dominio;

import br.univali.cc.calculadora.excecoes.DivisaoPorZeroException;
import br.univali.cc.calculadora.excecoes.OperacaoInvalidaException;

/**
 *
 * @author 1978233
 */
public class Calculadora {
    
    private double oper1;
    private double oper2;
    private char operacao;
    
    
    
    public double resultado() throws OperacaoInvalidaException, DivisaoPorZeroException {
        double res = 0;
        switch (operacao) {
            case '+':
                res = oper1+oper2;
            break;
            case '-':
                res = oper1-oper2;
            break;
            case '/':
                if (oper2 == 0){
                    throw new DivisaoPorZeroException();
                }
                res = oper1/oper2;
            break;
            case '*':
                res = oper1*oper2;
            break;
            default:
                throw new OperacaoInvalidaException();
        }
        return res;
    }

    /**
     * @return the oper1
     */
    public double getOper1() {
        return oper1;
    }

    /**
     * @param oper1 the oper1 to set
     */
    public void setOper1(double oper1) {
        this.oper1 = oper1;
    }

    /**
     * @return the oper2
     */
    public double getOper2() {
        return oper2;
    }

    /**
     * @param oper2 the oper2 to set
     */
    public void setOper2(double oper2) {
        this.oper2 = oper2;
    }

    /**
     * @return the operacao
     */
    public char getOperacao() {
        return operacao;
    }

    /**
     * @param operacao the operacao to set
     */
    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }
    
}
