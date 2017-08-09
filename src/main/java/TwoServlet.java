import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by liubo on 2017/8/9.
 */
@WebServlet(name = "/two",urlPatterns = "/two/*")
public class TwoServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response){
        try {
            request.getRequestDispatcher("/WEB-INF/two.jsp").forward(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
