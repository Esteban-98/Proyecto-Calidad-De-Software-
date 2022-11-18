/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Admin.Producto;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class TablaColorStock extends DefaultTableCellRenderer {
    
    private final int columna_patron;
    
    public TablaColorStock(int col_patrol){
    this.columna_patron = col_patrol;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int row, int col){
       Font font = new Font("Tahoma", Font.BOLD, 12);
       
       if(Integer.parseInt(table.getValueAt(row, columna_patron).toString())< 86){
               setForeground(Color.RED);
               setFont(font);
       
       }else{
           
           if(Integer.parseInt(table.getValueAt(row, columna_patron).toString())>= 86
                  && Integer.parseInt(table.getValueAt(row, columna_patron).toString()) < 175 ){
               setForeground(Color.YELLOW);
               setFont(font);
           }else{
           setForeground(Color.GREEN);
               setFont(font);
           }
               
    
       }
       
       
       
       

        super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        return  this;
    }
    


    
}
