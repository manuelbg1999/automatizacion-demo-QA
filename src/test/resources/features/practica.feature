#Language Es


  Feature: Como usuario quiero
           ingresar a demo qa
           para llenar el formulario de practica

    @practica
  Scenario: Ingresar a la pagina
     Given que estoy en la pagina de QA
     When  llene el formulario con los siguientes datos
       |fullname|email|currentaddress|permanetaddress|
       |manuel bolano|manuelbg1999@gmail.com|cerete|cerete|
     Then se me lista los datos ingresados en la pagina con el texto
       |texto|
       |Text Box|

    @practica2
    Scenario: Ingresar a la pagina demo QA
      Given Dado que ingreso al enlace
      When  le doy click en el boton text box
      Then veo el siguiente texto
        |texto2|
        |Text Box|





