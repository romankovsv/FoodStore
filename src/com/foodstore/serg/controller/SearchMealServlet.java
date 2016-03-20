package com.foodstore.serg.controller;

import java.io.IOException;
import static com.foodstore.serg.constants.ServletConstants.*;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foodstore.serg.model.Meal;
import com.foodstore.serg.service.MealService;

@WebServlet(name = "SearchMealServlet", urlPatterns = "/search")
public class SearchMealServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType(CONTENT_TYPE);
		
		final String search = request.getParameter(SEARCH);
		
		if(search == null ||search.isEmpty()){
			request.setAttribute("message", SEARCH_IS_EMPTY);
		}else{	
			List<Meal> resultList = MealService.search(search);
			request.setAttribute("food", resultList);
		
			if(resultList.isEmpty()){
				request.setAttribute("message", NO_SUCH_MEAL);
			}else{
				request.setAttribute("success_message", FOUND_MEAL);
			}
		}
		
		getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
