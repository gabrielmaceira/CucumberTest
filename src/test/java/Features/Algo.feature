Feature: Busqueda en Google
  Scenario: Voy a Google y busco "Margarina"
    Given navego a google.com
    And busco Margarina
    Then veo los resultados

  Scenario Outline: Voy a Google y busco informacion
    Given navego a google.com
    And busco el texto <texto>
    Then veo los resultados
    Examples:
      |texto|
      |manteca|
      |oregano  |
      |perejil  |