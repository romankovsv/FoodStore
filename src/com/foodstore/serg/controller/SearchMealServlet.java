package com.foodstore.serg.controller;

import java.io.IOException;
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
	private static final String CONTENT_TYPE = "text/html";
	private static final String NO_SUCH_MEAL = "<html><body>There are no such meal in our store<html><body>";
	private static final String FOUND_MEAL = "<html><body>We have found meal:<body></html>";
	private static final String SEARCH_IS_EMPTY = "<html><body>Search is empty<body></html>";
	private static final String SEARCH = "search";
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType(CONTENT_TYPE);
		
		final String search = request.getParameter(SEARCH);
		
		if(search == null ||search.isEmpty()){
			out.write(SEARCH_IS_EMPTY);
		}else{
			List<Meal> resultList = MealService.search(search);
			
			if(resultList.isEmpty()){
				out.println(NO_SUCH_MEAL);
			}else{
				out.println(FOUND_MEAL);
				for(Meal meal:resultList){
					out.println(meal);
				}
			}
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
