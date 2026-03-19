package com.nuliyang.study_transaction.service;


import com.nuliyang.study_transaction.po.TransactionPo;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional
@Rollback(false)
class TransactionService1Test {

    @Resource
    TransactionService1 transactionService1;

    @Test
    void save() {
        transactionService1.save1();


    }
}