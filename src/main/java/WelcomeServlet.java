
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *  Servlet 初始化
 * Created by liubo on 2017/8/9.
 */
@WebServlet(name = "/wel",urlPatterns = "/wel/*")
public class WelcomeServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        res.setContentType("text/html;charset=UTF-8");
        Map<String,String> data = getData();
        PrintWriter out = res.getWriter();
        try {
            // Write some content
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Welcome</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Hello " + data.get("username") + ", " + data.get("message") + "</h2>");
            out.println("<h2>The time right now is : " + new Date() + "</h2>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    //This method will access some external system as database to get user name, and his personalized message
    private Map<String, String> getData()
    {
        Map<String, String> data = new HashMap<String, String>();
        data.put("username", "Guest");
        data.put("message",  "Welcome to my world !!");
        return data;
    }
}
