/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo8.accesoADatos;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo8.entidades.Alumno;
import universidadgrupo8.entidades.Materia;

public class MateriaData {
    
    private Connection con=null;

    public MateriaData() {
        con=Conexion.getconexion();
    }
    
   public void guardarMateria(Materia materia){
       
       String sql= "Insert INTO materia (nombre, anio, estado)"
               + "Values(? ,? ,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                
                materia.setIdMateria(rs.getInt(1)); //aqui le asignamos el keys como Id, se lo paso por rs.getInt(1) por ser un entero 
                                                  //y le paso el numero de columna donde estan los Id.
                JOptionPane.showMessageDialog(null, "Materia agregado");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
        }
   }
   
       public Materia buscarMateria (int Id){  //buscar Alumno por id
        
        Materia materia=null;
                
            String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno "
                    + "WHERE idAlumno=? AND estado=1";
        try {    
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                
                materia = new Materia();
                materia.setIdMateria(Id);
                materia.setNombre(rs.getString("nombre"));
                materia.setActivo(true);             
                
            }else{                
                JOptionPane.showMessageDialog(null, "No existe la materia ");               
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia");
       
        }
        
        return materia;
    } 
       
         public void modificarMateria(Materia materia){
        
        String sql = "UPDATE materia SET nombre=?, WHERE IdMateria=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getIdMateria());
            
            int exito = ps.executeUpdate();
            if (exito==1){
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a tabla materia");
        }
        
    }
         
            public void eliminarMateria(int Id){
        
        String sql = "UPDATE materia SET estado=0 WHERE IdMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Id);
            int exito = ps.executeUpdate(sql);
            if (exito==1){
                JOptionPane.showMessageDialog(null, "Materia eliminada");
            }                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia");  
        }                
    }
            
          public List<Materia> listarMateria(){  
         
                
        
            String sql = "SELECT idMateria, nombre FROM materia WHERE estado=1";
                        
            ArrayList<Materia> materias = new ArrayList<>();
        try {    
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setActivo(true);             
                
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia");
        }
        return materias;
    }
        public Materia getMateriaPorId(int id) {
        Materia materia = null;
        try {
            String sql = "SELECT * FROM materia WHERE idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int idMateria = rs.getInt("idMateria");
                String nombre = rs.getString("nombre");
                int anioMateria = rs.getInt("anio");
                boolean activo = rs.getBoolean("estado");
                materia = new Materia(idMateria, nombre, anioMateria, activo);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia");
        }
        return materia;
    }
       
} 
    


