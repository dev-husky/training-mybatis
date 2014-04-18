/**
 * Copyright(C) com.allinpay - 通联支付 上海研发中心
 * 
 * @author 蒋钧
 *
 * @since 2014年4月15日
 * @description: <描述>
 *
 */
package asia.laevatein.training.mybatis.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import asia.laevatein.training.mybatis.model.Hero;
import asia.laevatein.training.mybatis.service.HeroService;

@Controller
public class WelcomeController {

	private Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private HeroService heroService;
	
	@RequestMapping({"", "/"})
	public String welcome() {
		Hero hero = heroService.findHeroById(1);
		logger.debug("hero: " + hero);
		return "welcome";
	}
}
