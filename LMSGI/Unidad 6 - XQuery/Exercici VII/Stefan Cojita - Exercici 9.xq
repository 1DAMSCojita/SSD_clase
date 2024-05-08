for $baile in /bailes/baile[sala=1]
let $suma := sum($baile/precio)
return <suma> {
  $suma
} </suma>