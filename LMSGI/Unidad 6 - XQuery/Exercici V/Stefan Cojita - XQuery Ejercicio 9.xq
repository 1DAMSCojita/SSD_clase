for $libro in /libros/libro
let $apellido := $libro/autor/apellidos
let $nombre := $libro/autor/nombre
where $apellido = "DATE" and $nombre = "C.J."
return $libro/titulo/string()