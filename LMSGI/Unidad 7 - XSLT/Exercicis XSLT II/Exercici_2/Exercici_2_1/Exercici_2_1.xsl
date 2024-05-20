<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
    <museos>
        <xsl:for-each select="museos/museo">
            <museo>
                <nombre> <xsl:value-of select="@nombre"/> </nombre>
                <ciudad> <xsl:value-of select="@ciudad"/> </ciudad>
                <pais> <xsl:value-of select="@pais"/> </pais>
            </museo>
        </xsl:for-each>
    </museos>
</xsl:template>
</xsl:stylesheet>