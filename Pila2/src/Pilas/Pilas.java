/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Pila pilita = new Pila();
     int opcion = 0, elemen=0;
     do
     {
      
       opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
                 "1. Agregar un elemento a la Pila \n"
               + "2. Sacar un elemento de la Pila \n"
               + "3. ¿La pila esta vacia? \n"
               + "4. ¿Que elemento esta en la cima? \n"
               + "5. Tamano de la Pila \n" 
               + "6. Vaciar la Pila \n" 
               + "7. Mostrat la Pila \n"          
               + "8. Salir", " Menu de Opciones",
               JOptionPane.INFORMATION_MESSAGE));
       
       switch (opcion){
        
           case 1:
                elemen = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingrese el Elemento a insertar en la Pila: "));
                // Agregando al nodo
                pilita.insertar(elemen);
           break;
           
           case 2:
                if (!pilita.estaVacia()){
                    JOptionPane.showMessageDialog(null, "El elemento obtenido es: "+
                    pilita.sacar()); 
                }else {
                JOptionPane.showMessageDialog(null, "La Pila esta vacia"); 
                }
           break;
           
           case 3:
               if (pilita.estaVacia()){
                    JOptionPane.showMessageDialog(null, "La Pila esta Vacia"); 
                }else {
                JOptionPane.showMessageDialog(null, "La Pila NO esta vacia"); 
                }
                break;   
           case 4:
              
               break;
           case 5:
              
               break;
               
           case 6:            
               
               break;
           
           case 7:
               
                pilita.mostrarlista();
           break;
           
           case 8:
               
               JOptionPane.showMessageDialog(null, "La aplicacion ha finalizado");
       
               break;
           default:
               JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
            break;
       }
    } while (opcion != 8);
    
    
    }   
}
