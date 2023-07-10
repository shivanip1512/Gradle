package com.shivani.gradle;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/coupon")
public class CouponServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.getWriter().print("SUPERSALE");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String coupon = req.getParameter("coupon");
		req.setAttribute("discount", "Discount for coupon "+coupon+" is 50%");
		req.getRequestDispatcher("response.jsp").forward(req, resp);
	}
}
