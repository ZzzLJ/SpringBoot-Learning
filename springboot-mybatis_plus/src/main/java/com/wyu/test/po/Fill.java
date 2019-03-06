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
@TableName("sys_fill")
public class Fill implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 填空题题目ID
     */
    @TableId("QuestionId")
    private Integer QuestionId;

    /**
     * 填空题的横线数
     */
    @TableField("Line_count")
    private Integer lineCount;


}
