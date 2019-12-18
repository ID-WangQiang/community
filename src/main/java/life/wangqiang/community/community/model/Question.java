package life.wangqiang.community.community.model;

import lombok.Data;

/**
 * @version : V1.0
 * @ClassName: Question
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/17 下午8:29
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
}