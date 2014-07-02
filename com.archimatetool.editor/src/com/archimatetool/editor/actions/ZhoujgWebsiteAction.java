/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.actions;

import java.net.URL;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;


/**
 * Archi on the Web Action
 * 
 * @author Phillip Beauvoir
 */
public class ZhoujgWebsiteAction extends Action {
    
    public ZhoujgWebsiteAction() {
        super("企业架构框架和语言 TOGAF & ArchiMate 在线电子资料 by 周金根");
    }

    @Override
    public void run() {
        IWorkbenchBrowserSupport support = PlatformUI.getWorkbench().getBrowserSupport();
        try {
            IWebBrowser browser = support.getExternalBrowser();
            if(browser != null) {
                URL url = new URL("http://www.zhoujingen.cn/blog/3364.html"); //$NON-NLS-1$
                browser.openURL(url);
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
