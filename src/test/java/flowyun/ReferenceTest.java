package flowyun;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.lang.ref.*;
import java.util.List;

/**
 * 四种引用类型测试
 */
@Slf4j
public class ReferenceTest {

    @Test
    public void strongReference(){
        Object obj = new Object();
        log.info("{}", obj);
        System.gc();
        log.info("{}", obj);
    }

    @Test
    public void softReference(){
        Object obj = new Object();
        SoftReference<Object> soft = new SoftReference<>(obj);
        obj = null;
        log.info("{}", soft.get());
        System.gc();
        log.info("{}", soft.get());
    }

    @Test
    public void weakReference(){
        Object obj = new Object();
        WeakReference<Object> weak = new WeakReference<>(obj);
        obj = null;
        log.info("{}", weak.get());
        System.gc();
        log.info("{}", weak.get());
    }

    @Test
    public void usePhantomReference(){
        ReferenceQueue<Object> rq = new ReferenceQueue<>();
        Object obj = new Object();
        PhantomReference<Object> phantomReference = new PhantomReference<>(obj,rq);
        obj = null;
        log.info("{}",phantomReference.get());
        System.gc();
        Reference<Object> r = (Reference<Object>)rq.poll();
        log.info("{}",r);
    }

}
