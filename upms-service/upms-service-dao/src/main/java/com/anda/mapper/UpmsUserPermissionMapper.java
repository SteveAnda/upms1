package com.anda.mapper;

import com.anda.pojo.UpmsUserPermission;
import com.anda.pojo.UpmsUserPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UpmsUserPermissionMapper {
    int countByExample(UpmsUserPermissionExample example);

    int deleteByExample(UpmsUserPermissionExample example);

    int deleteByPrimaryKey(Integer userPermissionId);

    int insert(UpmsUserPermission record);

    int insertSelective(UpmsUserPermission record);

    List<UpmsUserPermission> selectByExampleWithRowbounds(UpmsUserPermissionExample example, RowBounds rowBounds);

    List<UpmsUserPermission> selectByExample(UpmsUserPermissionExample example);

    UpmsUserPermission selectByPrimaryKey(Integer userPermissionId);

    int updateByExampleSelective(@Param("record") UpmsUserPermission record, @Param("example") UpmsUserPermissionExample example);

    int updateByExample(@Param("record") UpmsUserPermission record, @Param("example") UpmsUserPermissionExample example);

    int updateByPrimaryKeySelective(UpmsUserPermission record);

    int updateByPrimaryKey(UpmsUserPermission record);
}