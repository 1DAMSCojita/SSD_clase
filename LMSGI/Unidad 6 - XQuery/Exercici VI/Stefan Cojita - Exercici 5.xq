for $libro in /bookstore/book
let $titulo := $libro/title
let $autor := $libro/author
where ($libro/year = 2005)
return <lib2005> {
  $titulo/string(),
  $autor/string()
} </lib2005>