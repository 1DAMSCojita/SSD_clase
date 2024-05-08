for $libro in /bookstore/book
let $titulo := $libro/title
let $autores := count($libro/author)
return <libro> {
  $titulo/string(), "(",$autores,")"
} </libro>