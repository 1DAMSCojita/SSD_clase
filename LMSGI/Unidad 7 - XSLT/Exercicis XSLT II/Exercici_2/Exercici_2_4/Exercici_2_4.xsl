<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
    <paises>
        <xsl:for-each select="museos/museo">
            <pais>
                <xsl:attribute name="nombre"> <xsl:value-of select="@pais"/> </xsl:attribute>
                <ciudad>
                    <xsl:attribute name="nombre"> <xsl:value-of select="@ciudad"/> </xsl:attribute>
                    <museo>
                        <xsl:attribute name="nombre"> <xsl:value-of select="@nombre"/> </xsl:attribute>
                    </museo>
                </ciudad>
            </pais>
        </xsl:for-each>
    </paises>
</xsl:template>
</xsl:stylesheet>