package com.example.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @ClassName: ExcelData
 * @Description:
 * @Author: 刘苏义
 * @Date: 2023年04月28日14:08
 * @Version: 1.0
 **/
@Data
public class ExcelData {
    //设置excel表头名称
    @ExcelProperty("学生编号")
    private Integer sno;
    @ExcelProperty("学生姓名")
    private String sname;
}