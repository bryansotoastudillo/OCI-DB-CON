/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cine.controller;

import com.mycompany.cine.modell.PeliculaDAO;
import com.mycompany.cine.modell.PeliculaDTO;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author jpver
 */
public class CineController {
    
    public boolean agregarPeliculaController(PeliculaDAO peliculaNueva, Connection conexion) throws SQLException{
    
        PeliculaDTO pelicula = new PeliculaDTO();
        
        pelicula.agregarPelicula(peliculaNueva, conexion);
        
        return true;
    }
}
