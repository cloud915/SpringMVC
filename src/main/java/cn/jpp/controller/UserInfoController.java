package cn.jpp.controller;

import cn.jpp.entity.UserInfo;
import cn.jpp.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by 宏宇 on 2017/3/12.
 */
//@org.springframework.stereotype.Controller
//@RequestMapping("/userAction/")
public class UserInfoController implements Controller {

    private IUserInfoService service;

    //@RequestMapping("add")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String uname = request.getParameter("name");
        Integer uage = Integer.valueOf(request.getParameter("age"));

        UserInfo info = new UserInfo();
        info.setAge(uage);
        info.setName(uname);

        service.add(info);
        return new ModelAndView("/welcome.jsp");
    }

    public IUserInfoService getService() {
        return service;
    }

    public void setService(IUserInfoService service) {
        this.service = service;
    }
}
