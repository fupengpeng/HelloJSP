package com.jiudianlianxian.entity;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;


/**
 * 
 * @Title: HelloTag
 * @Description: 自定义HelloTag标签
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: HelloJSP
 * @author fupengpeng
 * @date 2017年8月22日 上午9:57:23
 *
 */
public class HelloTag extends TagSupport{
	
	/*
	       以下代码重写了doTag()方法，方法中使用了getJspContext()方法来获取当前的JspContext对象，并将"Hello Custom Tag!"传递给JspWriter对象。
编译以上类，并将其复制到环境变量CLASSPATH目录中。最后创建如下标签库：<Tomcat安装目录>webapps\ROOT\WEB-INF\custom.tld。
	 */
	
	
	/*
	 * (non-Javadoc)
	 * @see javax.servlet.jsp.tagext.SimpleTagSupport#doTag()
	 */
//	public void doTag() throws JspException, IOException {
//	    JspWriter out = getJspContext().getOut();
//	    out.println("Hello Custom Tag!");
//	  }
	
	private PageContext pageContext;
    @Override
    public void setPageContext(PageContext pageContext) {
        this.pageContext=pageContext;
    }
    @Override
    public int doStartTag() throws JspException {
        
    try {
      pageContext.getResponse().getWriter().write("这是我写的一大段信息：ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return super.doStartTag();
    }
}
