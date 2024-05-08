for $libro in /bookstore
let $precio := $libro/book/price
let $suma := sum($libro/book/price)
return <precios> {
  $precio/string()
} <suma> {$suma} </suma> </precios>