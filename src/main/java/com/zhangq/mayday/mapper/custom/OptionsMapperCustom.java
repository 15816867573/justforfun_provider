package com.zhangq.mayday.mapper.custom;

import com.zhangq.mayday.model.domain.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OptionsMapperCustom {
	/**
	 * 保存
	 * 
	 * @param map
	 */
	void saveMap(@Param("map") Map<String, Object> map);

	/**
	 * 所有设置选项
	 * 
	 * @return map
	 */
	List<Options> selectMap();

}