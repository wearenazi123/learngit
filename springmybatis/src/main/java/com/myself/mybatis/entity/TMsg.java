package com.myself.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/** * Created by MySelf on 2019/4/9. */
@Data
public class TMsg implements Serializable {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

}
