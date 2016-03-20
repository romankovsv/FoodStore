package com.foodstore.serg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foodstore.serg.service.MealService;
import static com.foodstore.serg.constants.ServletConstants.*;

@WebServlet(name = "RemoveMealServlet", urlPatterns = "/remove")
public class RemoveMealServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType(CONTENT_TYPE);
		
		try{	
			long idForRemoving = Long.parseLong(request.getParameter(ID));
			if(MealService.remove(idForRemoving)){
				out.write(SUCCESS_DELETE);
			}else{
				out.write(NOT_DELETED);
			}
		}catch(NumberFormatException e){
			out.write(INCORRECT_INPUT);
		}catch(Exception e){
			out.write(EXCEPTION);
		}
	}

}
