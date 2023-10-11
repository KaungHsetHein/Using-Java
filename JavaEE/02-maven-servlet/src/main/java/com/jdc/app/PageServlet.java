package com.jdc.app;
import java.io.IOException;

import jakarta.servlet.ServletException;

@jakarta.servlet.annotation.WebServlet("/page")
public class PageServlet extends jakarta.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        jakarta.servlet.http.HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            count = 1;
        } else {
            count++;
        }

        session.setAttribute("count", count);

        response.setContentType("text/html");
        response.getWriter().println("<h1>You have hit this page " + count + " time(s).</h1>");

        if (count < 10) {
            response.getWriter().println("<form method=\"post\" action=\"page\">");
            response.getWriter().println("<input type=\"submit\" value=\"Reload Page\">");
            response.getWriter().println("</form>");
        }
    }

   
}
