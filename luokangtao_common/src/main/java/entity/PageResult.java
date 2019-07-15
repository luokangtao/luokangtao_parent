package entity;

import lombok.Data;
import java.io.Serializable;
import java.util.List;

/**
 * 分页数据封装的实体类
 * @author luokangtao
 * @create 2019-07-14 21:24
 */
@Data
public class PageResult<T>  implements Serializable {
    /**
     * 当前页
     */
    private Long current;
    /**
     * 当前页显示多少条数据
     */
    private Long size;
    /**
     * 总条数
     */
    private Long total;
    /**
     * 当前页显示的数据
     */
    private List<T> rows;
}
