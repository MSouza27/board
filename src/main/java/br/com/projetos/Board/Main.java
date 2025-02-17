package br.com.projetos.Board;

import br.com.projetos.Board.persistence.migration.MigrationStrategy;

import java.sql.SQLException;

import static br.com.projetos.Board.persistence.config.ConnectionConfig.getConnection;

public class Main {

    public static void main(String[] args) {
        try (var connection = getConnection()) {
            new MigrationStrategy(connection).executeMigration();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

