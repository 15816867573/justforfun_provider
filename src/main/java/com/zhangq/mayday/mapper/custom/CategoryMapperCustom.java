package com.zhangq.mayday.mapper.custom;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapperCustom {

	List<Integer> selectByarticleId(Integer id);

	void delete(@Param(value = "list") List<Integer> cateList, @Param(value = "articleId") Integer articleId);

}