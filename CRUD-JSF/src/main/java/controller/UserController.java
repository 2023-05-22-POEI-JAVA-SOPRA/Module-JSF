package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.UserService;


@SuppressWarnings("serial")
@WebServlet(name = "user" ,urlPatterns = {"*.p"})
public class UserController extends HttpServlet {
       
	UserService userService = new UserService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getServletPath();
		System.out.println( path);
		
		switch (path) {
		case "/User/store.p":
		case "/User/index.p": {
			request.setAttribute("users", userService.getAll() );
			request.getRequestDispatcher("/indexUser.jsp").forward(request, response);
			break;
		}
		case "/User/edit.p": {
			request.getRequestDispatcher("/editUser.jsp").forward(request, response);
			System.out.println("Display Edit page");
			break;
		}
		case "/User/create.p": {
			request.getRequestDispatcher("/createUser.jsp").forward(request, response);
			System.out.println("Display Create page");
			break;
		}
		default:
			request.getRequestDispatcher("/NotFound.jsp").forward(request, response);
			System.out.println("Display 404 Not found page");
			break;
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		
		System.out.println("In DoPost");
		
		switch (path) {
		case "/User/store.p": {
			String email = request.getParameter("email");
			String login = request.getParameter("login");
			String password = request.getParameter("password");
			String name = request.getParameter("name");
			int age = Integer.parseInt( request.getParameter("age") );
			
			User u = new User(email, login, name, password, age);
			userService.create(u);
			
			doGet(request, response);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + path);
		}
		
		
	}

}
