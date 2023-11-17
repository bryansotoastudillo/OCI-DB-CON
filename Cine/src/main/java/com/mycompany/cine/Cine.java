/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cine;

import com.mycompany.cine.view.AgregarPelicula;
import java.sql.SQLException;



/**
 *
 * @author jpver
 */
public class Cine {

        public static void main(String[] args) throws SQLException {
       
        AgregarPelicula ventana = new AgregarPelicula();
        ventana.setVisible(true);
    }
}
