class Solution {
    private static final Map<String, Integer> CATEGORY_ORDER = new HashMap<>();
    static {
        CATEGORY_ORDER.put("electronics", 1);
        CATEGORY_ORDER.put("grocery", 2);
        CATEGORY_ORDER.put("pharmacy", 3);
        CATEGORY_ORDER.put("restaurant", 4);
    }

    class Coupon {
        String code;
        String businessLine;
        
        Coupon(String code, String businessLine) {
            this.code = code;
            this.businessLine = businessLine;
        }
    }

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<Coupon> validCoupons = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {  
            if (isValidCode(code[i]) && 
                isValidBusinessLine(businessLine[i]) && 
                isActive[i]) {
                validCoupons.add(new Coupon(code[i], businessLine[i]));
            }
        }

        Collections.sort(validCoupons, new Comparator<Coupon>() {
            public int compare(Coupon c1, Coupon c2) {
                int categoryCompare = Integer.compare(
                    CATEGORY_ORDER.get(c1.businessLine), 
                    CATEGORY_ORDER.get(c2.businessLine)
                );
                
                if (categoryCompare != 0) {
                    return categoryCompare;
                }
                
                return c1.code.compareTo(c2.code);
            }
        });

        List<String> result = new ArrayList<>();
        for (Coupon coupon : validCoupons) {
            result.add(coupon.code);
        }

        return result;
    }

    public static boolean isValidCode(String code) {
        if (code == null || code.isEmpty()) {
            return false;
        }
    
        for (char c : code.toCharArray()) {
            if (!(Character.isLetterOrDigit(c) || c == '_')) {
                return false;
            }
        }
    
        return true;
    }

    public boolean isValidBusinessLine(String businessLine) {
        return businessLine.equals("electronics") || 
               businessLine.equals("grocery") || 
               businessLine.equals("pharmacy") || 
               businessLine.equals("restaurant");
    }
}