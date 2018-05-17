package com.example.arnoldo.patronfactory;

import android.widget.Toast;

/**
 * Created by arnoldo on 17/05/18.
 */

public class Factory {
    protected String tipo;



    public Factory(String t){//constructor de la clase que resive un string
     this.tipo=t;//le asignamos a la variable tipo lo el parametro del contructor

    }
    //Retorna la conexion especifica
    public Conexion creaConexion() {
        //metodo para crear la conexion y validar que conexion es
        if (tipo.equalsIgnoreCase("Oracle")) {
            return new OracleConexion();
            //clase que tiene implementada el tipo de conexion
        }else
            if (tipo.equalsIgnoreCase("MySql")) {
                return new MySqlConexion();
            }
            else
            if (tipo.equalsIgnoreCase("SqlServer")) {
                return new SqlServerConexion();
            }
            else if (tipo.isEmpty()){ //en caso de que no los escribamos correctamente no retornara nada
               return  new ValorNulo();
            }else
                return new ErrorConexion();



    }

}
