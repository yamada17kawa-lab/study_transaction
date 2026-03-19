package com.nuliyang.study_transaction.service;

import cn.hutool.core.lang.Snowflake;
import com.nuliyang.study_transaction.po.TransactionPo;
import com.nuliyang.study_transaction.repository.TestRepository;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;


@Service
@Slf4j(topic = "TransactionService2")
public class TransactionService2 {

    @Resource
    TestRepository testRepository;

    @Resource
    Snowflake snowflake;


//    @Transactional
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save2() {
        TransactionPo transactionPo = new TransactionPo();
        transactionPo.setId(snowflake.nextId());
        transactionPo.setTransa("Transaction 测试2");
        testRepository.save(transactionPo);
        log.info("测试2 插入成功 == {}", transactionPo);
        String name = TransactionSynchronizationManager.getCurrentTransactionName();
        log.info("当前事务名称 == {}", name);
        if (1 == 1){
//            throw new RuntimeException("测试2异常");
        }
    }
}
