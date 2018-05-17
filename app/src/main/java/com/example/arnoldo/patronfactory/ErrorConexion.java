package com.example.arnoldo.patronfactory;

/**
 * Created by arnoldo on 17/05/18.
 */

public class ErrorConexion extends Conexion {
    @Override
    public String descripcion() {
        return "Ingresa el nombre de una base de datos que exista; mysql,oracle,o sqlServer";
    }
}
