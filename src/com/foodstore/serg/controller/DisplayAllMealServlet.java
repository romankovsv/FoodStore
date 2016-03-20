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
import static com.foodstore.serg.constants.ServletConstants.*;

@WebServlet(name = "DisplayAllMealServlet", urlPatterns = "/display")
public class DisplayAllMealServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType(CONTENT_TYPE);
		
		List<Meal> meals = MealService.getAll();
		/*
		if(meals.isEmpty()){
			out.println(NO_PRODUCT);
		}else{
			out.println(LIST_OF_MEALS);
			for(Meal meal : MealService.getAll()){
				out.println(meal);
			}
		}*/
		
		request.setAttribute("food", meals);
		
		getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
	}

}
