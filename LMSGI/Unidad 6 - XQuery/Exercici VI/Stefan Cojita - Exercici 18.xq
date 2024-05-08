for $libro in /bookstore/book
where contains($libro/title, 'X') or contains($libro/title, 'x')
return $libro