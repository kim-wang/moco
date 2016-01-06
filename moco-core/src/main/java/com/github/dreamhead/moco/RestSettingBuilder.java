package com.github.dreamhead.moco;

public interface RestSettingBuilder {
    RestSettingResponseBuilder request(final RequestMatcher matcher);
    RestSetting response(final ResponseHandler handler, final ResponseHandler... handlers);
}
