package entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * <p>Description: 分页结果封装对象 </p>
 * <p>User: 李元璞</P>
 * <p>Date: 2018-02-06</p>
 * <p>Time: 12:39</p>
 */
public class PageResult implements Serializable {

    private long total;//总记录数
    private List rows;//当前页结果

    public PageResult(long total,List rows){
        super();
        this.total=total;
        this.rows=rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
