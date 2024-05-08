for $nombre in distinct-values(bailes/baile/profesor)
let $sala := bailes/baile[sala][profesor = $nombre]/sala
order by $nombre
return <profesor> {
  $nombre/string(),
  $sala/string()
} </profesor>
