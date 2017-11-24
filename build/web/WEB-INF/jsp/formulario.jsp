<%@page import="util.Preguntas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    String[] preguntasHTML = Preguntas.getPreguntas();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>¿Estoy estresado?... Creo que sí</title>
    </head>
    <style>
        ol > li {
            margin-bottom: 0.5em;
        }
        form * label {
            
        }
    </style>
    <body>
        <form id="formulario" method="POST" action="index.html">
            <h3>Formulario de estres</h3>
            <ol>
                <% for (int i = 0; i < preguntasHTML.length; i++) { %>
                <li>
                    <label for="pregunta-<%out.print(i);%>"><% out.print(preguntasHTML[i]); %></label>
                    <select id="pregunta-<%out.print(i);%>" required>
                        <option value="0" disabled selected>Seleccione...</option>
                        <option value="1">Sí</option>
                        <option value="0">No</option>
                        <option value="0">No lo sé</option>
                    </select>
                </li>
                <% }%>

            </ol>

            <button type="submit">Enviar</button>
            <input type="hidden" name="preguntas" id="preguntas" value="0"/>
        </form>

        <script>
            var form = document.getElementById("formulario");

            form.onsubmit = function (e) {
                seles = document.getElementsByTagName("select");
                respuestas = 0;

                for (i = 0; i < seles.length; i++) {
                    respuestas += parseInt(seles[i].value);
                }
                
                document.getElementById("preguntas").value = respuestas;
            };
        </script>
    </body>
</html>