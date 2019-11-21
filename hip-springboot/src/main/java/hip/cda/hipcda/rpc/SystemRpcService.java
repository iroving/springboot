package hip.cda.hipcda.rpc;

import com.google.common.collect.Maps;
import ctd.annotation.RpcClass;
import ctd.net.rpc.Client;
import ctd.util.JSONUtils;
import ctd.util.annotation.RpcService;

import java.util.Map;

/**
 * @author:
 * @date:
 * @description: 对外提供的rpc接口
 **/
@RpcClass(serviceID="systemService")
public class SystemRpcService {

    @RpcService
    public String quertSystem(Object param) throws Exception {
        return "1";
    }

}
