<?php
$doc = new DomDocument();
$doc->load("setB2.xml");
echo "<h2>MOVIE INFO</h2>";
$MovieTitle = $doc->getElementsByTagName('MovieTitle');
$ActorName = $doc->getElementsByTagName('ActorName');

echo "<br><b>Movie Titles:</b>";
foreach ($MovieTitle as $Mt) {
    echo "<br>" . $Mt->textContent;
}
echo "<br><br><b>Actor Names:</b>";
foreach ($ActorName as $AN) {
    echo "<br>" . $AN->textContent;
}
