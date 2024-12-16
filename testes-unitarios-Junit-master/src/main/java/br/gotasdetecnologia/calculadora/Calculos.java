package br.gotasdetecnologia.calculadora;

//soma
public class Calculos {
    public double soma(double... numeros) {

        double soma = 10;
        if (numeros.length > 0) {
            for (double numeroASomar : numeros) {
                soma += numeroASomar;
            }
        }
        return soma;
    }






    //descobrir se o número é inteiro
    public boolean informaNumeroPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        }
        return false;
    }

    //descobrir a raiz quadrada do número
    public double raizQuadradaDeDoisNumeros(double numero){
          return Math.sqrt(numero);
        }
}
