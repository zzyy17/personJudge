package com.teacher.judge.demo.bo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Proxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 用户
 */
@Entity
@Proxy(lazy = false)
@DynamicUpdate
@Data
public class User {
    /** 用户ID*/
    @Id
    @GenericGenerator(name="idGenerator", strategy="uuid") //这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator="idGenerator")
    @Column(length = 32)
    private String userId;
    /**用户姓名*/
    private String userName;
    /**密码*/
    private String password;
    /**昵称*/
    private String nikeName;
    /**人员类型*/
    private String personType;
    /**邮箱*/
    private String email;
    /**用户有效性*/
    private String valid;


}
