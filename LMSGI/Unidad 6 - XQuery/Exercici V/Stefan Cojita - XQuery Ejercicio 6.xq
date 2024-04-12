for $libro in //libros/libro
let $titulo := $libro/titulo
let $numeroAutores := count($libro/autor)
return <resultado> {
  "El libro",
  $libro/@id/string(),
  ", de titulo",
  $titulo/string(),
  "tiene",
  $numeroAutores,
  "autor/es."
} </resultado>