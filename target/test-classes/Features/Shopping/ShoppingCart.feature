# language: es

  Característica: Se agregaran productos al carrito
    de compras y se comparara el precio

    @Test
    Escenario: Agregar productos al Carrito y comparar el precio
      Dado Que ingreso a la pagina de productos
      Cuando Agrego los productos al carrito
      Entonces Comparo el precio de la suma de los cursos seleccionados