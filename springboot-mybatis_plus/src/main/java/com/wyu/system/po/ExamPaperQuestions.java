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
@TableName("sys_exam_paper_questions")
public class ExamPaperQuestions implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 试卷Id
     */
    @TableField("ExamPaperId")
    private String ExamPaperId;

    /**
     * 题目类型
     */
    @TableField("QuestionType")
    private String QuestionType;

    /**
     * 题目Id
     */
    @TableField("QuestionId")
    private Integer QuestionId;

    /**
     * 题目分值
     */
    @TableField("Point")
    private Integer Point;


}
