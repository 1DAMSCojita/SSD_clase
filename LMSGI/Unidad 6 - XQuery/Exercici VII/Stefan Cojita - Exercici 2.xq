for $baile in bailes/baile
let $nombre := $baile/nombre
let $plazas := $baile/plazas
return <losbailes> {
  $nombre/string(),
  "(", $plazas/string(), ")"
} </losbailes>