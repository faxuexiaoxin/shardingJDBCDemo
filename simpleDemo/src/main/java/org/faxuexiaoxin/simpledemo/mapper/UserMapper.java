package org.faxuexiaoxin.simpledemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.faxuexiaoxin.simpledemo.entity.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {


    @Select("select * from user where userId BETWEEN #{low} and #{high}")
    List<User> selectByUserRange(Long low, Long high);
}
