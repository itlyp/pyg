package com.pinyougou.pojogroup;

import com.pinyougou.pojo.TbSpecification;
import com.pinyougou.pojo.TbSpecificationOption;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * <p>Description: 规格组合实体类 </p>
 * <p>User: 李元璞</P>
 * <p>Date: 2018-02-07</p>
 * <p>Time: 9:06</p>
 */
public class Specification implements Serializable{
    private TbSpecification specification;
    private List<TbSpecificationOption> specificationOptionList;

    public TbSpecification getSpecification() {
        return specification;
    }
    public void setSpecification(TbSpecification specification) {
        this.specification = specification;
    }
    public List<TbSpecificationOption> getSpecificationOptionList() {
        return specificationOptionList;
    }
    public void setSpecificationOptionList(List<TbSpecificationOption> specificationOptionList) {
        this.specificationOptionList = specificationOptionList;
    }

}
