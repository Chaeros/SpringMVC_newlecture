package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller("adminNoticeController")  // bean name = adminNoticeController 가 된다.
@RequestMapping("/admin/board/notice/")
public class NoticeController { // <bean name="noticeController" class="com.newlecture.web.controller. ..."/>로 된다

	@RequestMapping("list")
	public String list() {
		
		return " ";
	}
	
	@RequestMapping("reg")
	@ResponseBody
	public String reg(String title, String content, MultipartFile file, String category, String[] foods, String food) {
		System.out.print("카테고리:");
		System.out.println(category);
		
		long size=file.getSize();
		String fileName=file.getOriginalFilename();
		System.out.printf("fileName:%s, fileSize:%d\n",fileName,size);
		
		System.out.print("선태한 음식들:");
		for(String selected:foods)
			System.out.println(selected);
		System.out.print("최애음식:");
		System.out.println(food);
		return String.format("title:%s<br>content:%s<br>category:%s<br>", title,content,category);
	}
	
	@RequestMapping("edit")
	public String edit() {
		
		return "";
	}
	
	@RequestMapping("del")
	public String del() {
		
		return "";
	}
}