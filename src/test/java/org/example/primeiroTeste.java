package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class primeiroTeste {

    Calculadora calculadora;
    int num1 = 10 , num2 = 5;

    @BeforeEach
    public void setUp(){
        calculadora = new Calculadora();
    }


    @Test
    public void deveSomarDoisNumerosTeste(){

        //cenario
        int numero1 = 10, numero2 = 5;
        Calculadora calculadora = new Calculadora();

        //execução ou ação
        //int resultado = numero1 + numero2;
        int resultado = calculadora.somar(numero1, numero2);
        System.out.println(resultado);

        //verificação
        //Assert.assertEquals(15, resultado);

        Assertions.assertThat(resultado).isEqualTo(15);
    }

    @Test
    public void naoDeveSomarNumerosNegativos(){

        //cenario
        Calculadora calculadora = new Calculadora();
        int num1 = -10, num2 = 5;

        //execução
        org.junit.jupiter.api.Assertions
                .assertThrows(RuntimeException.class, () -> calculadora.somar(num1, num2));

    }

    @Test
    public  void subtratrair(){
        //cenario
        Calculadora calculadora = new Calculadora();
        int num1 = 10, num2 = 5;

        //execução ou ação
        int resultado = calculadora.subtrair(num1,num2);
        System.out.println(resultado);

        //verificação
        Assertions.assertThat(resultado).isEqualTo(5);
    }

    @Test
    public  void multiplicar(){

        //execução
        int resultado = calculadora.multiplicar(num1, num2);
        System.out.println(resultado);

        //verificação
        Assertions.assertThat(resultado).isEqualTo(50);
    }

    @Test
    public  void dividir(){

        //execução
        float resultado = calculadora.dividir(num1, num2);
        System.out.println(resultado);

        //verificação
        Assertions.assertThat(resultado).isEqualTo(2);
    }

    @Test
    public void naoDeveDividirPorZero(){
        //cenario
        int num1 = 10, num2 = 0;

        //execução ou ação
        org.junit.jupiter.api.Assertions
                .assertThrows(ArithmeticException.class, () -> calculadora.dividir(num1, num2));
    }

}
class Calculadora{
    int somar(int num1, int num2) {
        if (num1 < 0 || num2 < 0){
            throw new RuntimeException("nao permitido numeros negativos");
        }
        return num1 + num2;
    }

    int subtrair(int num1, int num2 ){
        return num1 - num2;
    }

    int multiplicar(int num1 ,int num2){
        return num1 * num2;
    }

    float dividir(int num1, int num2){
        return num1 / num2;
    }
}
