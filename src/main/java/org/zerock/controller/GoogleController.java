package org.zerock.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.GoogleVO;
import org.zerock.domain.ListCmd;
import org.zerock.domain.ModalCmd;
import org.zerock.domain.NameCmd;
import org.zerock.domain.SelectCmd;
import org.zerock.domain.SelectVO;
import org.zerock.service.GoogleService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@RequiredArgsConstructor
@Log4j
@Controller
public class GoogleController {

	private final GoogleService service;

//	@GetMapping("/google")
//	public String list(@RequestParam Map<String,Object> param, Model model) throws Exception {
//		
//		log.info("google.................................");	
//		
//		List<GoogleVO> google = service.selectTest5(param);
//		
//		return "google";
//	}
	
	@GetMapping("/list")
	public String modal() {

		return "list";

	}

	@GetMapping("/google")
	public String list(Model model) throws Exception {

		log.info("google.................................");

		model.addAttribute("chart", new ListCmd());
		model.addAttribute("modal", new ModalCmd());
		model.addAttribute("Name",  new NameCmd());
		
		
		model.addAttribute("select", service.selectTest4());
		
		System.out.println(service.selectTest4());
		
		return "google";
	}

	// DTO JSP Mapper xml name 값이 똑같아야함

	@PostMapping("/google")
	public String list(String option, ListCmd list, NameCmd name, Model model) throws Exception {

		log.info("google.................................");

		System.out.println(list.toString());
		
		if(option == null) {
			model.addAttribute("success", service.selectTest2(list));
		}else {
			model.addAttribute("option",  service.selectTest3(name));
		}
			
		return "google";
	}
	// command 객체로 POST 방식으로
	
	// ModelAttrubute 추가
	@PostMapping("/modal")
	public String list(ModalCmd modal, Model model, RedirectAttributes rttr) throws Exception {

		log.info("modal.................................");

		System.out.println(modal.toString());
		
		service.update(modal);
		
		rttr.addFlashAttribute("modal", modal);
		//model.addAttribute("modal", modal);
		return "redirect:/google";
	}
}
