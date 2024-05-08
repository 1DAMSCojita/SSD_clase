for $libro in /bookstore/book
return <html>
  <head>
  </head>
  <body>
    <table>
      <tr>
        <td> {$libro/title/string()} </td>
      </tr>
    </table>
  </body>
</html>