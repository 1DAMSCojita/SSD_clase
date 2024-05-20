<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
    <ciudades>
        <xsl:for-each select="museos/museo">
            <ciudad>
                <xsl:attribute name="nombre"> <xsl:value-of select="ciudad"/> </xsl:attribute>
                <xsl:attribute name="pais"> <xsl:value-of select="pais"/> </xsl:attribute>
                <museo> <xsl:value-of select="nombre"/> </museo>
            </ciudad>
        </xsl:for-each>
    </ciudades>
</xsl:template>
</xsl:stylesheet>