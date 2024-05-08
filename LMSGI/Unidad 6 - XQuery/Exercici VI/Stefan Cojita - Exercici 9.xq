for $libro in /bookstore
let $titulo := $libro/book/title
let $cantidad := count($libro/book)
return <libros> {
  $titulo/string()
} <total> {$cantidad} </total> </libros>