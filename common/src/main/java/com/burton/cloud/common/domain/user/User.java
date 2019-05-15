package com.burton.cloud.common.domain.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "c_u_user")
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(columnDefinition = "VARCHAR(32) NOT NULL DEFAULT '' COMMENT '用户名'")
    private String username;

    @Column(columnDefinition = "VARCHAR(32) NOT NULL DEFAULT '' COMMENT '姓名'")
    private String name;

    @Column(columnDefinition = "INT(11) NOT NULL DEFAULT 0 COMMENT '年龄'")
    private Integer age;

    @Column
    private BigDecimal balance;
}
