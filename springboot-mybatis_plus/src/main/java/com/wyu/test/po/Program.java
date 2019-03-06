package com.wyu.test.po;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("sys_program")
public class Program implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编程题题目ID
     */
    @TableId("QuestionId")
    private Integer QuestionId;

    /**
     * 测试数据文件存储路径
     */
    @TableField("DataPath")
    private String DataPath;


}
