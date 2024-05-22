package edu.training.web.controller.concrete.implement;

import java.io.IOException;
import java.util.List;

import edu.training.web.bean.News;
import edu.training.web.bean.User;
import edu.training.web.controller.concrete.Command;
import edu.training.web.service.NewsService;
import edu.training.web.service.ServiceProvider;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class GoToStartPage implements Command {

	private final NewsService newsService = ServiceProvider.getInstance().getNewsService();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User user = new User("unAuthorizer");

		List<News> mainNews = newsService.lastNews();
		request.setAttribute("mainNews", mainNews);

		if (user != null) {
			HttpSession session = (HttpSession) request.getSession(true);
			session.setAttribute("user", user);
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/start_page.jsp");
		dispatcher.forward(request, response);

	}

}
