/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hoytsmarkplanet;

import com.mycompany.hoytsmarkplanet.view.AgregarPelicula;
import java.sql.SQLException;

/**
 *
 * @author marcos
 */
public class HoytsMarkPlanet {

    public static void main(String[] args) throws SQLException {
       
        AgregarPelicula ventana = new AgregarPelicula();
        ventana.setVisible(true);
    }
}
