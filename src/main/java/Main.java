import common.FileUtils;
import common.PropertyUtil;
import common.ZipTools;
import entity.PropsStr;
import fileparse.SDIFileInsertProcessor;
import org.apache.log4j.Logger;

/**
 * @Description:
 * @Author: nianjie.chen
 * @Date: 10/7/2019
 */
public class Main {
    private static Logger logger = Logger.getLogger(Math.class);
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        ZipTools.unzipFolder(PropertyUtil.getPropValue(PropsStr.WorkPath));
        FileUtils.moveGzFiles(PropertyUtil.getPropValue(PropsStr.WorkPath), PropertyUtil.getPropValue(PropsStr.GzFileAchievePath));
        SDIFileInsertProcessor processor = new SDIFileInsertProcessor();
        processor.process();
        Long end = System.currentTimeMillis();
        logger.info("一共花费时间(ms)：" + (end - start));
    }
}