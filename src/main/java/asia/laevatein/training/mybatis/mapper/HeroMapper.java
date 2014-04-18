/**
 * Copyright(C) com.allinpay - 通联支付 上海研发中心
 * 
 * @author 蒋钧
 *
 * @since 2014年4月15日
 * @description: <描述>
 *
 */
package asia.laevatein.training.mybatis.mapper;

import asia.laevatein.training.mybatis.model.Hero;

public interface HeroMapper {

	public Hero findHeroById(int id);
}
