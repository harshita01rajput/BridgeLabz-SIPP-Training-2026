interface CouponValidator {

    // Abstract method
    void validateCoupon(String code);

    // Static method
    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public void validateCoupon(String code) {

        if (CouponValidator.isLengthValid(code) && code.startsWith("SAVE")) {
            System.out.println(code + " -> Valid Coupon");
        } else {
            System.out.println(code + " -> Invalid Coupon");
        }
    }
}

public class Coupon {

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "OFF20",
                "SAVE50",
                "ABC",
                "SAVE100"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {
            cart.validateCoupon(coupon);
        }
    }
}