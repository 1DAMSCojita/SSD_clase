for $baile in bailes/baile 
let $nombreempieza := starts-with($baile/profesor, "Laura")
return <beneficio> {
  $baile/plazas * $baile/precio
} </beneficio>