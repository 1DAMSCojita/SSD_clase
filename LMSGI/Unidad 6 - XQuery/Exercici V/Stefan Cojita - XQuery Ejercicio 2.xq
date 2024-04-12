for $libro in //libros/libro
let $autor := $libro/autor
where count($autor) > 1
return $libro/titulo