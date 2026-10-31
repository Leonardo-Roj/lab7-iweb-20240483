package pe.edu.pucp.iweb.lab7.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import pe.edu.pucp.iweb.lab7.beans.Sede;

public class SedeDao extends BaseDao{ // TODO 2a: debe heredar de BaseDao

    /**
     * Ejercicio 2c: retorna todas las sedes ordenadas por nombre.
     */
    public ArrayList<Sede> listar() throws SQLException, ClassNotFoundException {
        ArrayList<Sede> lista = new ArrayList<>();
        // TODO 2c
        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from sede");){}
        return lista;
    }

    /**
     * Apoyo para el Ejercicio 4: retorna la sede con el id indicado,
     * o null si no existe.
     */
    public Sede buscarPorId(int idSede) {
        // TODO 4
        return null;
    }
}
