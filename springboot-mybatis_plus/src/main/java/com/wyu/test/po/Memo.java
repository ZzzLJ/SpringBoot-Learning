package com.wyu.test.po;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
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
@TableName("sys_memo")
public class Memo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 所属用户Id
     */
    @TableField("Id")
    private String Id;

    /**
     * 事件开始时间
     */
    @TableField("Start_time")
    private LocalDateTime startTime;

    /**
     * 事件结束时间
     */
    @TableField("End_time")
    private LocalDateTime endTime;

    /**
     * 备注详情
     */
    @TableField("Content")
    private String Content;

    /**
     * 状态，0：不可用，1：可用，删除后状态标记为0
     */
    @TableField("Status")
    private String Status;

    /**
     * 用户类型，0：管理员（教师），1：学生
     */
    @TableField("Type")
    private String Type;


}
