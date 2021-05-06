package edu.mum.cs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/question2")
public class Question2 extends HttpServlet {
    private double sumResult = 0;
    private double productResult = 0;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        double firstNumber = Double.parseDouble(req.getParameter("firstInput"));
        double secondNumber = Double.parseDouble(req.getParameter("secondInput"));
        if (!req.getParameter("thirdInput").equals("") && !req.getParameter("thirdInput").equals("")) {
            double thirdNumber = Double.parseDouble(req.getParameter("thirdInput"));
            double fourthNumber = Double.parseDouble(req.getParameter("fourthInput"));
            sumResult = firstNumber + secondNumber;
            productResult = thirdNumber * fourthNumber;
            writer.println("" +
                    "<html>" +
                    "<head>   <link href='css/style.css' type='text/css' rel='stylesheet'/> </head>" +
                    "<body>"+
                    "<form action='question2' method='post'>\n" +
                    "<h1> Question 2: Calculator Advanced</h1>\n"+
                    "    <div>\n" +
                    "        <input name='firstInput' type='number' value='" + firstNumber + "' required/> +\n" +
                    "        <input name='secondInput' type='number' value='" + secondNumber + "'  required/> =\n" +
                    "        <input name='multiplicationResult' type='number' value='" + sumResult + "' \n" +
                    "    </div>\n" +
                    "    <div>\n" +
                    "        <input name='thirdInput' type='number' value='" + thirdNumber + "'/> *\n" +
                    "        <input name='fourthInput' type='number' value='" + fourthNumber + "' /> =\n" +
                    "        <input name='multiplicationResult' type='number' value='" + productResult + "'/>\n" +
                    "    </div>\n" +
                    "    <input type='submit' value='Submit'/>\n" +
                    "</form>" +
                    "</body>" +
                    "</html>");
        } else {
            sumResult = firstNumber + secondNumber;
            writer.println("" +
                    "<html>" +
                    "<head>   <link href='css/style.css' type='text/css' rel='stylesheet'/> </head>" +
                    "<body>"+
                    "<h1> Question 2: Calculator Advanced</h1>\n"+
                    "<form action='question2' method='post'>\n" +
                    "    <div>\n" +
                    "        <input name='firstInput' type='number' value='" + firstNumber + "' required/> +\n" +
                    "        <input name='secondInput' type='number' value='" + secondNumber + "'  required/> =\n" +
                    "        <input name='multiplicationResult' type='number' value='" + sumResult + "' \n" +
                    "    </div>\n" +
                    "    <div>\n" +
                    "        <input name='thirdInput' type='number'/> *\n" +
                    "        <input name='fourthInput' type='number'  /> =\n" +
                    "        <input name='multiplicationResult' type='number' value='" + productResult + "'/>\n" +
                    "    </div>\n" +
                    "    <input type='submit' value='Submit'/>\n" +
                    "</form>" +
                    "<body>"+
                    "</html>");
        }
    }


}
