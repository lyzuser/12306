package cn.edu.guet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TicketServlet", value = "/TicketServlet")
public class TicketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("余票查询");
        request.setCharacterEncoding("UTF-8");
        String fromStation = request.getParameter("fromStation");
        String toStation = request.getParameter("toStation");
        String departureDate = request.getParameter("departureDate");

        System.out.println(fromStation);
        System.out.println(toStation);
        System.out.println(departureDate);
        TicketSearch.search(fromStation,toStation,departureDate);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
