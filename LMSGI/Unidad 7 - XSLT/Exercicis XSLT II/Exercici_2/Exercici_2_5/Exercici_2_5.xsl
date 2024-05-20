<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
    <lugares>
        <xsl:for-each select="museos/museo">
            <lugar tipo="museo">
                <ubicacion name="ciudad"> <xsl:value-of select="@ciudad"/> </ubicacion>
                <ubicacion name="pais"> <xsl:value-of select="@pais"/> </ubicacion>
                <nombre> <xsl:value-of select="@nombre"/> </nombre>
            </lugar>
        </xsl:for-each>
    </lugares>
</xsl:template>
</xsl:stylesheet>