/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadeamayts1;

import javax.swing.JOptionPane;

/**
 *
 * @author STUDIOS CALEB
 */
public class Tareadeamayts1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int cant=0;
        cant=Integer.parseInt(JOptionPane.showInputDialog ("¿Cuantas personas desea registrar?"));
        String nombre[]= new String[cant];
        int horas[]= new int [cant];
        double sal[]= new double [cant];
        double total=0;
        double mayor=0;
        String nmayor="";
        String detalle= "\n";
         
        for (int i=0; i<cant; i++){
          nombre[i]=JOptionPane.showInputDialog("Ingrese el nombre del trabajador:"+(i+1));
          nmayor=nombre[i];
          horas[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas:"));
          sal[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario que cobra por cada hora:"));
          total=horas[i]*sal[i];
          detalle+="\nNombre del trabajador:\n"+nombre[i] + "\nHoras trabajadas\n" +horas[i] + "\nSalario por hora\n"+ sal[i] + "\n";
         
          if (total>mayor){
              mayor=total;
              nmayor=nombre[i];
          }
            
    }
    JOptionPane.showMessageDialog(null,"\nDetalle general de la planilla\n"+detalle);
     JOptionPane.showMessageDialog(null,"Salario mas alto registrado:"+mayor );
          JOptionPane.showMessageDialog(null,"Nombre de la persona que mas gano:"+nmayor );
          

    
    }  
    }
    

