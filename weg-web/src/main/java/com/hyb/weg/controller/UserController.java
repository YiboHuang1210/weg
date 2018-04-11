package com.hyb.weg.controller;

import com.hyb.weg.domain.bo.UserBO;
import com.hyb.weg.domain.request.UserRequest;
import com.hyb.weg.exception.WegException;
import com.hyb.weg.form.UserQueryForm;
import com.hyb.weg.response.CentreCutPageResponse;
import com.hyb.weg.service.impl.UserServiceImpl;
import com.hyb.weg.utils.CopyUtil;
import com.hyb.weg.utils.DateUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by HuangYibo on 2018/4/9.
 */
@Controller
@RequestMapping("/user")
@Api(value="/user", description="用户相关接口")
public class UserController extends BaseController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    /**
     * 分页查询线索用户列表
     *
     * @param form
     * @return
     * @throws WegException
     */
    @ApiOperation(value = "查询用户列表",notes = "查询用户列表.", httpMethod = "GET", response = UserBO.class)
    @RequestMapping(value = "/queryList", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> queryUserList(@ModelAttribute UserQueryForm form) throws WegException {

        UserRequest queryRequest = CopyUtil.transfer(form, UserRequest.class);

        DateFormat df = DateUtil.getFullDateFormat();
        queryRequest.setAddStartTime(DateUtil.parseDate(form.getAddStartTimeStr(), df));
        queryRequest.setAddEndTime(DateUtil.parseDate(form.getAddEndTimeStr(), df));

        int count = userServiceImpl.queryCount(queryRequest);

        List<UserBO> userBOList;
        if(count == 0) {
            userBOList = new ArrayList<>();
            return successDataResult(userBOList);
        }

        userBOList = CopyUtil.transferList(userServiceImpl.queryList(queryRequest), UserBO.class);

        CentreCutPageResponse<UserBO> response = new CentreCutPageResponse<>();
        response.setTotalCount(count);
        response.setDataList(userBOList);
        return successDataResult(response);
    }
}
