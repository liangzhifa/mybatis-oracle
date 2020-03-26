package com.zhifa.mybatisoracle.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
@TableName(value = "LZF")
public class Lzf implements Serializable {
    /**
     * id
     */
    @TableId(value = "ID", type = IdType.ID_WORKER)
    private Long id;

    /**
     * 名字
     */
    @TableField(value = "NAME")
    private String name;

    /**
     * 生日
     */
    @TableField(value = "BIRTH_DAY")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date birthDay;

    /**
     * 文章
     */
    @TableField(value = "ARTICLE")
    private String article;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_NAME = "NAME";

    public static final String COL_BIRTH_DAY = "BIRTH_DAY";

    public static final String COL_ARTICLE = "ARTICLE";
}
