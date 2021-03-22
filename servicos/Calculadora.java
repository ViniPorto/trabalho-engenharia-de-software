
package servicos;

import exceptions.NaoPodeDividirPorZeroException;

public class Calculadora {
    
    public int somarDoisNumeros(int n1, int n2){
        return (n1+n2);
    }
    
    public int subtrairDoisNumeros(int n1, int n2){
        return (n1-n2);
    }
    
    public int multiplicarDoisNumeros(int n1, int n2){
        return (n1*n2);
    }
    
    public float dividirDoisNumeros(float n1, float n2) throws NaoPodeDividirPorZeroException{
        if (n2 == 0){
            throw new NaoPodeDividirPorZeroException();
        }
        return (n1/n2);
    }
    
    
}
