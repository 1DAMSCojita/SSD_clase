<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
    <html>
        <body>
            <h1> <xsl:value-of select="ies/@nombre"/> </h1>
            <p> Página web: <a> <xsl:attribute name="href"> <xsl:value-of select="ies/@web"/> </xsl:attribute> <xsl:value-of select="ies/@web"/> </a> </p>
            <xsl:for-each select="ies/ciclos/ciclo">
                <ul>
                    <li><xsl:value-of select="nombre"/></li>
                </ul>
            </xsl:for-each>
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>