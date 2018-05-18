package edu;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class TestRequestListener
 *
 */
@WebListener()
public class TestRequestListener implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public TestRequestListener() {
        // TODO Auto-generated constructor stub
    	System.out.println("HttpServletRequest ��ü ����");
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("HttpServletRequest ��ü �ʱ�ȭ");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("HttpServletRequest ��ü ����");
    }
	
}
