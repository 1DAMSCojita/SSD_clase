for $autores in distinct-values(/bookstore/book/author)
order by string-length($autores) descending
return $autores