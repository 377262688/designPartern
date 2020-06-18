package com.york.designpattern.factory;

/**
 * @author york
 * @create 2020-06-18 09:21
 **/

public class RuleConfigSource {

    public RuleConfig load(String ruleConfigPath) {
        String ruleConfigExtention = getFileExtension(ruleConfigPath);
        IRuleConfigParse iRuleConfigParse = RuleConfigParserFactory.createParser(ruleConfigExtention);
        RuleConfig ruleConfig = iRuleConfigParse.parse(ruleConfigPath);
        return ruleConfig;
    }

    private String getFileExtension(String ruleConfigPath) {
        return "json";
    }
}
