package com.anda.mapper;

import com.anda.pojo.UpmsSystem;
import com.anda.pojo.UpmsSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UpmsSystemMapper {
    int countByExample(UpmsSystemExample example);

    int deleteByExample(UpmsSystemExample example);

    int deleteByPrimaryKey(Integer systemId);

    int insert(UpmsSystem record);

    int insertSelective(UpmsSystem record);

    List<UpmsSystem> selectByExampleWithRowbounds(UpmsSystemExample example, RowBounds rowBounds);

    List<UpmsSystem> selectByExample(UpmsSystemExample example);

    UpmsSystem selectByPrimaryKey(Integer systemId);

    int updateByExampleSelective(@Param("record") UpmsSystem record, @Param("example") UpmsSystemExample example);

    int updateByExample(@Param("record") UpmsSystem record, @Param("example") UpmsSystemExample example);

    int updateByPrimaryKeySelective(UpmsSystem record);

    int updateByPrimaryKey(UpmsSystem record);
}