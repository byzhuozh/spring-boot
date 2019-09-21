package com.zzh.springboot.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhuozh
 * @version $Id: ByzhuozhController.java, v 0.1 2019/9/21 14:27 zhuozh Exp $
 */
@Controller
@RequestMapping("/demo")
public class ByzhuozhController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "world";
	}
}
