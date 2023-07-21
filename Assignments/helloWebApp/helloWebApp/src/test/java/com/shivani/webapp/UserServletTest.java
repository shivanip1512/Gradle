package com.shivani.webapp;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserServletTest {
	
	@Mock HttpServletRequest request;
	@Mock HttpServletResponse response;
	@Mock RequestDispatcher requestDispatcher;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void doPost() throws Exception {
		when(request.getParameter("username")).thenReturn("John");
		when(request.getRequestDispatcher("response.jsp")).thenReturn(requestDispatcher);
		new UserServlet().doPost(request, response);
		verify(request).setAttribute("usermsg", "hello John");
		verify(requestDispatcher).forward(request, response);
	}

}
