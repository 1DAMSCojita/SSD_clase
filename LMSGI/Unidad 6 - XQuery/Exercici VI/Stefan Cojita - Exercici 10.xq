for $libro in /bookstore
let $precio_minimo := min($libro/book/price)
let $precio_maximo := max($libro/book/price)
return <resultado> {
  "Precio mínimo:",
  $precio_minimo,
  "Precio máximo: ",
  $precio_maximo
} </resultado>