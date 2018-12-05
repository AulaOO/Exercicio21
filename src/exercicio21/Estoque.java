/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio21;

/**
 *
 * @author Luis Guilherme
 */
public class Estoque {
    private String nome;
    private int quantidadeAtual;
    private int quantidadeMinima;

    public Estoque() {
    }

    public Estoque(String nome, int quantidadeAtual, int quantidadeMinima) {
        this.nome = nome;
        if(validar() == true){
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
        }
    }
    
    public boolean validar(){
        boolean validade = false;
        if((quantidadeAtual >= 0) && (quantidadeMinima >= 0)){
            validade = true;
        }
        return validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }
    
    public void alteraNome(String nome){
        this.nome = nome;
    }
    
    public void alteraQuantidadeMinima(int quantidadeMinima){
        this.quantidadeMinima = quantidadeMinima;
    }
    
    public void reporEstoque(int repor){
        this.quantidadeAtual = this.quantidadeAtual + repor;
    }
    
    public void darBaixa(int baixa){
        this.quantidadeAtual = this.quantidadeAtual - baixa;
    }
    
    public String dadosProduto(){
        String dados = "Nome: " + nome + "\nQuantidade Atual: " + quantidadeAtual + "\nQuantidade Mínima: " + quantidadeMinima + "\n";
        return dados;
    }
    
    public String precisaRepor(){
        String repor;
        if(quantidadeAtual < quantidadeMinima){
            repor = "É preciso repor o produto \"" + nome + "\" no estoque" + "\n";
        }else{
            repor = "Não é preciso repor o produto \"" + nome + "\" no estoque" + "\n";
        }
        return repor;
    } 
    
}
