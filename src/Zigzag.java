public class Zigzag {
    public String convert(String s, int nRows) {
    	// boundary case
    	if (nRows <= 1) {
    		return s;
    	}
    	
        int interval = nRows * 2 - 2;
        int beginIndex = 0;
        String result = "";
        while (beginIndex < nRows) {
        	if (beginIndex >= s.length()){
        		break;
        	}
            if (beginIndex==0 || beginIndex==nRows-1){
                result += printLineForBegOrEndRow(s,beginIndex,interval);
            } else {
                result += printLineForMiddleRows(s,beginIndex,interval);
            }
            beginIndex ++;
        }
        return result;
    }
    
    //helper
    public String printLineForBegOrEndRow(String s, int beginIndex, int interval) {
        String result = "";
        for (int i = beginIndex; i < s.length();) {
            result = result + s.charAt(i);
            i += interval;
        }
        return result;
    }
    
    public String printLineForMiddleRows(String s, int beginIndex, int interval) {
        String result = "";
        int i;
        for (i = beginIndex; i < s.length() - interval;) {
            result = result + s.charAt(i) + s.charAt(i+interval-beginIndex*2);
            i += interval;
        }
        // for the last iteration
        result = result + s.charAt(i);
        if (i+interval-beginIndex*2 < s.length()) {
            result = result + s.charAt(i+interval-beginIndex*2);
        }
        return result;
    }
    
    public static void main(String[] args) {
    	Zigzag zz = new Zigzag();
    	System.out.println(zz.convert("ABCDE", 4));
    }
}
