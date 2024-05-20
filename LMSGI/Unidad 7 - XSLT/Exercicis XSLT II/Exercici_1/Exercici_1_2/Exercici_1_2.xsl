<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
    <museos>
        <xsl:for-each select="museos/museo">
            <museo>
                <nombre> <xsl:value-of select="nombre"/> </nombre>
                <ubicacion>
                    <xsl:attribute name="ciudad"> <xsl:value-of select="ciudad"/> </xsl:attribute>
                    <xsl:attribute name="pais"> <xsl:value-of select="pais"/> </xsl:attribute>
                </ubicacion>
            </museo>
        </xsl:for-each>
    </museos>
</xsl:template>
</xsl:stylesheet>