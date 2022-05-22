package main;

import model.Pessoa;

public class Principal {
    public static void main (String[] args){
        Pessoa p1 = new Pessoa();
        p1.setNome("Isis");
        p1.setIdade(33);

        Pessoa p2 = new Pessoa("Pedro",25);

        System.out.print("Pessoa 1: " + p1 + "\n");
        System.out.print("Pessoa 2: " + p2 + "\n");
    }
}
