package hip.cda.hipcda.common;

import com.alibaba.druid.support.json.JSONUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @描述 :
 * @创建者：liuss
 * @创建时间： 2019/1/4
 */
public class QueryParams<K, V> extends HashMap<K, V> implements Map<K, V>, Cloneable, Serializable {

    private static final Log LOG = LogFactory.getLog(QueryParams.class);

    public QueryParams() {
        super();
    }

    public boolean isNotNull(String key) {
        return this.get(key) != null;
    }

    public Object convertPOJO(Class<?> clazz) {
        Object object = null;
        try {
            object = clazz.newInstance();
            BeanUtils.copyProperties(object, this);

        } catch (Exception e) {
            LOG.error(e);
        }
        return object;
    }

    public String getString(String key) {
        Object object = this.get(key);
        if (object != null) {
            if (object instanceof String) {
                return (String) object;
            } else {
                throw new ClassCastException();
            }
        } else {
            return null;
        }
    }

    public Integer getInteger(String key) {
        Object object = this.get(key);
        if (object != null) {
            if (object instanceof Integer) {
                return (Integer) object;
            } else {
                throw new ClassCastException();
            }
        } else {
            return null;
        }
    }

    public String toJson() {
        return JSONUtils.toJSONString(this);
    }
}
