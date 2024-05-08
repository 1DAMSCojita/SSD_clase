for $libro in /bookstore/book
where starts-with($libro/@category, 'C')
return $libro