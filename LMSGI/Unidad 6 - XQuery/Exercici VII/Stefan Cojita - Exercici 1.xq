for $baile in bailes/baile
let $nombre := $baile/nombre
return <losbailes> { 
  $nombre/string()
} </losbailes> 

