package admin.service;

import admin.entity.TesseractTrigger;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author nickle
 * @since 2019-07-03
 */
public interface ITesseractTriggerService extends IService<TesseractTrigger> {
    List<TesseractTrigger> findTriggerWithLock(int batchSize, long time, Integer timeWindowSize);

    IPage<TesseractTrigger> listByPage(Integer currentPage, Integer pageSize);

    void executeTrigger(Integer triggerId);

    void updateTriggerStatus(List<TesseractTrigger> triggerList, Integer status);

    void updateTriggerStatusAndCalculate(List<TesseractTrigger> triggerList, Integer status);

    void updateTriggerStatusAndDeleteFiredTrigger(List<TesseractTrigger> triggerList, Integer status);

    void saveTrigger(TesseractTrigger tesseractTrigger) throws Exception;
}
