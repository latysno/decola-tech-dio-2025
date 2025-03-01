# API de Cadastro de Personagens de RPG

Esta API RESTful foi criada para gerenciar o cadastro e o gerenciamento de personagens de RPG, adaptando o conceito original da Decola Tech DIO para um universo fantástico de aventura e estratégia.

## Principais Tecnologias
- **Java 17**: Aproveite os recursos mais modernos da versão LTS do Java para desenvolvimento robusto e escalável.
- **Spring Boot 3**: Simplifica a criação e configuração de aplicações Java com autoconfiguração inteligente, acelerando o desenvolvimento.
- **Spring Data JPA**: Facilita a integração e o acesso aos dados com bancos SQL, reduzindo a complexidade do acesso a dados.
- **OpenAPI (Swagger)**: Gera uma documentação interativa e completa da API, facilitando o consumo e a manutenção.
- **Railway**: Plataforma para deploy e monitoramento em nuvem, oferecendo pipelines de CI/CD e suporte a diversos bancos de dados como serviço.

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
  class RPGCharacter {
    -String name
    -CharacterSheet characterSheet
    -Equipment equipment
    -Ability[] abilities
    -Quest[] quests
  }
  class CharacterSheet {
    -String race
    -String characterClass
    -Integer level
    -Integer experience
  }
  class Equipment {
    -String name
    -Number attackPower
  }
  class Ability {
    -String icon
    -String description
  }
  class Quest {
    -String icon
    -String description
  }
  
  RPGCharacter "1" *-- "1" CharacterSheet
  RPGCharacter "1" *-- "1" Equipment
  RPGCharacter "1" *-- "N" Ability
  RPGCharacter "1" *-- "N" Quest
