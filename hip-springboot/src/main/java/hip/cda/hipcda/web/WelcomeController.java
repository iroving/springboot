package hip.cda.hipcda.web;

import hip.cda.hipcda.common.QueryParams;
import hip.cda.hipcda.common.Result;
import hip.cda.hipcda.service.TestService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    private final static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @Autowired
    TestService testService;

    /**
     * 返回json字符串
     * @return
     */
    @RequestMapping("getWelcomeInfo")
    @ResponseBody
    public Result getWelcomeInfo(){
        return testService.findById("2");
    }


    /**
     * 返回json字符串
     * @return
     */
    @RequestMapping("/getTest/{id}")
    @ResponseBody
    public Result getTest(@PathVariable("id") String id){

        return testService.findById(id);
    }


    /**
     *
     */
    @PostMapping(value = "/getSystem")
    @ResponseBody
    public Result getSystem(@RequestBody QueryParams queryParams) {
        String id = queryParams.get("id") + "";
        return testService.findById(id);
    }

}
