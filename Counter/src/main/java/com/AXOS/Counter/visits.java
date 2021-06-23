package com.AXOS.Counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class visits {
	static int count = 0;
	@RequestMapping("/")
	public String man(HttpSession session) {
		
		session.setAttribute("count", count);
		return "index.jsp";
	}

	@RequestMapping("/your_server")
	public String visit() {
		count +=1;
		return "your_server.jsp";
	}
}
