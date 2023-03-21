package antonio.ifpr.demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Requisicao", value = "/requisicao")
public class RequisicaoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Method: " + request.getMethod());
        writer.println("URI: " + request.getRequestURI());
        writer.println("Protocol: " + request.getProtocol());
        writer.println("Remote address: " + request.getRemoteAddr());
    }
}
