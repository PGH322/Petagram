package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.ReadPostAllService;

@Controller
public class DeleteController {
	
	@Autowired
	ReadPostAllService service;
	
	//http://localhost:xxxx/api/delete
	@GetMapping("/api/delete")
	public void deleteMember(HttpSession session, @RequestParam Integer memberid) {
		service.deleteMember(memberid);
	}
	
	//http://localhost:xxxx/api/deleteNotice
	@GetMapping("/api/deleteNotice")
	public void deleteNotice(@RequestParam Integer informId) {
		service.deleteNotice(informId);
	}
}