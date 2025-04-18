package com.tennisfolio.Tennisfolio.common;

public enum RapidApi {
    ATPRANKINGS("atpRankings", "/tennis/rankings/atp"),
    TEAMDETAILS("teamDetails", "tennis/team/%s");

    private final String methodName;
    private final String param;

    RapidApi(String methodName, String param){
        this.methodName = methodName;
        this.param = param;
    }

    public String getMethodName(){
        return this.methodName;
    }

    public String getParam(){
        return this.param;
    }
    public String getParam(Object... params){
        return String.format(param, params);
    }
}
