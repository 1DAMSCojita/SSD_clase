for $baile in bailes/baile
where ($baile/precio > 30 and $baile/precio/@moneda = "euro")
return $baile/nombre/string()