Feature: Busqueda en Google
  Scenario: Voy a Google y busco "Margarina"
    Given navego a google.com
    And busco Margarina
    Then veo los resultados