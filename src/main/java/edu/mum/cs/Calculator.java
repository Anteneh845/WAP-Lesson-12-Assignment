package edu.mum.cs;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")
public class Calculator extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        double firstNumber = Double.parseDouble(req.getParameter("firstInput"));
        double secondNumber = Double.parseDouble(req.getParameter("secondInput"));
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        if (!req.getParameter("thirdInput").equals("") && !req.getParameter("thirdInput").equals("")) {
            double thirdNumber = Double.parseDouble(req.getParameter("thirdInput"));
            double fourthNumber = Double.parseDouble(req.getParameter("fourthInput"));
            out.println("" + firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber) + "<br/>" + thirdNumber + "*" + fourthNumber + "=" + (thirdNumber * fourthNumber));
        } else
            out.println("" + firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
    }
}
