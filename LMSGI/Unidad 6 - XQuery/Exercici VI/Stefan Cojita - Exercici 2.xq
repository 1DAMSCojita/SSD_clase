for $libro in /bookstore/book
where $libro/price <= 30
return <resultado> { 
  if ($libro/price <= 30){
    $libro/title/string()
  } else {
    ""
  }
} </resultado>