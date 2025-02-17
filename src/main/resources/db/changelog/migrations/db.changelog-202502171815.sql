-- liquibase formatted sql
-- changeset magno:202502171815
-- comment: cards table create
CREATE TABLE CARDS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    `order` int NOT NULL,
    board_column_id BIGINT NOT NULL,
    CONSTRAINT boards_boards_cards_fk FOREIGN KEY (board_id) REFERENCES BOARDS(id) ON DELETE CASCADE,
) ENGINE = InnoDB;

-- rollback DROP TABLE BOARDS_COLUMNS;