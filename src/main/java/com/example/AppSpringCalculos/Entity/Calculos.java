package com.example.AppSpringCalculos.Entity;

import java.util.Arrays;
import java.util.List;

public class Calculos {
    private List<Integer> valores;


    public Calculos(List<Integer> valores) {
        this.valores = valores;
    }
    
    
    
    public Calculos() {}



    public int somarTodos(List<Integer> valores){
        
        int soma = 0;

        for (int valor:valores) {

            soma = soma + valor;

        }

        return soma;

    }


    public int maxNumero(List<Integer>valores){

       int  max = valores.get(0);

        for (int i = 1; i < valores.size(); i++) {
            if (valores.get(i) > max) {
                max = valores.get(i);
            }
        }



        return max;
    }






    public int minNumero(List<Integer>valores){

        int  min = valores.get(0);

        for (int i = 1; i < valores.size(); i++) {
            if (valores.get(i) < min) {
                min = valores.get(i);
            }
        }



        return min;
    }


    public float media(List<Integer> valores){

        int soma = 0;
        int tamanho = valores.size();
        int media;



        for (int valor:valores) {

            soma = soma + valor;

        }

        media = soma / tamanho;

        return media;


    }


    public double desvioPadrao(List<Integer> valores){


        double desvioPadrao;
        double somaDif = 0;

        for(int valor :valores){
            somaDif += Math.pow(valor - media(valores), 2);
        }

        desvioPadrao =  Math.sqrt(somaDif/valores.size());

        return desvioPadrao;
}


public void mediana(List<Integer> valores){



}


}
