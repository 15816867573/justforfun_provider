package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.Attachment;
import com.zhangq.mayday.model.domain.AttachmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttachmentMapper {
	long countByExample(AttachmentExample example);

	int deleteByExample(AttachmentExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Attachment record);

	int insertSelective(Attachment record);

	List<Attachment> selectByExample(AttachmentExample example);

	Attachment selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Attachment record, @Param("example") AttachmentExample example);

	int updateByExample(@Param("record") Attachment record, @Param("example") AttachmentExample example);

	int updateByPrimaryKeySelective(Attachment record);

	int updateByPrimaryKey(Attachment record);
}