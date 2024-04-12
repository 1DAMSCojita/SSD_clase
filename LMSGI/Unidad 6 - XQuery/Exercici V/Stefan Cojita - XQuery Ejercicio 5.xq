for $libro in //libros/libro
let $titulo := $libro/titulo
let $numeroAutores := count($libro/autor)
return <resultado> {
  "El libro",
  $titulo/string(),
  "tiene",
  $numeroAutores,
  "autor/es."
} </resultado>