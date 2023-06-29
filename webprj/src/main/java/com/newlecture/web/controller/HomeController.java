package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//Controller 어노테이션을 쓰면 Controller 클래스를 상속할 필요가 없다.
//또한 추상 메소드인 ModelAndView도 작성해줄 필요가 없다.
//따라서 url주소가 매핑되는 것은 클래스가 아닌, 메소드와 매핑이 되는 것을 알 수 있다.
//여러개의 메소드를 정의하고, 각 메소드마다 다른 url을 매핑시켜줄 수 있기 때문이다.
//실질적으로 메소드가 Controller 역할을 수행하고, 클래스는 Controller를 담는 컨테이너가 된다.
@Controller
@RequestMapping("/")
public class HomeController{
	
	@RequestMapping("index")
	@ResponseBody   // 메소드에서 반환한 문자열이 .jsp 파일을 찾는게 아니라 그냥 텍스트 그대로를 전송한다는 어노테이션
	public String index() {
		return "Hello Index 1";
	}
	
//	@RequestMapping("index")
//	public void index(HttpServletResponse response) {
//		PrintWriter out;
//		try {
//			out = response.getWriter();
//			out.println("Hello");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//return "root.index"; // return 키워드로 문자열을 반환해주면 간단하게 뷰를 찾을 수 있다.
//	}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		System.out.println("index controller");
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data","Hello Spring MVC~"); // 모델 만듦
//		//mv.setViewName("index");  // 해당 뷰로 전송
//		return mv; 
//	}
	
}
