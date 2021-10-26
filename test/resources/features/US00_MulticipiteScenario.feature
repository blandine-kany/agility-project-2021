Feature: US_00 Multiplicité et scenario

  En tant que réalisateur
  Je souhaite avoir la possibilité de faire jouer un scénario par différents films
  Afin qu’un scenario puisse avoir une ou plusieurs adaptations.

  Scenario Outline: adaptations multiples d’un scenario
    Given un scenario qui est nommé <origTitle>
    And une liste des films <listFilm>
    And la liste comprend un film avec un <title1> et un <director1>
    And la liste comprend un film avec un <title2> et un <director2>
    When le réalisateur crée des adaptations pour le scenario donné
    Then le système met à jour les informations du scenario (nombre d'adaptations du scenario: <result>).

  Examples:
    | origTitle     | title1               | director1        | title2                   | director2           |  result |
    | "Dune"        | "Dune (1984)"        | "David Lynch"    | "Dune (2021)"            | "Denis Villeneuve"  | 2       |
    | "Home Alone"  | "Home Alone (1990)"  | "Chris Columbus" | "Home Sweet Home Alone"  | "Dan Mazer"         | 2       |


  Scenario Outline: refus doublon d'un film
    Given un scenario qui est nommé <origTitle>
    And une liste des films <listFilm>
    And la liste comprend un film avec un <title1> et un <director1>
    And la liste comprend un film avec les mêmes informations que le précedent
    When le réalisateur crée des adaptations pour le scenario donné
    Then le système réfuse d'ajouter les films avec les mêmes informations qu'une adaptation existante du scenario donné (nombre d'adaptations du scenario:<result>).

  Examples:
    | origTitle         | title1           | director1            |  result |
    | "Shutter Island"  | "Shutter Island" | "Martin Scorsese"    |  1      |
    | "Inception"       | "Inception"      | "Christopher Nolan"  |  1      |