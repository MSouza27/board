package br.com.projetos.Board.persistence.entity;

import lombok.Data;

@Data
public class CardEntity {

    private Long id;
    private String title;
    private String description;
    private BoardColumnEntity boardColumnEntity = new BoardColumnEntity();

}
