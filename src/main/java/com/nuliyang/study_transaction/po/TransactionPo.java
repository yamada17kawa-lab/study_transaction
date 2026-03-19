package com.nuliyang.study_transaction.po;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("sss")
public class TransactionPo implements Persistable<Long> {


    @Id
    @Column("id")
    private Long id;

    @Column("transa")
    private String transa;

    @Override
    public boolean isNew() {
        return true;
    }
}
