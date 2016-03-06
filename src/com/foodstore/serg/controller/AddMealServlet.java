package com.foodstore.serg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foodstore.serg.model.Meal;
import com.foodstore.serg.service.MealService;
import com.foodstore.serg.utils.CheckUtils;

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
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		response.setContentType(CONTENT_TYPE);
		
		String title = request.getParameter(TITLE);
		String description = request.getParameter(DESCRIPTION);
		String type = request.getParameter(TYPE);
		double price = Double.parseDouble(request.getParameter(PRICE));
		boolean available = Boolean.parseBoolean(request.getParameter(AVAILABLE));
		String owner = request.getParameter(OWNER);
		
		
		
		Meal meal = CheckUtils.create(title, description, type, available, price, owner, new Date());
		
		if(meal == null){
			out.write("<html><body>Error Some Fields are Empty or Incorrect</body></html>");
		}else{
			MealService.add(meal);
			out.write("<html><body>Meal is successfully created and added to store</body></html>");
		}	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
