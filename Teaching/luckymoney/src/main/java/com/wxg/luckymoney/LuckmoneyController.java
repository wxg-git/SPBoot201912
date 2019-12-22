package com.wxg.luckymoney;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckmoneyController
{
	@Autowired
    private LuckymoneyRepository repository;
	
	@Autowired
	private LuckymoneyService luckymoneyService;
	
	/**
	 *获取红包列表 
	 */
	@GetMapping("/luckymoneys")
    public List<Luckymoney> list()
    {
    	return repository.findAll();
    }
	
	/**
	 * 创建红包
	 */
	@PostMapping("/luckymoneys")
	public Luckymoney create(@RequestParam("producer") String producer,
			                 @RequestParam("money") BigDecimal money)
	{
		Luckymoney luckymoney = new Luckymoney();
		luckymoney.setProducer(producer);
		luckymoney.setMoney(money);

		return repository.save(luckymoney);
	}
	
	
	/**
	 * 通过ID查询红包
	 */
	@GetMapping("/luckymoney/{id}")
	public Luckymoney findById(@PathVariable("id") Integer id)
	{
	    return repository.findById(id).orElse(null);
	}
	
	
	/**
	 * 更新红包
	 */
	@PutMapping("/luckymoney/{id}")
	public Luckymoney update(@PathVariable("id") Integer id,
			                 @RequestParam("consumer") String consumer)
	{
		Optional<Luckymoney> optional = repository.findById(id);
		
		// 如果有数据，则到付更新
		if(optional.isPresent())
		{
			Luckymoney luckymoney = optional.get();
	        luckymoney.setConsumer(consumer);

	        repository.save(luckymoney);
		}
		return null;
	}
	
	
	// 测试数据库事务。同时发送两个红包
	// http://localhost:8081/luckymoney/sendTwo
	@GetMapping("/sendTwo")
	public void sendTwo()
	{
		luckymoneyService.createTwo2();
	}
}
