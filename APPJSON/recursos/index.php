<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Multicines</title>
    <link rel="stylesheet" type="text/css" href="./recursos/php.css">
</head>
<body>

<div align="center">
<h1>Cartelera Multicines</h1>
<img class="d-block w-100" src="../recursos/cine.jpg" height="300px" width="700px" alt="cine">
</div>

<?php

$url="https://carlosisma.github.io/JsonCartelera/multicines.json";


 $miVar=file_get_contents($url);


$decodjson = json_decode($miVar);



echo "<br>";

foreach ($decodjson as $p) 
	{
    
    echo "ID: ".$id = $p->id;
    echo "<br>";

    echo "Título: ".$titulo = $p->titulo;
    echo "<br>";

    echo "Género: ".$genero = $p->genero;
    echo "<br>";

    echo "Idioma: ".$idioma = $p->idioma;
    echo "<br>";

    echo "Duración: ".$duracion = $p->duracion;
    echo "<br>";

    echo "Calificación: ".$calificacion = $p->calificacion;
    echo "<br>";

    echo "Resúmen: ".$resumen = $p->resumen;
    echo "<br>";

    echo "Año Producción: ".$anioProduccion = $p->anioProduccion;
    echo "<br>";

    echo "Formato: ".$formato = $p->formato;
    echo "<br>";

    echo "Director: ".$director = $p->director;
    echo "<br>";

    echo "Clasificación: ".$clasificacion = $p->clasificacion;
    echo "<br>";

        $con = mysqli_connect("mysql-carloslucero.alwaysdata.net", "211859", "Carlos2606624") or die("Sin conexion");
        
        mysqli_set_charset($con, "utf8");

        mysqli_select_db($con, "carloslucero_marvel");
		
        $consulta  = "INSERT INTO multicines (id, titulo,genero,idioma,duracion,calificacion,resumen,anioProduccion,formato,director,clasificacion) VALUES 
									('$id', '$titulo', '$genero', '$idioma', '$duracion', '$calificacion', '$resumen', '$anioProduccion', '$formato', '$director', '$clasificacion');";
        $resultado = mysqli_query($con, $consulta);  
        echo "<br>";     
    
}

?>
</body>
</html>
