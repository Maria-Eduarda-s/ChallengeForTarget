/*
1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
 (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
 ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente
definido no código;

2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de
informar a quantidade de vezes em que ela ocorre.

IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente
definida no código;

3) Observe o trecho de código abaixo:
int INDICE = 12,
SOMA = 0, K = 1;
enquanto K < INDICE
faça { K = K + 1; SOMA = SOMA + K; }
imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?
R:O laço de repetição aumenta k em 1 a cada iteração e adiciona o valor de k à variável soma. No final, soma é igual
a 77.

4) Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, 9 R: Os números estão somando 2.(1+2=3...)
b) 2, 4, 8, 16, 32, 64, 128 R: Os números estão multiplicando por 2.(2*2=4, 2*4=8...)
c) 0, 1, 4, 9, 16, 25, 36, 49 R: Os números estão sendo elevados ao quadrado.(0^2=0, 1^2=1, 2^2=4)
d) 4, 16, 36, 64, 100 R: Os números pares estão sendo elevados ao quadrado.(2^2=4, 4^2=16, 6^2=36..)
e) 1, 1, 2, 3, 5, 8, 13 R: A sequência de Fibonacci.
f) 2, 10, 12, 16, 17, 18, 19, 200 R: A escrita dos números começam com a letra 'D'.(dois, dez, doze...)


5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode
 ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo
 é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma
 das salas das lâmpadas, qual interruptor controla cada lâmpada?
 R: Eu ligaria um interruptor e o deixaria ligado por alguns minutos para aquecer a lâmpada. Depois, desligaria esse 
 interruptor e ligaria o segundo. Quando eu verificasse as lâmpadas, a que estivesse acesa seria controlada pelo 
 segundo interruptor. A lâmpada que estivesse quente, mas apagada, seria controlada pelo primeiro interruptor.
 E a lâmpada fria e apagada seria controlada pelo terceiro interruptor.
 */

public class ChallengeTarget {

    public static void main(String[] args) {

        Exercise1(4);
        Exercise1(8);
        Exercise2("abacaxi");
        Exercise2("peixe");
        Exercise3();

    }

    public static void Exercise1(int number) {

        int[] fibonacci = new int[16];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        System.out.print("Sequência Fibonacci: " + fibonacci[0] + ", " + fibonacci[1]);

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(", " + fibonacci[i]);
        }
        System.out.println();

        boolean isFibonacci = false;
        for (int num : fibonacci) {
            if (number == num) {
                isFibonacci = true;
                break;
            }
        }

        if (isFibonacci) {
            System.out.println("O número " + number + " pertence à sequência Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência Fibonacci.");
        }
    }

    public static void Exercise2(String input){

        int count = 0;

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        if(count > 0){
            System.out.println("A entrada " + input + " contém " + count + " a's.");
        }else{
            System.out.println("A entrada " + input + " não contém 'a'");
        }
    }

    public static void Exercise3(){

        int indice = 12;
        int soma = 0;
        int k = 1;

        while(k < indice){
            k += 1;
            soma += k;
        }
        System.out.println(soma);

    }
}
