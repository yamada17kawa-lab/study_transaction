事务的特性ACID
    原子性
    隔离性
    持久性
    一致性

spring事务属性
    隔离性
        读未提交
        读已提交
        可重复读
        串行化
    传播性
        REQUIRED          有就加入，没有就新建
        REQUIRES_NEW      有就新建，没有也新建
        SUPPORTS          有就加入，没有就不加
        NOT_SUPPORTED     不支持事务，有就不管，没有就不管
        MANDATORY         必须有事务，没有就报错
        NEVER             不能有事务，有就报错
    回滚规则（RollBackFor）和不回滚规则（NoRollBackFor）
    是否只读(ReadOnly) 默认false
    超时时间(Timeout)