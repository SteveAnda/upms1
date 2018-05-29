package com.anda.mapper;

import com.anda.pojo.UpmsUserRole;
import com.anda.pojo.UpmsUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UpmsUserRoleMapper {
    int countByExample(UpmsUserRoleExample example);

    int deleteByExample(UpmsUserRoleExample example);

    int deleteByPrimaryKey(Integer userRoleId);

    int insert(UpmsUserRole record);

    int insertSelective(UpmsUserRole record);

    List<UpmsUserRole> selectByExampleWithRowbounds(UpmsUserRoleExample example, RowBounds rowBounds);

    List<UpmsUserRole> selectByExample(UpmsUserRoleExample example);

    UpmsUserRole selectByPrimaryKey(Integer userRoleId);

    int updateByExampleSelective(@Param("record") UpmsUserRole record, @Param("example") UpmsUserRoleExample example);

    int updateByExample(@Param("record") UpmsUserRole record, @Param("example") UpmsUserRoleExample example);

    int updateByPrimaryKeySelective(UpmsUserRole record);

    int updateByPrimaryKey(UpmsUserRole record);
}