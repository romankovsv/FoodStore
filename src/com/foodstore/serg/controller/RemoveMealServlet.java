package com.foodstore.serg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foodstore.serg.service.MealService;

@WebServlet(name = "RemoveMealServlet", urlPatterns = "/remove")
public class RemoveMealServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CONTENT_TYPE = "text/html";
	private static final String SUCCESS = "<html><body>Meal was successfully deleted from store</body></html>";
	private static final String NOT_DELETED = "<html><body>Meal was not deleted</body></html>";
	private static final String INCORRECT_INPUT = "<html><body>Incorrect Input here only numbers available for input</body></html>";
	private static final String EXCEPTION = "<html><body>EXCEPTION</body></html>";
	private static final String ID = "id";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter out = response.getWriter();
			response.setContentType(CONTENT_TYPE);
			
			try{	
				long idForRemoving = Long.parseLong(request.getParameter(ID));
				if(MealService.remove(idForRemoving)){
					out.write(SUCCESS);
				}else{
					out.write(NOT_DELETED);
				}
			}catch(NumberFormatException e){
				out.write(INCORRECT_INPUT);
			}catch(Exception e){
				out.write(EXCEPTION);
			}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
