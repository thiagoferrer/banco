package org.example.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFatory {

    private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";

    private static final String USUARIO = "rm554460";

    private static final String SENHA = "fiap100786";

    //Método para obter uma conexão com o banco de dados

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
