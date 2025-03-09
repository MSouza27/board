# Board Project

## Visão Geral
Este projeto implementa um sistema de gerenciamento de quadros (boards) para organização de tarefas, semelhante a um Kanban. Ele é construído em Java, utilizando uma estrutura orientada a objetos para manipular quadros, colunas e cartões.

## Tecnologias Utilizadas
- **Java**
- **Lombok** para redução de boilerplate
- **Java Streams API** para manipulação de coleções

## Estrutura do Projeto
O projeto contém as seguintes entidades principais:

### BoardEntity
Representa um quadro contendo colunas e cartões.
- Atributos:
  - `id`: Identificador do quadro.
  - `name`: Nome do quadro.
  - `boardColumns`: Lista de colunas associadas ao quadro.
- Métodos principais:
  - `getInitialColumn()`: Retorna a coluna inicial do quadro.
  - `getCancelColumn()`: Retorna a coluna de cancelamento do quadro.
  
### BoardColumnEntity
Representa uma coluna dentro do quadro, contendo cartões e pertencendo a um quadro.
- Atributos:
  - `id`: Identificador da coluna.
  - `name`: Nome da coluna.
  - `order`: Ordem da coluna dentro do quadro.
  - `kind`: Tipo da coluna (INITIAL, FINAL, CANCEL, PENDING).
  - `board`: Referência ao quadro pai.
  - `cards`: Lista de cartões na coluna.

### BoardColumnKindEnum
Enumeração para classificação das colunas dentro do quadro.
- Tipos:
  - `INITIAL`
  - `FINAL`
  - `CANCEL`
  - `PENDING`
- Método `findByName(String name)`: Retorna o enum correspondente a um nome informado.

## Como Executar
1. Clone o repositório:
   ```sh
   git clone https://github.com/MSouza27/board.git
   ```
2. Importe o projeto para sua IDE favorita (IntelliJ, Eclipse, VS Code com extensão Java).
3. Compile e execute o projeto.

## Contribuição
Se desejar contribuir, siga estas etapas:
1. Fork o repositório.
2. Crie um branch para sua funcionalidade:
   ```sh
   git checkout -b minha-feature
   ```
3. Commit suas modificações:
   ```sh
   git commit -m "Adiciona nova funcionalidade"
   ```
4. Envie as alterações:
   ```sh
   git push origin minha-feature
   ```
5. Abra um Pull Request.

## Autor
[Magno Souza dos Santos](https://github.com/MSouza27)

## Licença
Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
