Feature: : Realizar Consultas
  Background:
    Given que la web de Conduit esta disponible
    When me logueo con mis credenciales

    Scenario: Realizar un registro
      When realizo el registro de un nuevo articulo
      Then el articulo agregado se mostrara en el Home

    Scenario: Realizar un comentario en el articulo
      When se selecciona el nuevo registro
      Then realizo el comentario del registro seleccionado
      And guardo el comentario realizado al registro

    Scenario: Realizar la eliminacion de un comentario
      When se selecciona el registro de un articulo
      Then realizo la eliminacion del comentario
      And regresar a la vista principal

    Scenario: Realizar la eliminacion de un articulo
      When se selecciona el articulo
      Then realizo la eliminacion del articulo