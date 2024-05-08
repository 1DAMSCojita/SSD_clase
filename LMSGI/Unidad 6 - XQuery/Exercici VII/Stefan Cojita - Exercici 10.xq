for $baile in /bailes/baile[profesor = "Jesus Lozano"]
let $plaza := sum($baile/plazas)
return <plaza> {
  $plaza
} </plaza>