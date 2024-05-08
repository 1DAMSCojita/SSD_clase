for $libro in /bookstore
let $suma := sum($libro/book/price)
return <total> {
  $suma
} </total>