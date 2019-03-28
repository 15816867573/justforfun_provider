package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.Link;
import com.zhangq.mayday.model.domain.LinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LinkMapper {
	long countByExample(LinkExample example);

	int deleteByExample(LinkExample example);

	int deleteByPrimaryKey(Integer linkId);

	int insert(Link record);

	int insertSelective(Link record);

	List<Link> selectByExample(LinkExample example);

	Link selectByPrimaryKey(Integer linkId);

	int updateByExampleSelective(@Param("record") Link record, @Param("example") LinkExample example);

	int updateByExample(@Param("record") Link record, @Param("example") LinkExample example);

	int updateByPrimaryKeySelective(Link record);

	int updateByPrimaryKey(Link record);
}