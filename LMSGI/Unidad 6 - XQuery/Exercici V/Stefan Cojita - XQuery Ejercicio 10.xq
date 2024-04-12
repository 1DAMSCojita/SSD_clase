for $libro in /libros/libro
return <resultado> { 
  if ($libro/titulo = "Bases de Datos") {
    "El libro ",
    $libro/@id/string(),
    "de titulo",
    $libro/titulo/string(),
    "su editorial es ",
    $libro/editorial/string(),
    ". Fue hecho en el año ",
    $libro/año/string(),
    "y su precio es de",
    $libro/precio/string()
  } else {
    ""
  }
} </resultado>