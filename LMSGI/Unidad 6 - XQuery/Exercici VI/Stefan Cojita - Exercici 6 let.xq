for $libro in /bookstore/book
let $año := $libro/year
return <publicacion> {
  $año/string()
} </publicacion>