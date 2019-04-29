/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app.Controlador;

import com.mycompany.practicotse2019.controller.PorotoRemoto;
import com.mycompany.practicotse2019.model.Noticia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.ejb.EJB;

/**
 *
 * @author diego
 */
public class Controlador {
    
    @EJB 
    private PorotoRemoto em;

    
    
        public void ingresarNoticia(){
        Scanner keyboard = new Scanner(System.in);
        Noticia n=new Noticia();
        System.out.println("Id: ");
        n.setId(keyboard.nextInt());
        System.out.println("Titulo: ");
        n.setTitulo(keyboard.nextLine());
        System.out.println("Descripción: ");
        n.setDescripcion(keyboard.nextLine());
        n.setNroPublicaciones(0);
        em.addNoticia(n);    
        
    }
    public void listarNoticias(){
        List<Noticia> noticiasAux=new ArrayList<Noticia>();
        noticiasAux=em.getAllNoticias();
        Noticia aux=new Noticia();
        Iterator<Noticia> i=noticiasAux.iterator();
        while(i.hasNext())
        {
            aux=i.next();
            System.out.println("Id: "+aux.getId());
            System.out.println("Titulo: "+aux.getTitulo());
            System.out.println("Descripción: "+aux.getDescripcion());
        }
    }
}
