package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.*;
import com.zhangq.mayday.model.dto.ArchiveBo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ArticleMapper {
	long countByExample(ArticleExample example);

	int deleteByExample(ArticleExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Article record);

	int insertSelective(Article record);

	List<Article> selectByExample(ArticleExample example);

	Article selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

	int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

	int updateByPrimaryKeySelective(Article record);

	int updateByPrimaryKey(Article record);
	/**
	 * articleMapperCustom
	 */
	@RequestMapping(value = "/article/articleMapperCustom")
	List<ArticleCustom> articleMapperCustom(@RequestParam("articleStatus") Integer articleStatus);

	@RequestMapping(value = "/article/findAllArticle")
	List<ArticleCustom> findAllArticle(@RequestParam("articleStatus") Integer articleStatus, @RequestParam("articlePost") String articlePost);

	@RequestMapping(value = "/article/countByStatus")
	Integer countByStatus(@Param(value = "articleStatus") Integer articleStatus, @Param(value = "articlePost") String articlePost);

	@RequestMapping(value = "/article/updateStatus")
	void updateStatus(@RequestParam("id") Integer id, @RequestParam("articleStatus") Integer articleStatus);

	@RequestMapping(value = "/article/findByArticleId")
	ArticleCustom findByArticleId(@RequestParam("article_id") Integer article_id);

	@RequestMapping(value = "/article/findDateAndCount")
	List<ArchiveBo> findDateAndCount();

	@RequestMapping(value = "/article/findPageArticle")
	List<ArticleCustom> findPageArticle(@RequestBody ArticleCustom articleCustom);

	@RequestMapping(value = "/article/findRepeatByUrl")
	int findRepeatByUrl(@RequestParam("articleUrl") String articleUrl);

	@RequestMapping(value = "/article/findByArticleUrl")
	ArticleCustom findByArticleUrl(@RequestParam("articleUrl") String articleUrl);

	@RequestMapping(value = "/article/findArtileByCategory")
	List<ArticleCustom> findArtileByCategory(@RequestBody Category category, @RequestParam("articleStatus") Integer articleStatus);

	@RequestMapping(value = "/article/findArtileByTag")
	List<ArticleCustom> findArtileByTag(@RequestBody Tag tag, @RequestParam("articleStatus") Integer articleStatus);
}