import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        ArrayList<String> a = new ArrayList();
        a.add("Something");
        a.add("SomethingElse");
        a.add("Hohoho");

        String str = request.getParameter("str");
        a.add(str);


        PrintWriter printWriter = response.getWriter();
        printWriter.write("<h1>Products: </h1>");
        for(String s : a) {
            printWriter.write("<h1>"+ s+ "</h1>");
        }
    }
}
