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

//urlPattern could be just /display
@WebServlet(name = "DisplayAllMealServlet", urlPatterns = "/display")
public class DisplayAllMealServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CONTENT_TYPE = "text/html";
	private static final String NO_PRODUCT = "<html>There are no meals int our store</html>";
	private static final String LIST_OF_MEALS = "<html>Our Meals:</html>";
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType(CONTENT_TYPE);
		
		//Show something in case it is empty
		List<Meal> meals = MealService.getAll();
		if(meals.isEmpty()){
			out.write(NO_PRODUCT);
		}else{
			out.write(LIST_OF_MEALS);
			for(Meal meal : MealService.getAll()){
				out.println(meal);
			}
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
