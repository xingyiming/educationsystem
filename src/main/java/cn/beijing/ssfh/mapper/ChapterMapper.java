package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Chapter;

public interface ChapterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer chapterId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbggenerated
     */
    int insert(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbggenerated
     */
    int insertSelective(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbggenerated
     */
    Chapter selectByPrimaryKey(Integer chapterId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Chapter record);
}