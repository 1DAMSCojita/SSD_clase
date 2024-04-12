for $libro in /libros/libro
where $libro/precio > 50
return <respuesta> {
  $libro/titulo/string(),
  $libro/editorial/string()
} </respuesta>