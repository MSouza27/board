package br.com.projetos.Board.dto;

import br.com.projetos.Board.persistence.entity.BoardColumnKindEnum;

public record BoardColumnIdOrderDTO(Long id, int order, BoardColumnKindEnum kind) {
}
