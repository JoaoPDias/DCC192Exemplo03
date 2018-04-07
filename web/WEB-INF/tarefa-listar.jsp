

<%@page import="java.util.List"%>
<%@page import="modelos.Tarefa"%>
<%@page import="modelos.ListadeTarefa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Tarefas</h1>
        <table>
            <thead>
            <th>Título</th>
            <th>Descrição</th>
            <th>Concluída</th>

        </thead>
        <tbody>
            <%
                for (Tarefa tarefa : (List<Tarefa>) request.getAttribute("tarefas")) {
            %>
            <tr>

                <td><%=tarefa.getTitulo()%></td>
                <td><%=tarefa.getDescricao()%></td>
                <td><%=tarefa.getConcluida()%></td>

            <tr>
                <%}%>
        </tbody>
        <tfoot>
        <a href="nova.html">Nova Tarefa</a>
    </tfoot>
</table>
</body>
</html>
