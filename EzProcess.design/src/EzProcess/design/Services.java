package EzProcess.design;

import org.eclipse.emf.ecore.EObject;

import ezProcess.*;
/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public boolean freeTextRating(FreeTextArea area) {
    	
    	if (area.isRating()) {
    		
    		if (area.getHasRating().size() > 0) {
    			return true;
    		}
    		else {
    			return false;
    		}
    	}else {
    		return true;
    	}	
    }
    
    public boolean freeInputRating(InputField input) {
    	
    	if (input.isRating()) {
    		
    		if (input.getHasRating().size() > 0) {
    			return true;
    		}
    		else {
    			return false;
    		}
    	}else {
    		return true;
    	}	
    }
    
}
