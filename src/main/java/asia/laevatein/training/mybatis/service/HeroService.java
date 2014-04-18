/**
 * Copyright(C) com.allinpay - 通联支付 上海研发中心
 * 
 * @author 蒋钧
 *
 * @since 2014年4月15日
 * @description: <描述>
 *
 */
package asia.laevatein.training.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import asia.laevatein.training.mybatis.mapper.HeroMapper;
import asia.laevatein.training.mybatis.model.Hero;

@Service
public class HeroService {

	@Autowired
	private HeroMapper heroMapper;
	
	@Transactional
	public Hero findHeroById(int id){
		return heroMapper.findHeroById(id);
	}
}
