for $libro in /bookstore/book
let $caracteres := $libro/title/string-length()
return <libro> {
  $libro/title/string()
} <caracteres> {$caracteres} </caracteres> </libro> 