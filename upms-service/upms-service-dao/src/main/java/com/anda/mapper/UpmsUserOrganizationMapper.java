package com.anda.mapper;

import com.anda.pojo.UpmsUserOrganization;
import com.anda.pojo.UpmsUserOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UpmsUserOrganizationMapper {
    int countByExample(UpmsUserOrganizationExample example);

    int deleteByExample(UpmsUserOrganizationExample example);

    int deleteByPrimaryKey(Integer userOrganizationId);

    int insert(UpmsUserOrganization record);

    int insertSelective(UpmsUserOrganization record);

    List<UpmsUserOrganization> selectByExampleWithRowbounds(UpmsUserOrganizationExample example, RowBounds rowBounds);

    List<UpmsUserOrganization> selectByExample(UpmsUserOrganizationExample example);

    UpmsUserOrganization selectByPrimaryKey(Integer userOrganizationId);

    int updateByExampleSelective(@Param("record") UpmsUserOrganization record, @Param("example") UpmsUserOrganizationExample example);

    int updateByExample(@Param("record") UpmsUserOrganization record, @Param("example") UpmsUserOrganizationExample example);

    int updateByPrimaryKeySelective(UpmsUserOrganization record);

    int updateByPrimaryKey(UpmsUserOrganization record);
}