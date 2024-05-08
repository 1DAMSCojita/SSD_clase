for $libro in /bookstore
let $cantidad := count($libro/book)
return <total> {
  $cantidad
} </total>