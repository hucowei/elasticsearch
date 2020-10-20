package com.zjh.web.controller;

import com.zjh.web.util.AjaxJsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dateTest")
public class DateTestController {

    @RequestMapping("/getDateStr")
    @ResponseBody
    public AjaxJsonResult getDateStr(String time){
        AjaxJsonResult ajaxJsonResult = new AjaxJsonResult();
        ajaxJsonResult.setReturnData(1324564748);
        return ajaxJsonResult;
    }
}
