package com.example.aishuatiserver.JavaBean;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

@Data
public class News {
    private int sander_Id;
    private int receiver_Id;
    private String content;
    private Date createTime;
    private int state;
}
