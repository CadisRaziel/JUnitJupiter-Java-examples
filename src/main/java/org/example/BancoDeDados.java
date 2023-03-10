package org.example;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
    public static void iniciarConexao(){
        //fez algo
        LOGGER.info("iniciou conexao");
    }

    public static void finalizarConexao(){
        //fez algo
        LOGGER.info("Fechou conexao");
    }

    public static void insereDados(Pessoa pessoa) {
        //insere pessoa no DB
        LOGGER.info("Inseriu no DB");
    }

    public static void removeDados(Pessoa pessoa) {
        //remove pessoa no DB
        LOGGER.info("removeu do DB");
    }
}
