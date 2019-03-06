package com.wyu.system.po;

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
@TableName("sys_choice")
public class Choice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 选择题题目ID
     */
    @TableId("QuestionId")
    private Integer QuestionId;

    /**
     * 选项A
     */
    @TableField("ChoiceA")
    private String ChoiceA;

    /**
     * 选项B
     */
    @TableField("ChoiceB")
    private String ChoiceB;

    /**
     * 选项C
     */
    @TableField("ChoiceC")
    private String ChoiceC;

    /**
     * 选项D
     */
    @TableField("ChoiceD")
    private String ChoiceD;


}
