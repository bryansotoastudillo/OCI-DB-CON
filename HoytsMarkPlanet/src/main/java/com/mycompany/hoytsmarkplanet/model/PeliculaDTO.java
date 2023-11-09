/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoytsmarkplanet.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author marco
 */
public class PeliculaDTO {
    public boolean agregarPelicula(PeliculaDAO peliculaNueva, Connection conexion) throws  SQLException{
        
        String queryStatement = "INSERT INTO "+conexion.getSchema()+".PELICULA (TITULO,DIRECTOR,ANNIO,DURACION,GENERO) VALUES (?,?,?,?,?)";
        
        System.out.println(queryStatement);
        
        PreparedStatement ps = conexion.prepareStatement(queryStatement);
        
        
        ps.setString(1, peliculaNueva.getTitulo());
        ps.setString(2, peliculaNueva.getDirector());
        ps.setInt(3, peliculaNueva.getAnnio());
        ps.setInt(4, peliculaNueva.getDuracion());
        ps.setString(5, peliculaNueva.getGenero());
        
        int cantidad = ps.executeUpdate();
        
        System.out.println("Cantidad de filas insertadas: "+cantidad);
        
        return true;
    }
    
}
