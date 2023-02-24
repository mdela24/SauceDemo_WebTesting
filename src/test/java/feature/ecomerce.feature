Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Ingresar login exitoso y fallido
    Given ingresamos el usuario <usuario> y la contraseña <contraseña>
    Then Ingresamos a la pagina principal

    Examples: 
      | usuario         | contraseña      | 
      | "standard_user" | "secret_sauces" | 
      | "standard_user" | "secret_sauce"  | 


  @tag2
  Scenario Outline: agregar productos al carro
    Given ingresamos el usuario <usuario> y la contraseña <contraseña>
    And Ingresamos a la pagina eccomerce y agregamos todos los productos al carro
    When ingresamos al carro de compras 
    And ingresamos el nombre <nombre>, el ultimo nombre <ultimoNombre> y el codigo postal <cPostal>
    When paganos los productos
    Then  reseteamos los datos del carro y nos deslogueamos

    Examples: 
      | usuario         | contraseña     | nombre    | ultimoNombre | cPostal   |
      | "standard_user" | "secret_sauce" | "Emerson" | "Carlos"     | "8240000" |
