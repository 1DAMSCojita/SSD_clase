for $libro in /bookstore/book
let $titulo := $libro/title
let $precio := $libro/price
let $precioIVA := 1.04 * $precio
order by $precioIVA
return <resultado> { 
  $titulo,
  $precio,
  $precioIVA
} </resultado>