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
public class testeEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estoque produto1 = new Estoque("Impressora Jato de Tinta", 13, 6);
        Estoque produto2 = new Estoque("Monitor LCD 17 Polegadas", 11, 13);
        Estoque produto3 = new Estoque("Mouse Óptico", 6, 2);
        Estoque produto4 = new Estoque("Teclado", 4, 8);
        System.out.println(produto1.dadosProduto());
        produto1.darBaixa(5);
        System.out.println(produto1.dadosProduto());
        System.out.println(produto2.dadosProduto());
        produto2.reporEstoque(7);
        System.out.println(produto2.dadosProduto());
        System.out.println(produto3.dadosProduto());
        produto3.darBaixa(4);
        System.out.println(produto3.dadosProduto());
        System.out.println(produto1.precisaRepor());
        System.out.println(produto2.precisaRepor());
        System.out.println(produto3.precisaRepor());
        System.out.println(produto4.precisaRepor());
        System.out.println(produto1.dadosProduto());
        System.out.println(produto2.dadosProduto());
        System.out.println(produto3.dadosProduto());
        System.out.println(produto4.dadosProduto());
    }
    
}
