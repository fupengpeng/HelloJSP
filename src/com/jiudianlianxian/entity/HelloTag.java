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
 * @Description: �Զ���HelloTag��ǩ
 * @Company: �����ŵ�������Ϣ�������޹�˾
 * @ProjectName: HelloJSP
 * @author fupengpeng
 * @date 2017��8��22�� ����9:57:23
 *
 */
public class HelloTag extends TagSupport{
	
	/*
	       ���´�����д��doTag()������������ʹ����getJspContext()��������ȡ��ǰ��JspContext���󣬲���"Hello Custom Tag!"���ݸ�JspWriter����
���������࣬�����临�Ƶ���������CLASSPATHĿ¼�С���󴴽����±�ǩ�⣺<Tomcat��װĿ¼>webapps\ROOT\WEB-INF\custom.tld��
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
      pageContext.getResponse().getWriter().write("������д��һ�����Ϣ��ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return super.doStartTag();
    }
}
