import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Test extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("初始化");//只执行一次
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        System.out.println("处理了一个请求");
        PrintWriter writer=resp.getWriter();
        writer.println("success");
    }
    //生命周期
    //init() er

    @Override
    public void destroy() {
        System.out.println("销毁了");
    }
}
