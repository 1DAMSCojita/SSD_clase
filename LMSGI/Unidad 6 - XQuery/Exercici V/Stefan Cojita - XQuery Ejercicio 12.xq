for $libro in /libros/libro
where (exists($libro/editorial))
return $libro/titulo/string()