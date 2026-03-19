package com.nuliyang.study_transaction.repository;

import com.nuliyang.study_transaction.po.TransactionPo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<TransactionPo, Long> {


}
