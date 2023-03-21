package antonio.ifpr.demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cabecalho", value = "/cabecalhos")
public class CabecalhoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Host: " + request.getHeader("host"));
        writer.println("User Agent: " + request.getHeader("user-agent"));
        writer.println("Accept Encoding: " + request.getHeader("accept-encoding"));
        writer.println("Accept Language: " + request.getHeader("accept-language"));
    }
}
