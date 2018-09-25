package com.duan.blogos.service.entity.blog;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created on 2017/12/12.
 * 博文
 *
 * @author DuanJiaNing
 */
@Data
public class Blog implements Serializable {

    //博文id
    private Long id;

    //博文所属博主id
    private Long bloggerId;

    //文章状态
    private Integer state;

    //博文标题
    private String title;

    //博文主体内容
    private String content;

    //博文主体内容(md格式)
    private String contentMd;

    //博文摘要
    private String summary;

    //首次发布日期
    private Timestamp releaseDate;

    //最后一次修改时间
    private Timestamp nearestModifyDate;

    //博文关键字
    private String keyWords;

}
