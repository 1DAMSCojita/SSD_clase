<?php
// Load XML file
$xml = new DOMDocument;
$xml->load('Exercici_1_4.xml');

// Load XSL file
$xsl = new DOMDocument;
$xsl->load('Exercici_1_4.xsl');

// Configure the transformer
$proc = new XSLTProcessor;

// Attach the xsl rules
$proc->importStyleSheet($xsl);

echo $proc->transformToXML($xml);
?> 