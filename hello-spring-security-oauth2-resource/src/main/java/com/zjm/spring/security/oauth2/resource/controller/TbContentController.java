package com.zjm.spring.security.oauth2.resource.controller;


import com.zjm.spring.security.oauth2.resource.dto.ResponseResult;
import com.zjm.spring.security.oauth2.resource.entity.TbContent;
import com.zjm.spring.security.oauth2.resource.service.ITbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-01
 */
@RestController
public class TbContentController {
    @Autowired
    ITbContentService contentService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ResponseResult<List<TbContent>> listResponseResult(){
        List<TbContent> list = contentService.list();
        return new ResponseResult<List<TbContent>>(HttpStatus.OK.value(),HttpStatus.OK.toString(),list);
    }
}
