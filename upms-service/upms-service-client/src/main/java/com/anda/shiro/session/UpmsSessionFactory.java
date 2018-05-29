package com.anda.shiro.session;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.SessionContext;
import org.apache.shiro.session.mgt.SessionFactory;
import org.apache.shiro.web.session.mgt.WebSessionContext;

import javax.servlet.http.HttpServletRequest;

public class UpmsSessionFactory implements SessionFactory{
    @Override
    public Session createSession(SessionContext sessionContext) {
        UpmsSession upmsSession = new UpmsSession();
        if (null != sessionContext && sessionContext instanceof WebSessionContext) {
            WebSessionContext webSessionContext = (WebSessionContext) sessionContext;
            HttpServletRequest request = (HttpServletRequest) webSessionContext.getServletRequest();
            if (null != request) {
                upmsSession.setHost(request.getRemoteAddr());
                upmsSession.setUserAgent(request.getHeader("User-Agent"));
            }
        }
        return upmsSession;
    }
}
