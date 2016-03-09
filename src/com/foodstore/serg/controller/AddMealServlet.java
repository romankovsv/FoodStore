package com.foodstore.serg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foodstore.serg.model.Meal;
import com.foodstore.serg.service.MealService;
import com.foodstore.serg.utils.CheckMealUtils;
import com.foodstore.serg.utils.TimeMealUtils;

@WebServlet(name = "AddMealServlet", urlPatterns = "/add")
public class AddMealServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;   
	private static final String CONTENT_TYPE = "text/html";
	private static final String TITLE = "title";
	private static final String DESCRIPTION = "description";
	private static final String TYPE = "type";
	private static final String OWNER = "owner";
	private static final String PRICE = "price";
	private static final String AVAILABLE = "available";
	private static final String ERROR = "<html><body>Error Some Fields are Empty or Incorrect</body></html>";
	private static final String SUCCESS = "<html><body>Meal is successfully created and added to store</body></html>";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		response.setContentType(CONTENT_TYPE);
		
		String title = request.getParameter(TITLE);
		String description = request.getParameter(DESCRIPTION);
		String type = request.getParameter(TYPE);
		String price = request.getParameter(PRICE);
		boolean available = Boolean.parseBoolean(request.getParameter(AVAILABLE));
		String owner = request.getParameter(OWNER);
		
		String time = TimeMealUtils.getTime();
		
		Meal meal = CheckMealUtils.create(title, description, type, available, price, owner, time);
		
		if(meal == null){
			out.write(ERROR);
		}else{
			MealService.add(meal);
			out.write(SUCCESS);
		}	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
