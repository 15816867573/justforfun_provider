package com.zhangq.mayday.controller;

import com.zhangq.mayday.mapper.generator.ArticleMapper;
import com.zhangq.mayday.model.domain.*;
import com.zhangq.mayday.model.dto.ArchiveBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    ArticleMapper articleMapper;

    @RequestMapping(value = "/countByExample")
    @ResponseBody
    public long countByExample(@RequestBody ArticleExample example) {
        return articleMapper.countByExample(example);
    }

    @RequestMapping(value = "/deleteByExample")
    @ResponseBody
    public int deleteByExample(@RequestBody ArticleExample example) {
        return articleMapper.deleteByExample(example);
    }

    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(Integer id) {
        return articleMapper.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insert(@RequestBody Article example) {
        return articleMapper.insert(example);
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody Article example) {
        return articleMapper.insertSelective(example);
    }

    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public List<Article> selectByExample(@RequestBody ArticleExample example) {
        return articleMapper.selectByExample(example);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public Article selectByPrimaryKey(@RequestParam("id") Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/updateByExampleSelective")
    @ResponseBody
    public int updateByExampleSelective(@RequestBody Article record, @RequestBody ArticleExample example) {
        return articleMapper.updateByExampleSelective(record, example);
    }

    @RequestMapping(value = "/updateByExample")
    @ResponseBody
    public long updateByExample(@RequestBody Article record, @RequestBody ArticleExample example) {
        return articleMapper.updateByExample(record, example);
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public long updateByPrimaryKeySelective(@RequestBody Article example) {
        return articleMapper.updateByPrimaryKeySelective(example);
    }

    @RequestMapping(value = "/updateByPrimaryKey")
    @ResponseBody
    public long updateByPrimaryKey(@RequestBody Article example) {
        return articleMapper.updateByPrimaryKey(example);
    }
    /**
     * articleMapperCustom
    * */
    @RequestMapping(value = "/articleMapperCustom")
    @ResponseBody
    public List<ArticleCustom> articleMapperCustom(@RequestParam("articleStatus") Integer articleStatus) {
        return articleMapper.articleMapperCustom(articleStatus);
    }
    @RequestMapping(value = "/findAllArticle")
    @ResponseBody
    public List<ArticleCustom> findAllArticle(@RequestParam("articleStatus") Integer articleStatus,  @RequestParam("articlePost") String articlePost) {
        return articleMapper.findAllArticle(articleStatus,articlePost);
    }
    @RequestMapping(value = "/countByStatus")
    @ResponseBody
    public Integer countByStatus(@RequestParam(value = "articleStatus",required = false)  Integer articleStatus, @RequestParam(value = "articlePost",required = false) String articlePost) {
         Integer i= articleMapper.countByStatus(articleStatus,articlePost);
        return i;
    }
    @RequestMapping(value = "/updateStatus")
    @ResponseBody
    public void updateStatus(@RequestParam("id") Integer id, @RequestParam("articleStatus") Integer articleStatus) {
         articleMapper.updateStatus(id,articleStatus);
    }
    @RequestMapping(value = "/findByArticleId")
    @ResponseBody
    public ArticleCustom findByArticleId(Integer article_id) {
        return articleMapper.findByArticleId(article_id);
    }
    @RequestMapping(value = "/findDateAndCount")
    @ResponseBody
    public List<ArchiveBo> findDateAndCount() {
        return articleMapper.findDateAndCount();
    }
    @RequestMapping(value = "/findPageArticle")
    @ResponseBody
    public List<ArticleCustom> findPageArticle(@RequestBody ArticleCustom articleCustom) {
        return articleMapper.findPageArticle(articleCustom);
    }
    @RequestMapping(value = "/findRepeatByUrl")
    @ResponseBody
    public int findRepeatByUrl(@RequestParam("articleUrl") String articleUrl) {
        return articleMapper.findRepeatByUrl(articleUrl);
    }
    @RequestMapping(value = "/findByArticleUrl")
    @ResponseBody
    public ArticleCustom findByArticleUrl( @RequestParam("articleUrl")String articleUrl) {
        return articleMapper.findByArticleUrl(articleUrl);
    }
    @RequestMapping(value = "/findArtileByCategory")
    @ResponseBody
    public List<ArticleCustom> findArtileByCategory(@RequestBody Category category, @RequestParam("articleStatus") Integer articleStatus) {
        return articleMapper.findArtileByCategory(category,articleStatus);
    }
    @RequestMapping(value = "/findArtileByTag")
    @ResponseBody
    public List<ArticleCustom> findArtileByTag(@RequestBody Tag tag, @RequestParam("articleStatus") Integer articleStatus) {
        return articleMapper.findArtileByTag(tag,articleStatus);
    }


}
