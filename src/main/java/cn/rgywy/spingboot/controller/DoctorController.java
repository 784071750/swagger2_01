package cn.rgywy.spingboot.controller;

import cn.rgywy.spingboot.domain.Doctor;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RGY
 * @create 2019/4/27 - 11:45
 */

@Controller
@RequestMapping("/api")
@Api(value = "医生模拟接口")
public class DoctorController {

    @RequestMapping(value = "/addDoctor",method = RequestMethod.POST)
    @ApiOperation(value = "添加医生信息",notes = "")
    public String addDoctor(@RequestBody Doctor doctor) throws Exception{
        if(doctor == null || doctor.getId()==null){
            throw new Exception("添加医生失败");
        }
        try {
            System.out.println("成功---------->"+doctor.getName());
        }catch (Exception e){
            throw  new Exception("添加医生失败");
        }
        return  doctor.getId().toString();

    }

    @RequestMapping(value = "/deleteDoctor",method = RequestMethod.DELETE)
    @ApiOperation(value = "删除医生信息")
    @ApiImplicitParam(value = "医生Id",paramType = "query",name = "doctorId")
    public String deleteDoctor(Integer doctorId){
        if(doctorId>2){
            return  "删除失败";
        }
        return  "删除成功";
    }
}
