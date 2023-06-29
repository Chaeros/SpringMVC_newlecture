package com.newlecture.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")  // 아래 메소드에 작성한 url 앞에 이 주소 문자열이 붙는다.
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	// RequestParam으로 받아오는 값은 모두 String 문자열로 받아온다. 단, 받아온 값을 정수형 쓰고싶으면 뒤에 매개변수 page의 자료형을 int로하면 된다.
	public String list(@RequestParam(name="p", defaultValue="1") int page) throws ClassNotFoundException, SQLException {
		
		//String p= request.getParameter("p");
		System.out.println("page:"+page);
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		
		return "notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "notice.detail";
	}
}
