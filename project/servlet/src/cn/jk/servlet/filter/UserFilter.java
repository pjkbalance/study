package cn.jk.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by jiakang on 2018/11/14.
 */
public class UserFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(" === init User filter === ");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(" === do User filter === ");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println(" === destroy User filter === ");

    }
}
