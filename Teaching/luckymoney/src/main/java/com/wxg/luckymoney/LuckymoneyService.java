package com.wxg.luckymoney;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LuckymoneyService
{
	@Autowired
	private LuckymoneyRepository luckyRepository;
	
	// 无事务，可能会成功一个，失败一个
    public void createTwo1()
    {
        Luckymoney one = new Luckymoney();
        one.setProducer("wxg");
        one.setMoney(new BigDecimal(520));
        one.setConsumer("whq");
        luckyRepository.save(one);
        
        Luckymoney tow = new Luckymoney();
        tow.setProducer("wxg");
        tow.setMoney(new BigDecimal(1314));  // 如果限制数据库为三位，则要失败，上面520则成功，不是我们想要的
        tow.setConsumer("whq");
        luckyRepository.save(tow);
    }
    
    // 有事务
    @Transactional
    public void createTwo2()
    {
        Luckymoney one = new Luckymoney();
        one.setProducer("wxg");
        one.setMoney(new BigDecimal(520));
        one.setConsumer("whq");
        luckyRepository.save(one);
        
        Luckymoney tow = new Luckymoney();
        tow.setProducer("wxg");
        tow.setMoney(new BigDecimal(5));
        tow.setConsumer("whq");
        luckyRepository.save(tow);
    }
}
