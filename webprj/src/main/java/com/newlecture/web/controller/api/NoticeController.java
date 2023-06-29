package com.newlecture.web.controller.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

//일반 Controller와 달리 RestController를 사용하면 메소드에 @ResponseBody를 쓰지 않아도
//return 하는 문자열이 jsp 파일과 같은 문서가 아닌 텍스트를 전송하게 된다.
//다른 패키지에 같은 이릉의 클래스가 있을 수 있기때문에, 충돌 방지를 위해 RestController에 이름을 지정해준다.
@RestController("apiNoticeController")
@RequestMapping("/api/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public List<Notice> list() throws ClassNotFoundException, SQLException {
		
		List<Notice> list = service.getList(1, "TITLE", "");
		
		return list;
	}
}
