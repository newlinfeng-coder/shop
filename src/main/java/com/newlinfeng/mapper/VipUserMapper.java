package com.newlinfeng.mapper;

import com.newlinfeng.entity.VipUser;
import com.newlinfeng.entity.VipUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipUserMapper {
    long countByExample(VipUserExample example);

    int deleteByExample(VipUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VipUser record);

    int insertSelective(VipUser record);

    List<VipUser> selectByExampleWithBLOBs(VipUserExample example);

    List<VipUser> selectByExample(VipUserExample example);

    VipUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VipUser record, @Param("example") VipUserExample example);

    int updateByExampleWithBLOBs(@Param("record") VipUser record, @Param("example") VipUserExample example);

    int updateByExample(@Param("record") VipUser record, @Param("example") VipUserExample example);

    int updateByPrimaryKeySelective(VipUser record);

    int updateByPrimaryKeyWithBLOBs(VipUser record);

    int updateByPrimaryKey(VipUser record);
}