for $baile in bailes/baile
let $nombre := $baile/profesor
let $sala := $baile/sala
order by $sala descending
return <baile> {
  $nombre/string(),
  $sala/string()
} </baile>