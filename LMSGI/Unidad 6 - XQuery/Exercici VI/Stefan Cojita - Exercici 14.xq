for $libro in /bookstore
let $titulo := $libro/book/title
let $autores := count($libro/book/author)
return <titulo> {
  $titulo/string() 
} <autores> {$autores} </autores> </titulo>