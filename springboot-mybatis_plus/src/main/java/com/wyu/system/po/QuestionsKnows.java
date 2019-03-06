package com.wyu.system.po;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("sys_questions_knows")
public class QuestionsKnows implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 题目Id
     */
    @TableField("QuestionId")
    private Integer QuestionId;

    /**
     * 知识点ID
     */
    @TableField("KnowsId")
    private Integer KnowsId;


}
