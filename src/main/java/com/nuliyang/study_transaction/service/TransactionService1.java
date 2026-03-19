package com.nuliyang.study_transaction.service;


import cn.hutool.core.lang.Snowflake;
import com.nuliyang.study_transaction.po.TransactionPo;
import com.nuliyang.study_transaction.repository.TestRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;


@Slf4j(topic = "TransactionService1")
@Service
@RequiredArgsConstructor
public class TransactionService1 {

    final TestRepository testRepository;


    final Snowflake snowflake;


    final TransactionService2 transactionService2;


    @Transactional
    public void save1() {
        TransactionPo transactionPo = new TransactionPo();
        transactionPo.setId(snowflake.nextId());
        transactionPo.setTransa("Transaction 测试1");
        testRepository.save(transactionPo);
        log.info("测试1 插入成功 == {}", transactionPo);
        String name = TransactionSynchronizationManager.getCurrentTransactionName();
        log.info("当前事务名称 == {}", name);
        transactionService2.save2();
        if (1 == 1){
            throw new RuntimeException("测试1异常");
        }
    }

}
