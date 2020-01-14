#language: es
#autor: Andres Ramirez
Característica: Agregar producto a carro de compras
  Yo Como usuario de plazavea
  Quiero buscar un producto y agregarlo al carro de compras
  Para posteriormente lograr realizar la compra de los productos

  Escenario: Buscar un producto y agregarlo al carro de compras
    Dado que el usuario se encuentra en la pagina plazavea
    Cuando  en el buscador busca 'Televisor'
    Y  agrega el producto al carrito de compra
    Entonces  se visualiza el producto 'Televisor' en el carrito de compra