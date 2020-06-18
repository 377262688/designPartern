package com.york.designpattern.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author york
 * @create 2020-06-18 09:24
 **/
public class RuleConfigParserFactory {

    private static final Map<String,IRuleConfigParse> cachePasers = new HashMap<String, IRuleConfigParse>();

    static {
        cachePasers.put("json",new JsonRuleConfigPaser());
        cachePasers.put("xml",new XmlRuleConfigPaser());
    }

    public static IRuleConfigParse createParser(String configFormat) {
        if (configFormat == null) {
            return null;
        }
        return cachePasers.get(configFormat);
    }
}
