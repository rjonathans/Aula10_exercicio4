package br.com.digitalhouse;

import com.sun.imageio.plugins.common.I18N;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Funcionarios {
    private String nome;
    private Integer noRegistro;

    public Funcionarios(){
    }

    public Funcionarios(String nome,Integer noRegistro){
        this.setNome(nome);
        this.setNoRegistro(noRegistro);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Integer getNoRegistro(){
        return noRegistro;
    }
    public void setNoRegistro(Integer noRegistro){
        this.noRegistro = noRegistro;
    }

    public String perguntar(){
        System.out.println("Deseja cadastrar um funcionario?");
        Scanner teclado = new Scanner(System.in);
        String sim = "1";
        String nao = "2";
        String resposta = teclado.nextLine();
        return resposta;
    }

    /*public String solicitaNome(){
        System.out.println("Digita o nome do funcionario aqui: ");
        Scanner teclado = new Scanner(System.in);
        String nomeDaPessoa = teclado.nextLine();
        return nomeDaPessoa;

    public int geraNumeroAleatorio(){

        Random random = new Random();
        int numeroTmp = 0;
        for (int i = 0; i < 10; i++) {
           numeroTmp = random.nextInt(30);
        }
        return numeroTmp)

    }*/

    @Override
    public String toString() {
        return "Funcionarios: " +
                "\nnome: " + getNome() + "\n" +
                "noRegistro: " + getNoRegistro() +
                '\n';
    }
}
