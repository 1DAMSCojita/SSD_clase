for $libro in //libros/libro
let $numeroAutores := count($libro/autor)
return <resultado> {
  "El libro",
  $libro/@id/string(),
  "tiene",
  $numeroAutores,
  "autores."
} </resultado>