for $baile in bailes/baile
let $comienzo := $baile/comienzo
where contains($comienzo, "/1/")
return <baile> {
  $baile/nombre/string(),
  $comienzo/string()
} </baile>