<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
    <html>
        <body>
            <h1> <xsl:value-of select="ies/@nombre"></xsl:value-of> </h1>
            <p> Página web: <a> <xsl:attribute name="href"> <xsl:value-of select="ies/@web"/> </xsl:attribute> <xsl:value-of select="ies/@web"/> </a> </p>
            <table border="1"> 
                <xsl:for-each select="ies/ciclos/ciclo">
                    <tr>
                        <th> Nombre del ciclo </th>
                        <th> Grado </th>
                        <th> Año del título </th>
                    </tr>
                    <tr>
                        <td> <xsl:value-of select="nombre"/> </td>
                        <td> <xsl:value-of select="grado"/> </td>
                        <td> <xsl:value-of select="decretoTitulo/@año"/> </td>
                    </tr>
                </xsl:for-each>
            </table>
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>