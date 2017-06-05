package cn.jpp.service;

import cn.jpp.dao.tdb.mapper.IUserInfoDAO;
import cn.jpp.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by 宏宇 on 2017/3/12.
 */
//@Service("userService")
@Component
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private IUserInfoDAO dao;

    public void add(UserInfo info) {
        dao.add(info);
    }

//    public IUserInfoDAO getDao() {
//        return dao;
//    }

//    public void setDao(IUserInfoDAO dao) {
//        this.dao = dao;
//    }
}
