package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Article;
import entity.User;
import service.ArticleService;
import service.UserService;


@SuppressWarnings("serial")
@WebServlet(name = "article" ,urlPatterns = {"*.a"})
public class ArticleController extends HttpServlet {
       
	ArticleService articleService = new ArticleService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getServletPath();
		System.out.println( path);
		
		switch (path) {
		case "/Article/index.a": {
			request.setAttribute("articles", articleService.getAll() );
			request.getRequestDispatcher("/indexArticle.jsp").forward(request, response);
			break;
		}
		case "/Article/edit.a": {
			request.getRequestDispatcher("/editArticle.jsp").forward(request, response);
			System.out.println("Display Edit page");
			break;
		}
		case "/Article/create.a": {
			request.getRequestDispatcher("/createArticle.jsp").forward(request, response);
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
		case "/Article/store.a": {
			String description = request.getParameter("description");
			String brand = request.getParameter("brand");
			float price = Float.parseFloat(request.getParameter("price"));
			
			Article a = new Article(description, brand, price);
			
			articleService.create(a);
			response.sendRedirect("/CRUD-JSF/Article/index.a");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + path);
		}
		
		
	}

}
