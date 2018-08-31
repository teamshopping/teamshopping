package com.neusoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.neusoft.pojo.Pager;
import com.neusoft.pojo.TeamshoppingGoods;
import com.neusoft.service.ShoppingGoodsService;

@Controller
@RequestMapping("/shopping")
public class TeamBuyGoods {
	@Autowired
	private ShoppingGoodsService shoppingGoodsService;
	
	/**
	 * 分页显示商品内容
	 */
	@RequestMapping(value="/type/{pageSize}/{pageIndex}")
	public ModelAndView goodsAll(@RequestParam int type,@PathVariable("pageSize") int pageSize, @PathVariable("pageIndex") int pageIndex) throws Exception {
		Pager<TeamshoppingGoods> pager=shoppingGoodsService.getPager(type, pageIndex, pageSize);
		ModelAndView model = new ModelAndView("/commodity-list");//重定向
		model.addObject("pager", pager);
		return model;
	}
	/**
	 * 根据id查商品对象
	 */
	@RequestMapping(value="/protuct")
	public ModelAndView productView(@RequestParam int id) throws Exception{
		TeamshoppingGoods teamshoppingGoods=shoppingGoodsService.getGoodsbyId(id);
		ModelAndView model = new ModelAndView("/product-view");//重定向
		model.addObject("goods",teamshoppingGoods);
		return model;
	}

}
