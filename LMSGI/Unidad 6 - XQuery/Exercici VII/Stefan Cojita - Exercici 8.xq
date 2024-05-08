for $baile in bailes/baile
let $media := avg($baile/precio)
return <bailemedia> {
  $media
} </bailemedia>