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

		doPost(request,response);//����������� doPost() �.�. � ��� ���������� ������ ��� meals
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType(CONTENT_TYPE);
		
		List<Meal> meals = MealService.getAll();
		
		if(meals.isEmpty()){
			request.setAttribute(SUCCESS_MESSAGE, NO_PRODUCT);
		}else{
			request.setAttribute(SUCCESS_MESSAGE, LIST_OF_MEALS);
			request.setAttribute(FOOD, meals);
		}
		
		getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
	}

}
