package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productorders = new ProductOrder[3];

        // 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        // 첫 번째 상품 주문 정보 입력
        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        productorders[0] = order1;

        // 두 번째 상품 주문 정보 입력
        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        productorders[1] = order2;

        // 세 번째 상품 주문 정보 입력
        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        productorders[2] = order3;

        // 상품 주문 정보와 최종 금액 출력
        int totalAmount = 0;
        for (ProductOrder order : productorders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
            totalAmount += order.price * order.quantity;
        }

        System.out.println("총 결제 금액 : " + totalAmount);
    }
}
