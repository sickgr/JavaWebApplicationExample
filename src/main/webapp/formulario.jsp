<!-- formulario.jsp -->
<html>
<head>
    <title>Formulario desde JSP</title>
</head>
<body>
    <h2>Servlet1 - Formulario</h2>
    <form action="myServlet2" method="GET">
        <label for="fname">Nombre:</label><br>
        <input type="text" id="fname" name="fname"><br><br>

        <label for="lname">Apellido:</label><br>
        <input type="text" id="lname" name="lname"><br><br>

        <input type="submit" value="Enviar">
    </form>
</body>
</html>
