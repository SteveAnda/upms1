package com.anda.mapper;

import com.anda.pojo.UpmsRole;
import com.anda.pojo.UpmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UpmsRoleMapper {
    int countByExample(UpmsRoleExample example);

    int deleteByExample(UpmsRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(UpmsRole record);

    int insertSelective(UpmsRole record);

    List<UpmsRole> selectByExampleWithRowbounds(UpmsRoleExample example, RowBounds rowBounds);

    List<UpmsRole> selectByExample(UpmsRoleExample example);

    UpmsRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") UpmsRole record, @Param("example") UpmsRoleExample example);

    int updateByExample(@Param("record") UpmsRole record, @Param("example") UpmsRoleExample example);

    int updateByPrimaryKeySelective(UpmsRole record);

    int updateByPrimaryKey(UpmsRole record);
}