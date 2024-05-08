for $libro in /bookstore
let $año := distinct-values($libro/book/year)
return <año> { 
  $año
} </año>
