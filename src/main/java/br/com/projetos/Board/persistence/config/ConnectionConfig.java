package br.com.projetos.Board.persistence.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ConnectionConfig {

    public static Connection getConnection() throws SQLException {
        var url = "jdbc:mysql://localhost:3306/board"; // Adicionei a porta do MySQL para evitar problemas
        var user = "root";
        var password = "Tm@100822";
        var connection = DriverManager.getConnection(url, user, password);
        connection.setAutoCommit(false);
        return connection;
    }
}

