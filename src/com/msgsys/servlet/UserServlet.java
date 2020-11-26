package com.msgsys.servlet;

import com.google.code.kaptcha.servlet.KaptchaServlet;
import com.msgsys.entity.User;
import com.msgsys.service.UserService;
import com.msgsys.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

/**
 * 作者: Fu YuHang
 * 日期: 2020/11/27 0:26
 * 描述:
 */
@WebServlet("/user.do")
public class UserServlet extends BaseServlet{

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);


    }

    //注册
    public void register(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        System.out.println(username);
        System.out.println(password);
        System.out.println(email);
        User user = new User(username, password, email);
        int result = userService.register(user);
        System.out.println(result);
    }


    //登录
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String verify = request.getParameter("verify");
        User user = new User(username, password, null);
        String token = (String)request.getSession( ).getAttribute(KAPTCHA_SESSION_KEY);
        System.out.println(token);
        User login = userService.login(user);
        if (login != null && verify.equals(token)) {
            HttpSession session = request.getSession();
            session.setAttribute("user",login);
            response.sendRedirect("/mes/list.jsp");
        }else {
            response.sendRedirect("/mes/login.jsp");
        }
    }
}
