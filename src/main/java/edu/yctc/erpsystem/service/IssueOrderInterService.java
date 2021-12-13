package edu.yctc.erpsystem.service;

import edu.yctc.erpsystem.entity.IssueOrderDO;
import edu.yctc.erpsystem.entity.ResultDO;
import edu.yctc.erpsystem.util.PageUtils;
import edu.yctc.erpsystem.vo.IssueOrderVO;

import java.util.Map;

/**
 * 生产补单表
 *
 * @author smile
 */
public interface IssueOrderInterService {

    /**
     * 获得所有生产补单信息
     *
     * @param params 过滤参数
     * @return 生产补单信息链表
     */
    ResultDO<PageUtils<IssueOrderVO>> getIssueOrder(Map<String, Object> params);

    /**
     * 通过条件获得过滤后的生产补单信息
     *
     * @param params 过滤参数
     * @return 生产补单信息链表
     */
    ResultDO<PageUtils<IssueOrderVO>> getIssueOrderByConditions(Map<String, Object> params);

    /**
     * 插入生产补单记录
     *
     * @param issueOrder 生产补单信息视图
     * @return 是否成功
     */
    ResultDO<Void> insert(IssueOrderDO issueOrder);

    /**
     * 删除记录
     *
     * @param id 记录id
     * @return 是否成功
     */
    ResultDO<Void> delete(String id);

    /**
     * 通过id修改订单数量
     *
     * @param issueOrderDO 生产补单实体
     * @return 是否成功
     */
    ResultDO<Void> updateIssueOrder(IssueOrderDO issueOrderDO);

    /**
     * 通过id修改checkerId checkerFlag
     *
     * @param issueOrderDO 生产补单实体
     * @return 是否成功
     */
    ResultDO<Void> updateCheckerById(IssueOrderDO issueOrderDO);

    /**
     * 导出excel
     *
     * @param issueOrders 生产补单信息视图
     * @return 是否成功
     */
    ResultDO<Void> exportExcel(IssueOrderVO[] issueOrders);

    /**
     * 通过生产补单明细id完结，插入一条制造流程单
     *
     * @param issueOrder 生产补单信息视图
     * @return 是否成功
     */
    ResultDO<Void> make(IssueOrderVO issueOrder);

}
