
import br.univali.cc.calculadora.excecoes.DivisaoPorZeroException;
import br.univali.cc.calculadora.excecoes.OperacaoInvalidaException;
import br.univali.cc.calculadora.visao.CalculadoraGUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 1978233
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        CalculadoraGUI calc = new CalculadoraGUI();
        calc.menu();
    }
    
}
