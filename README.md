# Desafio Deal Java RESTful API com Spring Boot
Java RESTful API criada com Spring Boot.

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        +String name
        +String avatar
        +int level
        +int experience
        +int abilities
        +int projects
        +int articles
        +Program[] programs
        +News[] news
        +Recommendation[] recommendations
    }

    class Program {
        +String name
        +String icon
    }

    class News {
        +String image
        +String link
    }

    class Recommendation {
        +String type
        +String name
        +String icon
        +String technology
    }

    User "1" --> "*" Program
    User "1" --> "*" News
    User "1" --> "*" Recommendation
``` 
