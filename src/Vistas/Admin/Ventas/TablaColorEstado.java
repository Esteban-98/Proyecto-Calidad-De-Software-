/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Admin.Ventas;



import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author CAMILO
 */
public class TablaColorEstado extends DefaultTableCellRenderer {
    
    private final int columna_patron;
    
    public TablaColorEstado(int col_patrol){
    this.columna_patron = col_patrol;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int row, int col){
       Font font = new Font("Tahoma", Font.BOLD, 12);
       switch(table.getValueAt(row, columna_patron).toString()){
       
           case"No activa ":
               setForeground(Color.RED);
               setFont(font);
               break;
           case"Activa":
               setForeground(Color.BLUE);
               setFont(font);
           default:
               break;
 
       
       
       }
        super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        return  this;
    }
    


    
}
