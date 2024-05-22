package edu.training.web.controller.concrete.implement;

import java.io.IOException;

import edu.training.web.controller.concrete.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;

public class GoToRegistrationPage implements Command {

	@Override
	public void execute(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/registration_page.jsp");
		dispatcher.forward(request, response);

	}

}
