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
        p1.setNome("Mouse");
        p1.setPreco(350.0);
        
        
        Produto p2 = new Produto();
        p1.setId(2);
        p1.setNome("Headset");
        p1.setPreco(450.0);
        
        
        Produto p3 = new Produto();
        p1.setId(3);
        p1.setNome("Teclado");
        p1.setPreco(450.0);
        
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
    }
    @Override
    public List<Produto> obterTodos(){
        return produtos;
    }
}
