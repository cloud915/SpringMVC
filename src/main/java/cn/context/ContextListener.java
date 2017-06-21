package cn.context;

import cn.contract.factory.JAXBFactory;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;

/** 
 * @author jy_cheng 
 * @time   2016年8月3日
 */
public class ContextListener extends ContextLoaderListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		JAXBFactory.getInstance().init();
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		super.contextDestroyed(event);
	}

	
}

