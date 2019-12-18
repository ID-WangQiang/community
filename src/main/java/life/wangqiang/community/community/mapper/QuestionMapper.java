package life.wangqiang.community.community.mapper;

import life.wangqiang.community.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @version : V1.0
 * @ClassName: QuestionMapper
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/17 下午8:22
 */
@Mapper
public interface QuestionMapper {


    @Insert("insert into question (title,description,gmt_create,gmt_modified,creator,comment_count,view_count,like_count,tag) " +
            "values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{commentCount},#{viewCount},#{likeCount},#{tag})")
     void create(Question question);

    @Select("select * from question")
    List<Question> list();
}