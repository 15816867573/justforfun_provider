package com.zhangq.mayday.controller;

import com.zhangq.mayday.mapper.generator.AttachmentMapper;
import com.zhangq.mayday.model.domain.Attachment;
import com.zhangq.mayday.model.domain.AttachmentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "attachment")
public class AttachmentController {
    @Autowired
    AttachmentMapper attachmentMapper;

    @RequestMapping(value = "/countByExample")
    @ResponseBody
    public long countByExample(@RequestBody AttachmentExample example) {
        return attachmentMapper.countByExample(example);
    }

    @RequestMapping(value = "/deleteByExample")
    @ResponseBody
    public int deleteByExample(@RequestBody AttachmentExample example) {
        return attachmentMapper.deleteByExample(example);
    }

    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(@RequestParam("id") Integer id) {
        return attachmentMapper.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insert(@RequestBody Attachment example) {
        return attachmentMapper.insert(example);
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody Attachment example) {
        return attachmentMapper.insertSelective(example);
    }

    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public List<Attachment> selectByExample(@RequestBody(required = false) AttachmentExample example) {
        return attachmentMapper.selectByExample(example);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public Attachment selectByPrimaryKey(Integer id) {
        return attachmentMapper.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/updateByExampleSelective")
    @ResponseBody
    public int updateByExampleSelective(@RequestBody Attachment record, @RequestBody AttachmentExample example) {
        return attachmentMapper.updateByExampleSelective(record, example);
    }

    @RequestMapping(value = "/updateByExample")
    @ResponseBody
    public int updateByExample(@RequestBody Attachment record, @RequestBody AttachmentExample example) {
        return attachmentMapper.updateByExample(record, example);
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(@RequestBody Attachment example) {
        return attachmentMapper.updateByPrimaryKeySelective(example);
    }

    @RequestMapping(value = "/updateByPrimaryKey")
    @ResponseBody
    public int updateByPrimaryKey(@RequestBody Attachment example) {
        return attachmentMapper.updateByPrimaryKey(example);
    }
}
