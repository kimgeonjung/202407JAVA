package drive;

import shop.Product;
import shop.ProductDAO;

public class Ex1 {
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		Product product = new Product(2, "볼펜", "낫밷", 6000, 6); // 업데이트 할 내용
		dao.updateProduct(product);
	}
}
