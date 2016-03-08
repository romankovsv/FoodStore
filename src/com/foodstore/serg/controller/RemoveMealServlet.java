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
import com.foodstore.serg.utils.CheckMealUtils;
import com.foodstore.serg.utils.TimeMealUtils;

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

		/* Due to specification, you should remove object only by ID
		 *  /remove?id=15   removes object with id=15
		 */
		
			PrintWriter out = response.getWriter();
			response.setContentType(CONTENT_TYPE);
			
			long idForRemoving = Long.parseLong(request.getParameter(ID));
			
			try{	
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
