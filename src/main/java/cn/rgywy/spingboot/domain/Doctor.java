package cn.rgywy.spingboot.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author RGY
 * @create 2019/4/27 - 11:45
 */
@ApiModel(value = "医生对象模型")
public class Doctor {

    @ApiModelProperty(value = "id" ,required = true)
    private Integer id;
    @ApiModelProperty(value = "医生姓名",required = true)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
