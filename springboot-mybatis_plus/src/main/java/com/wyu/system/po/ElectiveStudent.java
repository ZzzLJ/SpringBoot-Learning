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
@TableName("sys_elective_student")
public class ElectiveStudent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 选修课程代号
     */
    @TableField("CourseAccount")
    private String CourseAccount;

    /**
     * 学生学号
     */
    @TableField("StudentAccount")
    private String StudentAccount;


}
