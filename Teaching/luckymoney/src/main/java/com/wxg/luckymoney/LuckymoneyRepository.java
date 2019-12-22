package com.wxg.luckymoney;

import org.springframework.data.jpa.repository.JpaRepository;

// <实体类, ID类型>
public interface LuckymoneyRepository extends JpaRepository<Luckymoney, Integer>
{

}
