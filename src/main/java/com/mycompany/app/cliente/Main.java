/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app.cliente;

import java.util.Scanner;
import com.mycompany.app.Controlador.Controlador;
/**
 *
 * @author diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador cont=new Controlador();
        // TODO code application logic here
        boolean salir=false;
        int opcion=0;
        Scanner keyboard = new Scanner(System.in);
        while(!salir)
        {
            imprimirMenu();
            opcion=keyboard.nextInt();
            switch(opcion){
                case 0: salir=true;
                        break;
                case 1:cont.ingresarNoticia();
                        break;
                case 2:cont.listarNoticias();
                break;
                default: System.out.println("El valor ingresado no es correcto");
            }
        }
        
      
    }
    
    private static void imprimirMenu(){
        System.out.println("1_Ingresar noticia");
        System.out.println("2_Listar noticias");
        System.out.println("0_Salir");
        System.out.println("Ingrese una opcion: ");
    }

}
