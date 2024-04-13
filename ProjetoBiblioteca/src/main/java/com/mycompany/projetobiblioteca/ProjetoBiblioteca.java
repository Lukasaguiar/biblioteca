/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetobiblioteca;

/**
 *
 * @author Lukas Aguiar
 */
public class ProjetoBiblioteca {

    public static void main(String[] args) {
         LoginEntrar pagina= new LoginEntrar();//nome da classe com o painel que criamos 
            pagina.setVisible(true);//fazendo aparecer
            pagina.pack();//fazendo aparecer
            pagina.setLocationRelativeTo(null);//pagina aparece no meio
    }
}
