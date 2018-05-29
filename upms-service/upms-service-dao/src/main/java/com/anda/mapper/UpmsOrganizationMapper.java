package com.anda.mapper;

import com.anda.pojo.UpmsOrganization;
import com.anda.pojo.UpmsOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UpmsOrganizationMapper {
    int countByExample(UpmsOrganizationExample example);

    int deleteByExample(UpmsOrganizationExample example);

    int deleteByPrimaryKey(Integer organizationId);

    int insert(UpmsOrganization record);

    int insertSelective(UpmsOrganization record);

    List<UpmsOrganization> selectByExampleWithRowbounds(UpmsOrganizationExample example, RowBounds rowBounds);

    List<UpmsOrganization> selectByExample(UpmsOrganizationExample example);

    UpmsOrganization selectByPrimaryKey(Integer organizationId);

    int updateByExampleSelective(@Param("record") UpmsOrganization record, @Param("example") UpmsOrganizationExample example);

    int updateByExample(@Param("record") UpmsOrganization record, @Param("example") UpmsOrganizationExample example);

    int updateByPrimaryKeySelective(UpmsOrganization record);

    int updateByPrimaryKey(UpmsOrganization record);
}