for $baile in /bailes/baile
let $nombre := $baile/nombre
order by $nombre
return <baile> {
      $nombre/string(),
      $baile/precio/string(),
      <fam_numerosa>{$baile/precio * 0.85}</fam_numerosa>
} </baile>