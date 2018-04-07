package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.ListadeTarefa;
import modelos.Tarefa;

@WebServlet(name = "TarefaServlet", urlPatterns = {"/listar.html", "/nova.html"})
public class TarefaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if ("/listar.html".equals(request.getServletPath())) {
            listarTarefas(response, request);
        } else if ("/nova.html".equals(request.getServletPath())) {
            criarFormTarefa(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titulo = req.getParameter("titulo");
        String descricao = req.getParameter("descricao");
        Tarefa tarefa = new Tarefa(titulo, descricao);
        ListadeTarefa.getInstance().add(tarefa);
        resp.sendRedirect("listar.html");
    }
    
    

    private void listarTarefas(HttpServletResponse response, HttpServletRequest request) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        List<Tarefa> tarefas = ListadeTarefa.getInstance();
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/tarefa-listar.jsp");
        request.setAttribute("tarefas", tarefas);
        despachante.forward(request, response);
    }

    private void criarFormTarefa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/tarefas-novo.jsp");
        despachante.forward(request, response);
    }

}
