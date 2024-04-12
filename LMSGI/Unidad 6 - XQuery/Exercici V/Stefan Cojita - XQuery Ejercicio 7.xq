for $libro in /libros/libro
let $titulo := $libro/titulo
return <resultado> {
  "El libro",
  $titulo/string(),
  "tiene de autor",
  $libro/autor[1]/string(),
  if(count($libro/autor) > 1) then "et. AI"
  else ""
} </resultado>