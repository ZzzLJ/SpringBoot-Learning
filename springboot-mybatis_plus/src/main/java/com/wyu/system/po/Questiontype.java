package com.wyu.system.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author ZzzLJ
 * @Description
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_questiontype")
public class Questiontype implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 题型Id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 题目类型（0：单项选择题，1：多项选择题，2：判断题，3：填空题，4：编程题，可动态创建题型）
     */
    @TableField("Type")
    private String Type;

    /**
     * 题型简介
     */
    @TableField("Description")
    private String Description;


}
