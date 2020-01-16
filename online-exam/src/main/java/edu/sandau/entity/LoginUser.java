package edu.sandau.entity;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class LoginUser implements Serializable {
    @JSONField(serialize = false)
    private final String TABLE_NAME = "login_user";

    private Integer id;
    private String username;
    private String password;
    private String realname;
    private Integer gender;
    private String email;
    private String telephone;
    /***
     * 组织
     */
    private String organization;
    /***
     * 专业id
     */
    private String major_id;
    /***
     * 班级id
     */
    private String class_id;

    @ApiModelProperty(value = "用户角色枚举{0:普通用户,1:试题管理员,2:系统管理员}, 前端需赋值, 未赋值则默认为0")
    private Integer role;

    @JSONField(serialize = false)
    private Date createtime;
    @JSONField(serialize = false)
    private Date updatetime;

    @JSONField(serialize = false)
    @ApiModelProperty(value = "密保问题list")
    private List<String> question;

    @JSONField(serialize = false)
    @ApiModelProperty(value = "密保答案list")
    private List<String> answer;
}
