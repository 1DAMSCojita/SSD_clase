for $libro in /bookstore/book
order by $libro/@category, $libro/title
return <orden> {
  $libro/string()
} </orden>

