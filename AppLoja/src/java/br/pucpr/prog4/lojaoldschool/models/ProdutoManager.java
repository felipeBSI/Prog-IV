/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojaoldschool.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chaves.felipe
 */
public class ProdutoManager implements IProdutoManager {
    
    private static List<Produto> produtos;
    
    static{
        produtos = new ArrayList<>();
       
        Produto p1 = new Produto();
        p1.setId(1);
        p1.setNome("mouse");
        p1.setPreco(350.0);
        
        
        Produto p2 = new Produto();
        p2.setId(2);
        p2.setNome("headset");
        p2.setPreco(450.0);
        
        
        Produto p3 = new Produto();
        p3.setId(3);
        p3.setNome("teclado");
        p3.setPreco(450.0);
        
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
    }
    @Override
    public List<Produto> obterTodos(){
        return produtos;
    }

    @Override
    public Produto obterPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
    
}
