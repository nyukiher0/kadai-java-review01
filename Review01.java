public class Review01 {
    public static void main(String[] args) {
        // originalPrice : 定価を設定する。
        int originalPrice = 1500;
        double taxLate = 0.1;

        // consumptionTax : tax関数により消費税額を計算する
        int consumptionTax = tax(originalPrice, taxLate);

        // totalPrice : 合計金額を変数保持する。（）
        int totalPrice = originalPrice + consumptionTax;

        System.out.println(originalPrice + "円の商品の税込み価格は" + totalPrice + "円（消費税は" + consumptionTax + "円）です。");

    }

    // intで与えられる定価に対してdoubleの消費税率で積算し、intにキャストする。（i.e. 小数点以下切り捨て）
    public static int tax(int originalPrice, double taxLate) {
        int consumptionTax = (int) (taxLate * originalPrice);

        return consumptionTax;
    }
}