for $libro in /libros/libro
where not (exists($libro/editorial))
return $libro/titulo/string()