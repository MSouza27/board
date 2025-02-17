-- liquibase formatted sql
-- changeset magno:202502171348
-- comment: Create the BOARDS table
CREATE TABLE BOARDS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
) ENGINE = InnoDB;

-- rollback DROP TABLE BOARDS;