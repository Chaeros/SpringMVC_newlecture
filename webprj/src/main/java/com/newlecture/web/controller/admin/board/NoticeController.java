package com.newlecture.web.controller.admin.board;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller("adminNoticeController")  // bean name = adminNoticeController 가 된다.
@RequestMapping("/admin/board/notice/")
public class NoticeController { // <bean name="noticeController" class="com.newlecture.web.controller. ..."/>로 된다

	@Autowired
	private ServletContext ctx;
	
	@RequestMapping("list")
	public String list() {
		
		return "admin.board.notice.list";
	}
	
	@GetMapping("reg")
	public String reg() {
		
		return "admin.board.notice.reg";
	}
	
	@PostMapping("reg")
	//@ResponseBody
	public String reg(String title, String content, MultipartFile[] files, String category, String[] foods, String food, HttpServletRequest request) throws IllegalStateException, IOException {
		System.out.print("카테고리:");
		System.out.println(category);
		
		for(MultipartFile file : files) {
			long size=file.getSize();
			String fileName=file.getOriginalFilename();
			System.out.printf("fileName:%s, fileSize:%d\n",fileName,size);
			ServletContext ctx=request.getServletContext();
			
			String webPath="/static/upload";
			String realPath=ctx.getRealPath(webPath);
			System.out.printf("realPath: %s\n", realPath);
			
			//realPath에 해당 폴더가 존재하지 않으면 경로상 모든 디렉터리 생성해줌
			File savePath = new File(realPath);
			if(!savePath.exists())
				savePath.mkdirs();
			
			realPath+=File.separator+fileName;
			File saveFile = new File(realPath);
			
			file.transferTo(saveFile);
		}
		
		System.out.print("선태한 음식들:");
		for(String selected:foods)
			System.out.println(selected);
		System.out.print("최애음식:");
		System.out.println(food);
		
		return "admin.board.notice.reg";
		//return String.format("title:%s<br>content:%s<br>category:%s<br>", title,content,category);
	}
	
	@RequestMapping("edit")
	public String edit() {
		
		return "admin.board.notice.edit";
	}
	
	@RequestMapping("del")
	public String del() {
		
		return "admin.board.notice.del";
	}
}
