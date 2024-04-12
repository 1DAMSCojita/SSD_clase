for $libro in /libros/libro
let $apellido := $libro/autor/apellidos
let $nombre := $libro/autor/nombre
where $apellido = "Alarcon" and $nombre = "P."
return $libro/titulo/string()