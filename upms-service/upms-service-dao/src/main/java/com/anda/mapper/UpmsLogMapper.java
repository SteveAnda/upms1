package com.anda.mapper;

import com.anda.pojo.UpmsLog;
import com.anda.pojo.UpmsLogExample;
import com.anda.pojo.UpmsLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UpmsLogMapper {
    int countByExample(UpmsLogExample example);

    int deleteByExample(UpmsLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(UpmsLogWithBLOBs record);

    int insertSelective(UpmsLogWithBLOBs record);

    List<UpmsLogWithBLOBs> selectByExampleWithBLOBsWithRowbounds(UpmsLogExample example, RowBounds rowBounds);

    List<UpmsLogWithBLOBs> selectByExampleWithBLOBs(UpmsLogExample example);

    List<UpmsLog> selectByExampleWithRowbounds(UpmsLogExample example, RowBounds rowBounds);

    List<UpmsLog> selectByExample(UpmsLogExample example);

    UpmsLogWithBLOBs selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") UpmsLogWithBLOBs record, @Param("example") UpmsLogExample example);

    int updateByExampleWithBLOBs(@Param("record") UpmsLogWithBLOBs record, @Param("example") UpmsLogExample example);

    int updateByExample(@Param("record") UpmsLog record, @Param("example") UpmsLogExample example);

    int updateByPrimaryKeySelective(UpmsLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UpmsLogWithBLOBs record);

    int updateByPrimaryKey(UpmsLog record);
}