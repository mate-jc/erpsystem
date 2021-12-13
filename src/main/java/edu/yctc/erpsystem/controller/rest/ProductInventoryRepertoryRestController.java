package edu.yctc.erpsystem.controller.rest;

import edu.yctc.erpsystem.entity.ProductAllocationDO;
import edu.yctc.erpsystem.entity.ProductExportDO;
import edu.yctc.erpsystem.entity.ResultDO;
import edu.yctc.erpsystem.util.PageUtils;
import edu.yctc.erpsystem.vo.ProductInventoryRepertoryVO;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 成品库存数据接口
 *
 * @author zzy
 */
public interface ProductInventoryRepertoryRestController {

    /**
     * 获得所有成品库存信息
     *
     *@param params 过滤参数
     * @return 成品库存信息链表
     */
    ResultDO<PageUtils<ProductInventoryRepertoryVO>> getProductInventoryRepertory(Map<String, Object> params);

    /**
     * 通过条件获得过滤后的成品库存信息
     *
     * @param params 过滤参数
     * @return 成品库存信息链表
     */
    ResultDO<PageUtils<ProductInventoryRepertoryVO>> getProductInventoryRepertoryByConditions(Map<String, Object> params);

    /**
     * 成品库存数量改变
     *
     * @param productInventoryRepertoryVO 成品出库实体
     *  @return 是否成功
     */
    ResultDO<Void> updateStorageAmount(ProductInventoryRepertoryVO productInventoryRepertoryVO);

    /**
     * 导出excel
     *
     * @param productInventoryRepertoryVO 成品入库信息视图
     * @return 是否成功
     */
    ResultDO<Void> exportExcel(ProductInventoryRepertoryVO[] productInventoryRepertoryVO);

    /**
     * 成品销售功能
     *
     * @param productExportDO 成品出库实体
     * @param httpSession session
     * @return 是否成功
     */
    ResultDO<Void> productInventorySale(ProductExportDO productExportDO, HttpSession httpSession);

    /**
     * 成品调拨功能
     *
     * @param productAllocationDO 成品调拨实体
     * @param httpSession session
     * @return 是否成功
     */
    ResultDO<Void> productAllocation(ProductAllocationDO productAllocationDO, HttpSession httpSession);

}
