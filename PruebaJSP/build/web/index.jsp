<<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Prueba</title>
    </head>
    <body>
        <h1>Datos de la persona</h1>
        <form action="SvPersona" method="POST">
            <p><label>Dni: </label> <input type="text" name="dni"></p>
            <p><label>Nombre: </label> <input type="text" name="nombre"></p>
            <p><label>Apellido: </label> <input type="text" name="apellido"></p>
            <p><label>Telefono: </label> <input type="text" name="telefono"></p>
            <button type="submit">Enviar</button> 
        </form>
        <h1>Ver lista de Personas</h1>
        <p>Si deseas ver todas las personas haga click en el boton mostrar personas</p>
        <form action="SvPersona" method="GET">
            <button type="submit">Mostrar personas</button>
        </form>
        <h1>Eliminar personas</h1>
        <p>Ingrese el Id de la persona a eliminar</p>
        <form action="SvEliminar" method="POST">
            <p><label>Id: </label> <input type="text" name="id_eliminar"></p>
            <button type="submit">Eliminar</button>
        </form>
    </body>
</html>
