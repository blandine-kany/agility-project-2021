Feature: US_01 Annulation et scenario

  En tant que réalisateur
  Je souhaite avoir la possibilité de supprimer des adaptations d’un scénario donné
  Afin de prendre en compte les annulations de la création des films qui ont découle

  Scenario Outline: suppression d'une adaptation d'un scenario
    Given un scenario qui est nommé <origTitle>
    And le scenario comprend un film avec un <title1> et un <director1>
    And le scenario comprend un film avec un <title2> et un <director2>
    When le réalisateur supprime une adaptation d'un scenario donné
    Then le système met à jour les informations du scenario (nombre d'adaptations du scenario: <result>).

    Examples:
      | origTitle             | title1                           | director1        | title2                    | director2           |  result |
      | "Harry Potter"        | "And Philosopher's Stone"        | "David Lynch"    | "And Hedwig"              | "Denis Villeneuve"  | 1       |
      | "Matrix"              | "Matrix"                         | "Chris Columbus" | "The end of Neo"          | "Dan Mazer"         | 1       |
