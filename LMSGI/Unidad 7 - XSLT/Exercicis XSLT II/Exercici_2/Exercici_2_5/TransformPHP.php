<?php
// Load XML file
$xml = new DOMDocument;
$xml->load('Exercici_2_5.xml');

// Load XSL file
$xsl = new DOMDocument;
$xsl->load('Exercici_2_5.xsl');

// Configure the transformer
$proc = new XSLTProcessor;

// Attach the xsl rules
$proc->importStyleSheet($xsl);

echo $proc->transformToXML($xml);
?> 